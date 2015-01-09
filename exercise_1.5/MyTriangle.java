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
public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    //A constructor that constructs a MyTriangle with three points v1=(x1, y1), v2=(x2, y2), v3=(x3, y3).
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {

        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    //An overloaded constructor that constructs a MyTriangle given three instances of MyPoint.
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    //A toString() method that returns a string description 
    //of the instance in the format "Triangle @ (x1, y1), (x2, y2), (x3, y3)"
    @Override
    public String toString() {
        return "Triangle @" + v1 + "," + v2 + "," + v3;
    }

    //A getPerimeter() method that returns the length of the perimeter in double. 
    //You should use the distance() method of MyPoint to compute the perimeter.
    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    //A method printType(), which prints "equilateral" if all the three sides are equal, "isosceles"
    //if any two of the three sides are equal, or "scalene" if the three sides are different.
    public String printType() {
        if (v1.distance(v2) == v2.distance(v3) && v3.distance(v1) == v1.distance(v2)) {
            return ("Equilateral");
        } else if (v1.distance(v2) == v1.distance(v3) || v2.distance(v3) == v1.distance(v3)) {

            return "Isosceles";

        }
        return "Scalene";

    }

}
