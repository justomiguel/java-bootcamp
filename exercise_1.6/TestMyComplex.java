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
public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex complex = new MyComplex(3.0, 2.0);
        System.out.println(complex.toString());
        
        MyComplex complex2 = new MyComplex(1.0, -2.0);
        //Substract
        System.out.println(complex.susComplex(complex2));
        //Add
        System.out.println(complex.addComplex(complex2));
        //equals
        System.out.println(complex.equals(complex2));
        
        System.out.println(complex.divideBy(complex2));
        
        //System.out.println(complex.multiplyWith(complex2));
        

    }
    
}
