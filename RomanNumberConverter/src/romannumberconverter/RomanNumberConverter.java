/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumberconverter;

/**
 *
 * @author Santiago
 */
public class RomanNumberConverter {

    private static String romanNumber;

    private static int singleChar(char x) {
        switch (x) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                throw new IllegalArgumentException("Roman letters are: I V X L C D or M");
        }
    }

    public static int convertRoman(String r) {
        int decimal = 0;
        String roman = r.toUpperCase();
        for (int i = 0; i < roman.length() - 1; i++) {
            if (singleChar(roman.charAt(i)) < singleChar(roman.charAt(i + 1))) {
                decimal -= singleChar(roman.charAt(i));
            } else {
                decimal += singleChar(roman.charAt(i));
            }
        }
        decimal += singleChar(roman.charAt(roman.length() - 1));
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
        System.out.println(convertRoman("ccxxii"));
        System.out.println(convertRoman("mmclx"));
        System.out.println(convertRoman("MDCaLXXIV"));
        System.out.println(convertDecimal(1666));
        System.out.println(convertDecimal(4));
        System.out.println(convertDecimal(2500));
    }

}
