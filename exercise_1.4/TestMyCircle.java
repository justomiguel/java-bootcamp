/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypointproject;

/**
 *
 * @author roberta
 */
public class TestMyCircle {

    public static void main(String[] args) {

        MyCircle circle = new MyCircle(2, 2, 4);
        System.out.println(circle);

        circle = new MyCircle(new MyPoint(1, 2), 6);
        System.out.println(circle);
        
        System.out.println(circle.getArea());

    }

}
