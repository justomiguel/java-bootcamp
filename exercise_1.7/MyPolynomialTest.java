/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypolynomialproject;

/**
 *
 * @author roberta
 */
public class MyPolynomialTest {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(2,3,1);
        MyPolynomial p2 = new MyPolynomial(1,1,2);
        System.out.println(p1.multiply(p2));
       // System.out.println(p1);
    }
}
