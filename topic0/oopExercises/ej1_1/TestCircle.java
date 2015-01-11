package oopExercises.ej1_1;

public class TestCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("the circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

		Circle c2 = new Circle(2.0);
		System.out.println("the circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

		Circle c3 = new Circle();
		c3.setRadius(5.0);
		c3.setColor("blue");

		c1.setRadius(5.0);
		System.out.println(c1.toString());
		System.out.println(c1);
		System.out.println("operador '+' invokes to String too " + c1);

	}

}
