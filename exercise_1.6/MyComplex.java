/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycomplexproject;

/**
 *
 * @author roberta
 */
public class MyComplex {

    double real;
    double img;

    public MyComplex(double real, double img) {
        this.img = img;
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public double getImg() {
        return img;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImg(double img) {
        this.img = img;
    }

    //A method setValue() to set the value of the complex number.
    public void setValue(double r, double i) {
        real = r;
        img = i;
    }

    //A toString() that returns "(x + yi)" where x and y are the real and imaginary parts respectively.
    @Override
    public String toString() {
        return "(" + real + " " + "+" + " " + img + "i" + ")";
    }

    public boolean isReal() {
        return (img == 0);
    }

    public boolean isImg() {
        return (real == 0);
    }

    //A method equals(double real, double imag) 
    //that returns true if this complex number is equal to the given complex number of (real, imag
    public boolean equals(double real, double img) {
        return (this.img == img) && (this.real == real);
    }

    //An overloaded equals(MyComplex another) that returns true if this complex 
    //number is equal to the given MyComplex instance another.
    public boolean equals(MyComplex another) {
        return (this.img == another.img) && (this.real == another.real);
    }

    //A method magnitude()that returns the magnitude of this complex number.
    //magnitude(x+yi) = Math.sqrt(x2 + y2)
    public double magnitude() {
        return Math.sqrt(real + img);
    }

    //Methods argumentInRadians() and argumentInDegrees() that returns the argument of this complex number 
    //in radians (in double) and degrees (in int) respectively.
    public double argumentInRadians() {
        return Math.atan2(img, real);
    }

    public int argumentInDegrees() {
        Long grados = new Long(Math.round(((Math.atan2(img, real) * 100) / Math.PI)));
        return grados.intValue();
    }

    public MyComplex conjugate() {
        MyComplex c = new MyComplex(this.real, -this.img);
        return c;
    }

    //Methods add(MyComplex another) and subtract(MyComplex another) that adds and subtract this instance 
    //with the given MyComplex instance another, and returns a new MyComplex instance containing the result. 
    public MyComplex addComplex(MyComplex another) {
        double r = this.real + another.real;
        double i = this.img + another.img;
        return new MyComplex(r, i);
    }

    public MyComplex susComplex(MyComplex another) {
        double r = this.real - another.real;
        double i = this.img - another.img;
        return new MyComplex(r, i);
    }
    //Methods multiplyWith(MyComplex another) and divideBy(MyComplex another) that multiplies and divides 
    //this instance with the given MyComplex instance another, keep the result in this instance, 
    //and returns this instance.
    //(a + bi) * (c + di) = (ac - bd) + (ad + bc)i

    public MyComplex multiplyWith(MyComplex another) {
        double r = ((this.getReal() * another.getReal()) - (this.getImg() * another.getImg()));
        double i = ((this.getReal() * another.getImg()) + (this.getImg()* another.getReal()));
        this.real = r;
        this.img = i;
        return this;
    }

    //(a + bi) / (c + di) = [(a + bi) * (c – di)] / (c2 + d2)

    public MyComplex divideBy(MyComplex another) {
        this.multiplyWith(another.conjugate());
        MyComplex denominator = another.conjugate().multiplyWith(another);
        this.real = this.getReal() / denominator.getReal();
        this.img = this.getImg() / denominator.getReal();
        return this;
    }

}
