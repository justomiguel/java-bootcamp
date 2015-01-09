package oopExercises.ej1_2;

public class Author {
	private String name;
	private String email;
	private char gender;

	// Constructor

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;

	}

	// getters & setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	// methods

	public String toString() {
		return this.getName() + ",(" + this.getGender() + ") at " + this.getEmail();
	}

}
