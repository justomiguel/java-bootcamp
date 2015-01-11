package oopExercises.ej1_5;

import oopExercises.ej1_3.MyPoint;

public class TestMyTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyPoint p1 = new MyPoint(1, 1);
		MyPoint p2 = new MyPoint(2, 3);
		MyPoint p3 = new MyPoint(1, 3);

		MyTriangle triangle1 = new MyTriangle(p1, p2, p3);

		System.out.println(triangle1 + "\nSideA:" + p1.distance(p2) + "\nSideB:" + p2.distance(p3) + "\nSideC:" + p3.distance(p1)
				+ "\nPerimeter:" + triangle1.getPerimeter() + "\nType:" + triangle1.printType());

		p1.setXY(-3, 1);
		p2.setXY(1, 1);
		p3.setXY(-1, -3);

		System.out.println(triangle1 + "\nSideA:" + p1.distance(p2) + "\nSideB:" + p2.distance(p3) + "\nSideC:" + p3.distance(p1)
				+ "\nPerimeter:" + triangle1.getPerimeter() + "\nType:" + triangle1.printType());

	}

}
