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
public class MyPoint {
    private int x;
    private int y;

    @Override
    public String toString() {
        return "(" +  x + ", " + y + ")";
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    
    public double distance(int x2, int y2) { 
        int xd = this.x - x2;
        int yd = this.y - y2;
        return Math.sqrt(xd*xd + yd*yd);
}
    public double distance(MyPoint point){
        int xd = this.x - point.x;
        int yd = this.y - point.y;
        return Math.sqrt(xd*xd + yd*yd);
    }
}
