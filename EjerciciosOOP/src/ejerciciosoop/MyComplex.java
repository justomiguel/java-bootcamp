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
public class MyComplex {
    private double real;
    private double imag;

    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    
    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    
    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    
    public boolean isReal(){
        return (this.imag == 0);
    }
    
    public boolean isImaginary(){
        return (this.real == 0);
    }
    
    public boolean equalComplex(double x, double y){
        if (this.real == x && this.imag == y) return true;
        else return false;
    }
    
    public boolean equalComplex(MyComplex another){
        if (this.real == another.real && this.imag == another.imag) return true;
        else return false;
    }
    
    public double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }
    
    public double argumentInRadians(){
        return Math.atan2(imag, real);
    }
    
    public int argumentInDegrees(){
        double temp = this.argumentInRadians();
        
        return (int) ((180*temp)/Math.PI); 
    }
    
    public MyComplex conjugate(){
        return new MyComplex(real, -imag);
    }
    
    public MyComplex add(MyComplex another){
        return new MyComplex(this.real+another.real, this.imag+another.imag);
       
    }
    
    public MyComplex subtract(MyComplex another){
        return new MyComplex(this.real-another.real, this.imag-another.imag);
       
    }
    
    public MyComplex multiplyWith(MyComplex another){
        double r = (this.real*another.real - this.imag*another.imag);
        double i = (this.real*another.imag + this.imag*another.real);
        this.setValue(r, i);
        return this;
    }
    
     public MyComplex divideBy(MyComplex another){
        double r = (this.real/another.real - this.imag/another.imag);
        double i = (this.real/another.imag + this.imag/another.real);
        this.setValue(r, i);
        return this;
    }
}
