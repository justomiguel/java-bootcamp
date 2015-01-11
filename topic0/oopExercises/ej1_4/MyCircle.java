package oopExercises.ej1_4;

import oopExercises.ej1_3.MyPoint;

public class MyCircle {

	private MyPoint center;
	private int radius;

	// contructor

	public MyCircle(MyPoint center, int radius) {
		super();
		this.center = center;
		this.radius = radius;
	}

	public MyCircle(int x, int y, int radius) {
		super();
		this.center = new MyPoint(x, y);
		this.radius = radius;
	}

	// getters & setters
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

	public int getCenterX() {
		return this.getCenter().getX();
	}

	public int getCenterY() {
		return this.getCenter().getY();
	}

	public void setCenterXY(int x, int y) {
		this.setCenter(new MyPoint(x, y));
	}

	// methods

	public String toString() {

		return "Circle @" + this.getCenter() + " radius " + this.getRadius();

	}

	public double getArea() {
		return Math.PI * this.getRadius() * this.getRadius();
	}

}
