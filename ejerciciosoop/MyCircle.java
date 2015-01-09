/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosoop;

/**
 *
 * @author Santiago
 */
public class MyCircle {
    public MyPoint center;
    public int radius;

    @Override
    public String toString() {
        return "Circle @ (" + center.getX() + "," + center.getY() + ") radius=" + radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyCircle(MyPoint center) {
        this.center = center;
        this.radius = 5;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
}
