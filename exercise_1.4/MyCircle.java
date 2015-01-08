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
public class MyCircle {

    private MyPoint center;
    private int radius;

//A constructor that constructs a circle with the given center's (x, y) and radius.
    public MyCircle(int x, int y, int radius) {
        this.radius = radius;
        this.center = new MyPoint(x, y);
    }

    public MyCircle(MyPoint center, int radius) {
        this.radius = radius;
        this.center = center;
    }

    public MyPoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
//"Circle @ (x, y) radius=r".

    @Override
    public String toString() {
        return "Circle @" + center + " radius = " + radius;
    }

    public double getArea() {
        //pi * radio ** 2
        return Math.PI * Math.pow(radius, 2);
    }
}
