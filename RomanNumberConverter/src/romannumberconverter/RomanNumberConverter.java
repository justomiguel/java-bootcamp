package romannumberconverter;

/**
 *
 * @author Santiago
 */
public class RomanNumberConverter {

    private static String romanNumber;

    public static int convertRoman(String r) {
        int decimal = 0;
        char[] roman = r.toUpperCase().toCharArray();
        for (int i = 0; i < roman.length - 1; i++) {
            int currentValue = RomanNumber.getRomanValueFromChar(roman[i]).getValue();
            int nextValue = RomanNumber.getRomanValueFromChar(roman[i + 1]).getValue();
            if (currentValue < nextValue) {
                decimal -= currentValue;
            } else {
                decimal += currentValue;
            }
        }
        int aux = r.length() - 1;
        decimal += RomanNumber.getRomanValueFromChar(r.charAt(aux)).getValue();
        decimal += singleChar.valueOf(r.charAt(aux)).getValue();
        return decimal;
    }

    public static String convertDecimal(int d) {
        StringBuilder aux = new StringBuilder();
        while (d > 1000) {
            aux.append("M");
            d -= 1000;
        }
        while (d >= 900) {
            aux.append("CM");
            d -= 900;
        }
        while (d >= 500) {
            aux.append("D");
            d -= 500;
        }
        while (d >= 400) {
            aux.append("CD");
            d -= 400;
        }
        while (d >= 100) {
            aux.append("C");
            d -= 100;
        }
        while (d >= 90) {
            aux.append("XC");
            d -= 90;
        }
        while (d >= 50) {
            aux.append("L");
            d -= 50;
        }
        while (d >= 40) {
            aux.append("XL");
            d -= 40;
        }
        while (d >= 10) {
            aux.append("X");
            d -= 10;
        }
        while (d >= 9) {
            aux.append("IX");
            d -= 9;
        }
        while (d >= 5) {
            aux.append("V");
            d -= 5;
        }
        while (d >= 4) {
            aux.append("IV");
            d -= 4;
        }
        while (d >= 1) {
            aux.append("I");
            d -= 1;
        }

        romanNumber = aux.toString();
        return romanNumber;
    }

    public static void main(String[] args) {
        
        System.out.println(convertRoman("M"));
        System.out.println(convertRoman("CCXXII"));
        System.out.println(convertRoman("MCXIV"));

        System.out.println(convertDecimal(1666));
        System.out.println(convertDecimal(4));
        System.out.println(convertDecimal(2500));
    }

}
