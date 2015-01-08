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
public class TestMyPoint {

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println(p1);

        System.out.println(p1.distance(p2));    // Version: distance(MyPoint another)
        System.out.println(p1.distance(5, 6));  // Version: distance(int x, int y)

        //2..
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new MyPoint(i, i);
        }

    }

}
