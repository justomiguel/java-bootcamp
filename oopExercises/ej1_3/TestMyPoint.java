package oopExercises.ej1_3;

public class TestMyPoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyPoint p1 = new MyPoint(3, 0);
		MyPoint p2 = new MyPoint(0, 4);

		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(5, 6));

	}

}
