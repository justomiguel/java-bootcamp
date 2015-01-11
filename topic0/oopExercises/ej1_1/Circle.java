package oopExercises.ej1_1;

public class Circle {
	private double radius;
	private String color;

	// Constructor

	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
		color = "red";
	}

	public Circle(double radius, String string) {
		this.radius = radius;
		this.color = string;
	}

	// Getter & Setters

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Methods

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public String toString() {
		return "Circle: radius=" + radius + " color=" + color;
	}

}
