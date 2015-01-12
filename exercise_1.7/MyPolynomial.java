/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypolynomialproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author roberta
 */
public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public MyPolynomial(String filename) {
        Scanner in = null;
        try {
            in = new Scanner(new File(filename));  // open file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int degree = in.nextInt();      // read the degree
        coeffs = new double[degree + 1];  // allocate the array
        for (int i = 0; i < coeffs.length; ++i) {
            coeffs[i] = in.nextDouble();
        }
    }

//A method getDegree() that returns the degree of this polynomial.
    public int getDegree() {
        return coeffs.length - 1;
    }

    //A method toString() that returns "cnx^n+cn-1x^(n-1)+...+c1x+c0".
    @Override
    public String toString() {
        String resul = "";
        int degree = getDegree();
        for (int i = 0; i < coeffs.length; i++) {
            resul = resul + "+" + coeffs[i] + "X^" + (degree - i);
        }
        return resul;

    }
//A method evaluate(double x) that evaluate the polynomial for the given x, by substituting the given x into the polynomial expression.

    public double evaluate(double x) {
        double resul = 0;
        int degree = getDegree();
        for (int i = 0; i < coeffs.length; i++) {
            resul = resul + coeffs[i] * (Math.pow(x, degree - i));
        }
        return resul;
    }

//Methods add() and multiply() that adds and multiplies this polynomial with the given MyPolynomial instance another, 
//and returns a new MyPolynomial instance that contains the result.
    public MyPolynomial addPolynomial(MyPolynomial another) {

        double[] resul = this.coeffs;
        double[] bPol = another.coeffs;
        int diffDegree = this.getDegree() - another.getDegree();
        if (this.getDegree() < another.getDegree()) {
            resul = another.coeffs;
            bPol = this.coeffs;
            diffDegree = another.getDegree() - this.getDegree();

        }

        for (int i = 0; i < resul.length; i++) {
            if (i - diffDegree >= 0) {
                resul[i] = resul[i] + bPol[i - diffDegree];
            }

        }
        MyPolynomial resultPolynomial = new MyPolynomial(resul);
        return resultPolynomial;
    }

    public MyPolynomial multiply(MyPolynomial another) {
       
        int degree = this.getDegree() + another.getDegree();
        double[] resul = new double[degree+1];
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= another.getDegree(); j++) {

                resul[i + j] += this.coeffs[i] * another.coeffs[j];
            }

        }

        MyPolynomial resultPolynomial = new MyPolynomial(resul);
        return resultPolynomial;

    }

}

