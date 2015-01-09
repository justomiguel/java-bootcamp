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
public class TestMyTriangle {

    public static void main(String[] args) {
        MyTriangle triangleIsosceles = new MyTriangle(new MyPoint(1, 1), new MyPoint(3, 1), new MyPoint(2, 2));
        System.out.println(triangleIsosceles.printType());
        System.out.println("Perimeter:" + triangleIsosceles.getPerimeter());

        MyTriangle triangleScalene = new MyTriangle(new MyPoint(1, 1), new MyPoint(3, 1), new MyPoint(3, 2));
        System.out.println(triangleScalene.printType());
        System.out.println("Perimeter:" + triangleScalene.getPerimeter());

    }
}
