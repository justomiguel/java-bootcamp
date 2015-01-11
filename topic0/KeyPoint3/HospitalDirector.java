package KeyPoint3;

public class HospitalDirector {

	private HospitalBuilder hospitalBuilder = null;

	public HospitalDirector(HospitalBuilder hospitalBuilder) {
		this.hospitalBuilder = hospitalBuilder;
	}

	public void constructHospital() {

		hospitalBuilder.buildBedRooms();
		hospitalBuilder.buildDentalCenter();
		hospitalBuilder.buildDiagnostics();
		hospitalBuilder.buildFrontDesk();
		hospitalBuilder.buildName();
		hospitalBuilder.buildParking();
		hospitalBuilder.buildStaffRecidences();
		hospitalBuilder.buildTraumaCenter();
		hospitalBuilder.buildTreatments();
		hospitalBuilder.buildType();
		hospitalBuilder.buildWaitRooms();

	}

	public Hospital getHospital() {
		return hospitalBuilder.getHospital();
	}

}
