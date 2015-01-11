package oopExercises.ej1_4;

import oopExercises.ej1_3.MyPoint;

public class TestMyCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyPoint center = new MyPoint();
		MyCircle circle1 = new MyCircle(center, 4);

		circle1.toString();
		System.out.println("Center position:" + circle1.getCenter());
		System.out.println("Area of the Circle:" + circle1.getArea());

		circle1.setCenterXY(3, 4);

		System.out.println(circle1.toString());
		System.out.println("Area of the Circle:" + circle1.getArea());

		circle1.setRadius(3);

		System.out.println(circle1.toString());
		System.out.println("Area of the Circle:" + circle1.getArea());

	}

}
