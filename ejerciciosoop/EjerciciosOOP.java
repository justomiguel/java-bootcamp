/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosoop;

import java.util.Arrays;

/**
 *
 * @author Santiago
 */
public class EjerciciosOOP {

    public static void main(String[] args) {
        //CIRCLE CLASS TEST
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " 
         + c1.getRadius() + " and area of " + c1.getArea());
      
        //AUTHOR CLASS TEST
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        System.out.println(anAuthor);   // call toString()
        anAuthor.setEmail("paul@nowhere.com");
        System.out.println(anAuthor);
        
        //BOOK CLASS TEST
        Book aBook = new Book("Java for dummy", anAuthor, 19.95); 
        System.out.println(aBook);
       
        //MYPOINT CLASS TEST
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        MyPoint p3 = new MyPoint(5, 5);
        System.out.println(p1.distance(p2)); 
        System.out.println(p1.distance(5, 6));
       
        MyPoint[] points = new MyPoint[10];
                for (int i = 0; i < points.length ; ++i ) {
                    points[i] = new MyPoint(i+1,i+1);
                }
                System.out.println(Arrays.toString(points));
        
        //MYTRIANGLE CLASS TEST        
        MyTriangle triangle = new MyTriangle(p1,p2,p3);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        triangle.pintType();
        
        //MYCOMPLEX CLASS TEST
        MyComplex complex = new MyComplex(5.0, 4.0);
        MyComplex complex2 = new MyComplex(5.0, 0);
        MyComplex complex3 = new MyComplex(0, 4.0);
        
        System.out.println(complex);
        
        System.out.println(complex.isReal());
        System.out.println(complex3.isImaginary());
        
        System.out.println(complex.add(complex2));
        System.out.println(complex.multiplyWith(complex3));
        System.out.println(complex.divideBy(complex));
    }
    
}
