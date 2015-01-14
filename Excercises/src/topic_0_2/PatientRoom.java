package topic_0_2;

import java.util.ArrayList;

public class PatientRoom implements Room {
	private int number;
	private int capacity;
	private boolean hasBathroom;
	private ArrayList<String> patients;
	
	
	public void setPatients(ArrayList<String> patients) {
		this.patients = patients;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public boolean isHasBathroom() {
		return hasBathroom;
	}
	public void setHasBathroom(boolean hasBathroom) {
		this.hasBathroom = hasBathroom;
	}
	@Override
	public ArrayList<String> getPatients() {
		return patients;
	}
	@Override
	public void cleanRoom() {
		// clean the room
	}
	
	public String toString(){
		return "PatientRoom "+ number + ", Capacity: "+ capacity + ", Patients: " + patients;
	}
	
}
