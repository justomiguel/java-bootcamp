/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberta
 */
public class TestCircle {        // save as "TestCircle.java"

    public static void main(String[] args) {
      // Declare and allocate an instance of class Circle called c1
        //  with default radius and color
        Circle c1 = new Circle();
        // Use the dot operator to invoke methods of instance c1.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

      // Declare and allocate an instance of class circle called c2
        //  with the given radius and default color
        Circle c2 = new Circle();
        // Use the dot operator to invoke methods of instance c2.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
        
      // 3)  System.out.println(c1.radius); No, I can't because it has private access in Circle
      //  c1.radius=5.0;
      
      // 4)          
        Circle c3 = new Circle();   // construct an instance of Circle
        c3.setRadius(5.0);          // change radius
        c3.setColor("green");           // change color   
     
     /**5) toString   
        Circle c6 = new Circle(5.0);
        System.out.println(c1.toString());
        
        Circle c5 = new Circle(1.2);
        System.out.println(c5.toString());  // explicit call
        System.out.println(c5);             // println() calls toString() implicitly, same as above
        System.out.println("Operator '+' invokes toString() too: " + c2);  // '+' invokes toString() too */


    }
}
