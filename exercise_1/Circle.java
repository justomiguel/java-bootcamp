/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberta
 */
public class Circle {           // save as "Circle.java"
    // private instance variable, not accessible from outside this class

    private double radius;
    private String color;

    // 1st constructor, which sets both radius and color to default
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // 2nd constructor with given radius, but color default
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    //1) 3rd constructor with the given radius and color
    /**
     * public Circle(double r, String c) {
     *
     * radius = r; color = c;
     *
     * }
     */
    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    // A public method for computing the area of circle
    public double getArea() {
        return radius * radius * Math.PI;
    }

    //2) Getter for instance variable color 
    public String getColor() {
        return color;
    }

    /**
     * 4)Setter for instance variable radius public void setRadius(double r) {
     * radius = r; }
     *
     * //4)// Setter for instance variable color public void setColor(String c){
     * color = c; }
     */
    //5) Using the special keyword "this"
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //5) Using the special keyword "this"
    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }

    public String toString() {
        return "Circle: radius=" + radius + " color=" + color;
    }

}
