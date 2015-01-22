package com.firstExercise.tdd;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class NumberConverter {
	private static final String[] tensNames = {
	    "",
	    " Ten",
	    " Twenty",
	    " Thirty",
	    " Forty",
	    " Fifty",
	    " Sixty",
	    " Seventy",
	    " Eighty",
	    " Ninety"
	  };

	  private static final String[] numNames = {
	    "",
	    " One",
	    " Two",
	    " Three",
	    " Four",
	    " Five",
	    " Six",
	    " Seven",
	    " Eight",
	    " Nine",
	    " Ten",
	    " Eleven",
	    " Twelve",
	    " Thirteen",
	    " Fourteen",
	    " Fifteen",
	    " Sixteen",
	    " Seventeen",
	    " Eighteen",
	    " Nineteen"
	  };
	
	
	public NumberConverter(){
		
	}

	private static String convertLessThanOneThousand(int number) {
		String soFar;

		if (number % 100 < 20) {
			soFar = numNames[number % 100];
			number /= 100;
		} else {
			soFar = numNames[number % 10];
			number /= 10;

			soFar = tensNames[number % 10] + soFar;
			number /= 10;
		}
		if (number == 0)
			return soFar;
		return numNames[number] + " Hundred" + soFar;
	}

	public String transformNumberToDollars(double number) {
		//Numbers from zero to 999999999999
		if (number == 0) {
			return "Zero" + "dollars";
		}
		else{
			if(hasMoreDigits(number)){
				return "Has more decimal numbers than permitted";
			}
		}

		String snumber = Double.toString(number);

		// pad with "0"
		String mask = "000000000000";
		DecimalFormat df = new DecimalFormat(mask);
		df.setRoundingMode(RoundingMode.DOWN);
		snumber = df.format(number);

		// XXXnnnnnnnnn
		int billions = Integer.parseInt(snumber.substring(0, 3));
		// nnnXXXnnnnnn
		int millions = Integer.parseInt(snumber.substring(3, 6));
		// nnnnnnXXXnnn
		int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
		// nnnnnnnnnXXX
		int thousands = Integer.parseInt(snumber.substring(9, 12));

		String tradBillions;
		switch (billions) {
		case 0:
			tradBillions = "";
			break;
		case 1:
			tradBillions = convertLessThanOneThousand(billions) + " Billion ";
			break;
		default:
			tradBillions = convertLessThanOneThousand(billions) + " Billion ";
		}
		String result = tradBillions;

		String tradMillions;
		switch (millions) {
		case 0:
			tradMillions = "";
			break;
		case 1:
			tradMillions = convertLessThanOneThousand(millions) + " Million ";
			break;
		default:
			tradMillions = convertLessThanOneThousand(millions) + " Million ";
		}
		result = result + tradMillions;

		String tradHundredThousands;
		switch (hundredThousands) {
		case 0:
			tradHundredThousands = "";
			break;
		case 1:
			tradHundredThousands = "One Thousand ";
			break;
		default:
			tradHundredThousands = convertLessThanOneThousand(hundredThousands)
					+ " Thousand ";
		}
		result = result + tradHundredThousands;

		String tradThousand;
		tradThousand = convertLessThanOneThousand(thousands);
		result = result + tradThousand;

		// remove extra spaces!
		result  = result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ");
		 
		//add numbers after comma
		result = result + addAfterComma(number);
		return result + " dollars";
	}

	private String commaNumbers(double number){
		String s = String.valueOf(number);
		String[] result = s.split("\\.");
		return result[1];
	}
	
	private boolean hasMoreDigits(double number) {
		String commaNumbers = commaNumbers(number);
		if(commaNumbers.length() > 2)
			return true;
		return false;
	}

	private String addAfterComma(double number) {
		String commaNumber = commaNumbers(number);
		if(!commaNumber.equals("0")){
			commaNumber = " " + commaNumber;
			commaNumber += "\\100";
			return commaNumber;
		}else
			return "";
	}
}
