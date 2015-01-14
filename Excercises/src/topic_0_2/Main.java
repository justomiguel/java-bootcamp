package topic_0_2;

import topic_0_1.ArgentinianHouseBuilder;
import topic_0_1.House;
import topic_0_1.HouseBuilder;
import topic_0_1.HouseDirector;

public class Main {
	
	public static void main(String args[]){
		HospitalBuilder hospitalBuilder = new RamonSantamarinaHospitalBuilder();
		HospitalDirector hospitalDirector = new HospitalDirector(hospitalBuilder);
		hospitalDirector.constructHospital();
		Hospital hospital = hospitalDirector.getHospital();
		
		System.out.println(hospital);
	}
}
