/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

/**
 *
 * @author Santiago
 */
public class AmountToText {

    public static String text = "";
    private static final String[] tens = {
        "",
        " ten",
        " twenty",
        " thirty",
        " forty",
        " fifty",
        " sixty",
        " seventy",
        " eighty",
        " ninety"
    };

    private static final String[] numbers = {
        "",
        " one",
        " two",
        " three",
        " four",
        " five",
        " six",
        " seven",
        " eight",
        " nine",
        " ten",
        " eleven",
        " twelve",
        " thirteen",
        " fourteen",
        " fifteen",
        " sixteen",
        " seventeen",
        " eighteen",
        " nineteen"
    };

    public AmountToText(double number) {
        convert(number);
    }

    private static String convertLessThanOneThousand(int number) {

        if (number % 100 < 20) {
            text = numbers[number % 100];
            number /= 100;
        } else {
            text = numbers[number % 10];
            number /= 10;

            text = tens[number % 10] + text;
            number /= 10;
        }
        if (number == 0) {
            return text;
        }

        return numbers[number] + " hundred" + text;
    }

    private static String convertDecimals(int number) {

        if (number == 0) {
            return "zero";
        }
        if (number % 100 < 20) {
            text = numbers[number % 100];
            number /= 100;
        } else {
            text = numbers[number % 10];
            number /= 10;

            text = tens[number % 10] + text;
            number /= 10;
        }
        if (number == 0) {
            return text;
        }
        return (numbers[number] + " hundred" + text);
    }

    public static String convert(double number) {

        StringBuilder res = new StringBuilder();
        if (number == 0) {
            text = "zero";
            return res.append("zero").toString();
        }
        if (number > 999999 || number < 0) {
            text = "Error number must be lower than 999999 and positive";
            return res.append("Error number must be lower than 999999").toString();
        }
        String sss = String.valueOf(number);
        String[] nums = sss.split("\\.");

        int money = Integer.parseInt(nums[0]);
        int decimal = Integer.parseInt(nums[1]);

        if (money > 999) {
            int aux = money / 1000;
            res.append(convertLessThanOneThousand(aux));
            res.append(" thousands");
            res.append(convertLessThanOneThousand(money % 1000));
            res.append(" and ");
            res.append(convertDecimals(decimal));
            res.append(" cents");
        } else {

            res.append(convertLessThanOneThousand(money));
            res.append(" and ");
            res.append(convertDecimals(decimal));
            res.append(" cents");
        }
        text = res.toString();
        return res.toString();
    }

    public static String getText() {
        return text;
    }

}
