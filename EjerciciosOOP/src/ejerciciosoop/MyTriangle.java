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
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    @Override
    public String toString() {
        return "Triangle @" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3;
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int x2, int x3, int y1, int y2, int y3) {
        v1.setXY(x1, y1) ;
        v2.setXY(x2, y2) ;
        v3.setXY(x3, y3) ;
                
    }
    
    public double getPerimeter(){
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v3.distance(v2);
        return d1+d2+d3;
    }
    
    public void pintType(){
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v3.distance(v2);
        
        if (d1 == d2 && d2 == d3)
            System.out.println("equilateral");
        else if (d1 == d2 || d2 == d3)
            System.out.println("isosceles");
            else System.out.println("scalene");
                
    }
    
}
