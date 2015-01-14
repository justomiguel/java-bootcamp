package topic_0_2;

import java.util.ArrayList;

public class ER {
	private ArrayList<Doctor> doctorsAvailable;
	private String name;
	private boolean hasPatient;
	
	public ArrayList<Doctor> getDoctorsAvailable() {
		return doctorsAvailable;
	}
	public void setDoctorsAvailable(ArrayList<Doctor> doctorsAvailable) {
		this.doctorsAvailable = doctorsAvailable;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isHasPatient() {
		return hasPatient;
	}
	public void setHasPatient(boolean hasPatient) {
		this.hasPatient = hasPatient;
	}
	
	
}
