package topic_0_2;

import java.util.ArrayList;

public class Hospital {
	
	private String name;
	private ArrayList<Doctor> doctors;
	private ArrayList<String> nurses;
	private ArrayList<Room> rooms;
	private ER emergencies;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}
	public ArrayList<String> getNurses() {
		return nurses;
	}
	public void setNurses(ArrayList<String> nurses) {
		this.nurses = nurses;
	}
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
	public ER getEmergencies() {
		return emergencies;
	}
	public void setEmergencies(ER emergencies) {
		this.emergencies = emergencies;
	}
	
	public String toString(){
		return "Hopital: "+ name + ", Doctors: "+ doctors + ", Nurses: "+ nurses;
	}
	
}
