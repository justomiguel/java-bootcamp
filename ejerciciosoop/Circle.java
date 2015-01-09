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
public class Circle {
    private double radius;
    private String color;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    
    public Circle(double r){
        this.radius = r;
        this.color = "red";
    }
    
    public Circle(double r, String c ){
        this.radius = r;
        this.color = c;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public String getColor(){
        return color;
    }
    
    public double getArea(){
        return radius*radius*Math.PI;
    }
    
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
}
