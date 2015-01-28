/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumberconversion;

/**
 *
 * @author roberta
 */
public class RomanNumberConversion {

    private String romanNumber;

    public static String decToRoman(int dec) {
        if (dec <= 0) {
            return " There isn't zero in Roman number System";
        }
        StringBuilder resul = new StringBuilder();
        while (dec >= 1000) {
            resul.append("M");
            dec -= 1000;
        }
        while (dec >= 900) {
            resul.append("CM");
            dec -= 900;
        }
        while (dec >= 500) {
            resul.append("D");
            dec -= 500;
        }
        while (dec >= 400) {
            resul.append("CD");
            dec -= 400;
        }
        while (dec >= 100) {
            resul.append("C");
            dec -= 100;
        }
        while (dec >= 90) {
            resul.append("XC");
            dec -= 90;
        }
        while (dec >= 50) {
            resul.append("L");
            dec -= 50;
        }
        while (dec >= 40) {
            resul.append("XL");
            dec -= 40;
        }
        while (dec >= 10) {
            resul.append("X");
            dec -= 10;
        }
        while (dec >= 9) {
            resul.append("IX");
            dec -= 9;
        }
        while (dec >= 5) {
            resul.append("V");
            dec -= 5;
        }
        while (dec >= 4) {
            resul.append("IV");
            dec -= 4;
        }
        while (dec >= 1) {
            resul.append("I");
            dec -= 1;
        }

        return resul.toString();

    }

    //	  Returns a string containing the entered Roman numeral in numeral form.
    public String romanToDec(String s) {

        int resul = 0;
        int last_digit = 0;
        int current_digit = 0;

        for (int i = 0; i < s.length(); i++) {
            current_digit = RomanNumber.parse(s.substring(i, i + 1));

            //This is the tricky part.
            //If the last number is smaller than the curren number, subtract the last number from the current number
            //Otherwise, just add the current number. We must also skip the first number from this rule simply because
            //e.g. someone enters 1799 in which case it would subtract 1 from 7
            if (last_digit < current_digit && last_digit != 0) {
                current_digit -= last_digit;
                resul -= last_digit;
                resul += current_digit;
                last_digit = current_digit;
                current_digit = 0;
            } else {
                last_digit = current_digit;
                resul += current_digit;
                current_digit = 0;
            }
        }

        return String.valueOf(resul);

    }

}
