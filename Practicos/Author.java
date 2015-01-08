
public class Author {
	//private instance variable
	private String name, email;
	private char gender;
	
	//constructor to initialize the name, email and gender with the given values;
	public Author (String name, String email, char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	public String getName() {
		return(this.name);
		
	}
	
	public String getEmail() {
		return(this.email);
	}
	 
	public void setEmail (String email) {
		this.email = email;
	}
	
	public char getGender() {
		return(this.gender);
	}
	
	public String toString() {
		   return this.name + " (" + this.gender + ")" + " at " + this.email;
		}
	
	
}
