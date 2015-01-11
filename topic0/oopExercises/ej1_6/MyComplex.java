package oopExercises.ej1_6;

public class MyComplex {
	private double real;
	private double image;

	// Constructor
	public MyComplex(double real, double image) {
		this.real = real;
		this.image = image;
	}

	// Getters & Setters
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImage() {
		return image;
	}

	public void setImage(double image) {
		this.image = image;
	}

	// Methods

	public void setValue(double real, double imag) {
		this.setReal(real);
		this.setImage(imag);
	}

	public String toString() {

		return "(" + this.getReal() + "+" + this.getImage() + "i)";
	}

	public boolean isReal() {

		if (this.getImage() == 0) {

			return true;
		} else {
			return false;
		}
	}

	public boolean isImaginary() {

		if (this.getReal() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean equals(int real, int imag) {

		if ((this.getReal() == real) && (this.getImage() == imag)) {
			return true;
		} else {

			return false;
		}
	}

	public boolean equals(MyComplex another) {
		if ((this.getReal() == another.getReal()) && (this.getImage() == another.getImage())) {
			return true;
		} else {
			return false;
		}
	}

	public double magnitude() {

		return Math.sqrt(Math.pow(this.getReal(), 2.0) + Math.pow(this.getImage(), 2.0));

	}

	public double argumentInRadians() {
		return Math.atan2(this.getImage(), this.getReal());
	}

	public double argumentInDegrees() {
		double rad = this.argumentInRadians();

		return (rad * 180) / (Math.PI);

	}

	public MyComplex conjugate() {
		return new MyComplex(this.getReal(), -this.getImage());
	}

	public MyComplex add(MyComplex another) {

		double imag = this.getImage() + another.getImage();
		double real = this.getReal() + another.getReal();

		return new MyComplex(real, imag);

	}

	public MyComplex subtract(MyComplex another) {

		double imag = this.getImage() - another.getImage();
		double real = this.getReal() - another.getReal();

		this.setValue(real, imag);

		return this;
	}

	public MyComplex multiplyWith(MyComplex another) {

		double real = this.getImage() * another.getImage() - this.getImage() * another.getImage();
		double imag = this.getReal() * another.getImage() + this.getReal() * another.getImage();

		this.setValue(real, imag);

		return this;

	}

	public MyComplex divideBy(MyComplex another) {

		this.multiplyWith(another.conjugate());

		double divide = (Math.pow(another.getImage(), 2.0) + Math.pow(another.getReal(), 2));

		this.setValue(this.getReal() / divide, this.getImage() / divide);

		return this;

	}

}
