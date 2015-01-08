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
public class MyPoint {
    int x ;
    int y ;
    
public MyPoint(int x, int y){
    this.x = x;
    this.y = y;
}

public MyPoint(){
    x= 0;
    y= 0;

}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //A method setXY() to set both x and y.
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    
    //A toString() method that returns a string description of the instance in the format "(x, y)".
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    
    //A method called distance(int x, int y) that returns the distance from this point to another point at the given (x, y) coordinates
    public double distance(int x, int y) {   
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    //An overloaded distance(MyPoint another) that returns the distance from this point to the given MyPoint instance another
    public double distance(MyPoint another) { 
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    //Write a program that allocates 10 points in an array of MyPoint
    
    
}
