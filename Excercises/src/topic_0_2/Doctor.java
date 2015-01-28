package topic_0_2;

public class Doctor {
	private String name;
	
	//for simplycity we only use a number, but we could have an array patients
	private int quantityOfPatients;
	private float salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantityOfPatients() {
		return quantityOfPatients;
	}
	public void setQuantityOfPatients(int quantityOfPatients) {
		this.quantityOfPatients = quantityOfPatients;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return "Dr "+ name + ", Number of Patients: " + quantityOfPatients + ", Salary: " +salary;
	}
	
	
}
