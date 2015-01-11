public class TestMyPolynomial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		
		MyPolynomial p1 = new MyPolynomial(0,0,0);
		
		MyPolynomial p2 = new MyPolynomial("/tmp/coeffs");
		
		
		System.out.println("Polynomial's Degree"+p1.getDegree());
		
		System.out.println(p1.toString());
		
		System.out.println("Enter the X value :");
		
		double valueX = sc.nextDouble();
		
		System.out.println(p1.evaluate(valueX));
		
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("-----------------RESULT ADD-----------\n");
		System.out.println(p1.add(p2));
		System.out.println("\n-----------------RESULT MULTIPLY------");
		System.out.println(p1.multiply(p2));
		
		
		
		
	}

}
