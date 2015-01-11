public class MyPolynomial {

	private double[] coeffs;

	// Constructor

	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;
	}

	public MyPolynomial(String filename) {

		Scanner in = null;
		try {
			in = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int degree = in.nextInt();

		coeffs = new double[degree];

		for (int i = 0; i < coeffs.length; ++i) {

			coeffs[i] = in.nextDouble();

		}
	}

	// Getters & Setters

	public double[] getCoeffs() {
		return coeffs;
	}

	public void setCoeffs(double[] coeffs) {
		this.coeffs = coeffs;
	}

	// Methods

	public int getDegree() {

		return this.getCoeffs().length;
	}

	public String toString() {
		String a = "P(x) = ";
		int i = 1;
		for (double coeff : this.coeffs) {
			a += Double.toString(coeff) + " * x^" + i + " + ";
			i++;
		}
		return a += "0";
	}

	public double evaluate(double x) {

		int evaluated = 0;
		int i = 1;

		for (double coeff : this.getCoeffs()) {
			evaluated += x * Math.pow(coeff, i);
			i++;
		}
		return evaluated;
	}

	public MyPolynomial add(MyPolynomial another) {

		double[] sum;

		if (this.getCoeffs().length > another.getCoeffs().length) {

			sum = Arrays.copyOf(coeffs, coeffs.length);

			for (int i = 0; i < another.getCoeffs().length; i++) {

				sum[i] = sum[i] + another.getCoeffs()[i];

			}

		} else {
			sum = Arrays.copyOf(another.getCoeffs(), another.getCoeffs().length);

			for (int i = 0; i < this.getCoeffs().length; i++) {

				sum[i] = sum[i] + this.getCoeffs()[i];
			}

		}

		return new MyPolynomial(sum);
	}

	public MyPolynomial multiply(MyPolynomial another) {

		int degreeOfMult = this.getCoeffs().length + another.getCoeffs().length;

		double[] mult = new double[degreeOfMult];

		for (int i = 0; i < another.getCoeffs().length; i++) {

			for (int j = 0; j < this.getCoeffs().length; j++) {

				mult[i+j+1] = mult[i+j+1] + another.getCoeffs()[i] * this.getCoeffs()[j];
				
				System.out.println(i+j+" - "+mult[i + j]);

			}

		}
		
		return new MyPolynomial(mult);

	}

}
