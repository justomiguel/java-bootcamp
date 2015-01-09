package oopExercises.ej1_6;

import java.util.Scanner;

public class MyComplexApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Complex number 1 \n (real part):");
		double real = sc.nextDouble();
		System.out.print("(imaginary part):");
		double imag = sc.nextDouble();

		MyComplex number1 = new MyComplex(real, imag);

		System.out.print("Enter Complex number 1 \n (real part):");
		real = sc.nextDouble();
		System.out.print("(imaginary part):");
		imag = sc.nextDouble();

		MyComplex number2 = new MyComplex(real, imag);

		String text1 = "NOT";

		if (number1.isReal())
			text1 = "";

		System.out.println("Number1 is:" + number1 + "\n" + number1 + " is " + text1 + " a pure real number");

		text1 = "NOT";

		if (number1.isImaginary())
			text1 = "";

		System.out.println("Number1 is:" + number1 + "\n" + number1 + " is" + text1 + " a pure imaginary number");

		text1 = "NOT";

		if (number2.isReal())
			text1 = "";

		System.out.println("Number1 is:" + number2 + "\n" + number2 + " is " + text1 + " a pure real number");

		text1 = "NOT";

		if (number2.isImaginary())
			text1 = "";

		System.out.println("Number1 is:" + number2 + "\n" + number2 + " is" + text1 + " a pure imaginary number");

	}

}
