package topic_0_2;

import java.util.ArrayList;

public class OperationRoom implements Room {
	private ArrayList<String> patients;
	private boolean isFunctional;
	private int number;
	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isFunctional() {
		return isFunctional;
	}

	public void setFunctional(boolean isFunctional) {
		this.isFunctional = isFunctional;
	}

	@Override
	public ArrayList<String> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<String> patients) {
		this.patients = patients;
	}

	@Override
	public void cleanRoom() {
		// clean the room wth special instruments because its an operation room
	}

	public String toString(){
		return "OperationRoom "+ number+ ", Patients: " + patients;
	}
}
