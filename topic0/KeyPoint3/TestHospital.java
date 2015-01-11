package KeyPoint3;

public class TestHospital {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		HospitalBuilder hospitalBuilder = new FirstAidHospitalBuilder();
		HospitalDirector hospitalDirector = new HospitalDirector(hospitalBuilder);
		hospitalDirector.constructHospital();
		
		Hospital hospital = hospitalBuilder.getHospital();
		
		System.out.println(hospital);
		

	}

}
