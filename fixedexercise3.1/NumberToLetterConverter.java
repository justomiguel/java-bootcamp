/**
 *
 * @author roberta
 */
public abstract class NumberToLetterConverter {

    private static final String[] UNITS = {"", "One ", "Two ", "Three ",
        "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ",
        "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen", "Twenty"};
    private static final String[] TENS = {"Twenty", "Thirty ", "Forty ",
        "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety ",
        "One Hundred "};
    private static final String[] HUNDREDS = {"One Hundred ", "Two Hundred ",
        "Three Hundred ", "Four Hundred ", "Five Hundred ", "Six Hundred ",
        "Seven Hundred ", "Eight Hundred ", "Nine Hundred  "};

    /**
     * El número es válido si está entre 0 y 999.999.999
     */
    public static String convertNumberToLetter(double number)
            throws NumberFormatException {
        String converted = new String();

        // validate if a legal number
        if (number < 0) {
            throw new IllegalArgumentException("Can't convert negative numbers");
        }
        double doubleNumber = Math.rint(number * 100) / 100;
        if (doubleNumber > 999999999) {
            throw new NumberFormatException(
                    "The number is greater than 999.999.999, "
                    + "isn't possible to convert");
        }

        String splitNumber[] = String.valueOf(doubleNumber).replace('.', '#').split("#");

        // Descompone el trio de millones 
        int millon = Integer.parseInt(String.valueOf(getDigitAt(splitNumber[0],
                8))
                + String.valueOf(getDigitAt(splitNumber[0], 7))
                + String.valueOf(getDigitAt(splitNumber[0], 6)));
        if (millon == 1) {
            converted = "A million ";
        }
        if (millon > 1) {
            converted = convertNumber(String.valueOf(millon)) + "Millions ";
        }

        // Descompone el trio de miles - 
        int miles = Integer.parseInt(String.valueOf(getDigitAt(splitNumber[0],
                5))
                + String.valueOf(getDigitAt(splitNumber[0], 4))
                + String.valueOf(getDigitAt(splitNumber[0], 3)));
        if (miles == 1) {
            converted += "One Thousand "; 
        }
        if (miles > 1) {
            converted += convertNumber(String.valueOf(miles)) + "Thousand ";
        }

        // Descompone el ultimo trio de unidades
        int cientos = Integer.parseInt(String.valueOf(getDigitAt(
                splitNumber[0], 2))
                + String.valueOf(getDigitAt(splitNumber[0], 1))
                + String.valueOf(getDigitAt(splitNumber[0], 0)));
        if (cientos == 1) {
            converted += "One";
        }

        if (millon + miles + cientos == 0) {
            converted += "Zero dollars";
        }
        if (cientos > 1) {
            converted += convertNumber(String.valueOf(cientos));
        }

        // Descompone los centavos
        int centavos = Integer.parseInt(String.valueOf(getDigitAt(
                splitNumber[1], 2))
                + String.valueOf(getDigitAt(splitNumber[1], 1))
                + String.valueOf(getDigitAt(splitNumber[1], 0)));
        if (centavos == 1) {
            converted += " With a cent";
        }
        if (centavos > 1) {
            converted += "and " + centavos
                    + "/100 Dollars";
        }

        return converted;
    }

    /**
     * Convierte los trios de números que componen las unidades, las decenas y
     * las centenas del número.
     */
    private static String convertNumber(String number) {
        if (number.length() > 3) {
            throw new NumberFormatException(
                    "The maximum length must be 3 digits");
        }

        String output = new String();
        if (getDigitAt(number, 2) != 0) {
            output = HUNDREDS[getDigitAt(number, 2) - 1];
        }

        int k = Integer.parseInt(String.valueOf(getDigitAt(number, 1))
                + String.valueOf(getDigitAt(number, 0)));

        if (k <= 20) {
            output += UNITS[k];
        } else {
            if (k > 30 && getDigitAt(number, 0) != 0) {
                output += TENS[getDigitAt(number, 1) - 2] + "And "
                        + UNITS[getDigitAt(number, 0)];
            } else {
                output += TENS[getDigitAt(number, 1) - 2]
                        + UNITS[getDigitAt(number, 0)];
            }
        }

        // Caso especial con 100
        if (getDigitAt(number, 2) == 1 && k == 0) {
            output = "One Hundred";
        }

        return output;
    }

    /**
     * Retorna el dígito numerico en la posición indicada de derecha a izquierda
     */
    private static int getDigitAt(String origin, int position) {
        if (origin.length() > position && position >= 0) {
            return origin.charAt(origin.length() - position - 1) - 48;
        }
        return 0;
    }
}
