/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mycomplexproject;

/**
 *
 * @author roberta
 */
public class MyComplexApp {
    public static void main(String[] args) {
        MyComplex cx1 = new MyComplex(1.1, 2.2);
        MyComplex cx2 = new MyComplex(3.3, 4.4);
        
        System.out.println("Complex 1 is:" + cx1.toString());
        System.out.println(cx1.toString() + " Is a real Complex 1?: " + cx1.isReal());
        System.out.println(cx1.toString() + " Is a pure imaginary number? " + cx1.isImg());
        
        System.out.println("Complex 2 is:" + cx2.toString());
        System.out.println(cx2.toString() + " Is a real Complex 2?: " + cx2.isReal());
        System.out.println(cx2.toString() + " Is a pure imaginary number? " + cx2.isImg());
        
        System.out.println(cx1.toString() + "Iqual to" + cx2.toString() + "?:" + cx1.equals(cx2));
        System.out.println(cx1.toString() + "+" + cx2.toString() + "=" + cx1.addComplex(cx2));
        System.out.println(cx1.toString() + "-" + cx2.toString() + "=" + cx1.susComplex(cx2));
        
    }
}
