package KeyPoint3;

public class FirstAidHospitalBuilder implements HospitalBuilder {

	private Hospital hospital;

	// Construtor

	public FirstAidHospitalBuilder() {
		hospital = new Hospital();
	}

	// Getters & Setters

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	// Methods

	@Override
	public void buildBedRooms() {
		this.getHospital().setBedRooms(5);

	}

	@Override
	public void buildDiagnostics() {
		this.getHospital().setDiagnostics(1);

	}

	@Override
	public void buildTreatments() {
		this.getHospital().setTreatments(1);

	}

	@Override
	public void buildTraumaCenter() {
		this.getHospital().setTraumaCenter(0);

	}

	@Override
	public void buildDentalCenter() {

		this.getHospital().setDentalCenter(1);
	}

	@Override
	public void buildStaffRecidences() {
		this.getHospital().setRecidenceRooms(1);

	}

	@Override
	public void buildParking() {
		this.getHospital().setParking(1);

	}

	
	@Override
	public void buildFrontDesk() {

		this.getHospital().setFrontDesk(1);

	}

	@Override
	public void buildType() {
		this.getHospital().setType("Small Hospital");

	}

	@Override
	public void buildName() {
		this.hospital.setName("Satan's Emergency");

	}

	@Override
	public void buildWaitRooms() {
		this.getHospital().setWaitRooms(1);
		
	}

}
