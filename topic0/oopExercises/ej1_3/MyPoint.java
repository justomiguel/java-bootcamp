package oopExercises.ej1_3;

public class MyPoint {
	private int x;
	private int y;

	// Constructor

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// getters & setters

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

	public void setXY(int x, int y) {
		this.y = y;
		this.x = x;
	}

	// Methods

	public String toString() {

		return "(" + this.getX() + "," + this.getY() + ")";
	}

	// this version take as a parameter 2 given points.

	public double distance(int x, int y) {

		double x0 = this.getX();
		double y0 = this.getY();
		return Math.sqrt(Math.pow(x - x0, 2.0) + Math.pow(y - y0, 2.0));

	}

	// this version take as a parameter a given object of class MyPoint

	public double distance(MyPoint another) {

		int xDiff = this.getX() - another.getX();
		int yDiff = this.getY() - another.getY();
		return Math.sqrt(Math.pow(xDiff, 2.0) + Math.pow(yDiff, 2.0));

	}

}
