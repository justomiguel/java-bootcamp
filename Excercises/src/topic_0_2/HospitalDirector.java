package topic_0_2;

import topic_0_1.House;
import topic_0_1.HouseBuilder;

public class HospitalDirector {
	private HospitalBuilder hospitalBuilder = null;

	public HospitalDirector(HospitalBuilder hospitalBuilder) {
		this.hospitalBuilder = hospitalBuilder;
	}

	public void constructHospital() {
		hospitalBuilder.buildStructure();
		hospitalBuilder.buildER();
		hospitalBuilder.buildRooms();
		hospitalBuilder.buildTeam();
	}

	public Hospital getHospital() {
		return hospitalBuilder.getHospital();
	}
}

