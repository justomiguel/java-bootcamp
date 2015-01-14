package topic_0_2;

import java.util.ArrayList;

public class RamonSantamarinaHospitalBuilder implements HospitalBuilder {
	Hospital hospital;
	
	public RamonSantamarinaHospitalBuilder(){
		hospital = new Hospital();
	}
	
	@Override
	public void buildStructure() {
		hospital.setName("Ramon Santamarina");
		
	}

	@Override
	public void buildRooms() {
		RoomFactory roomFactory = new RoomFactory();
		Room room1 = roomFactory.getRoom("Op");
		((OperationRoom)room1).setNumber(3);
		ArrayList<String> patients = new ArrayList<String>();
		patients.add("Patient 1");
		patients.add("Patient 2");
		((OperationRoom)room1).setPatients(patients);
		Room room2 = roomFactory.getRoom("P");
		((PatientRoom)room2).setCapacity(4);
		((PatientRoom)room2).setNumber(2);
		((PatientRoom)room2).setPatients(patients);
		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(room1);
		rooms.add(room2);
		hospital.setRooms(rooms);
		
	}

	@Override
	public void buildTeam() {
		Doctor doc = new Doctor();
		doc.setName("Pedro");
		doc.setQuantityOfPatients(2);
		doc.setSalary(10000);
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		doctors.add(doc);
		hospital.setDoctors(doctors);
		
		ArrayList<String> nurses = new ArrayList<String>();
		nurses.add("Nurse 1");
		nurses.add("Nurse 2");
		nurses.add("Nurse 3");
		hospital.setNurses(nurses);
	}

	@Override
	public void buildER() {
		ER emergency = new ER();
		Doctor doc = new Doctor();
		doc.setName("Pedro");
		doc.setQuantityOfPatients(2);
		doc.setSalary(10000);
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		doctors.add(doc);
		emergency.setDoctorsAvailable(doctors);
		emergency.setName("Emergency Room 1");
		emergency.setHasPatient(true);
	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}

}
