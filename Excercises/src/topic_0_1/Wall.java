package topic_0_1;

public class Wall {
	private String material;
	private float squareFeet;
	//many more
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public float getSquareFeet() {
		return squareFeet;
	}
	public void setSquareFeet(float squareFeet) {
		this.squareFeet = squareFeet;
	}
	
	public String toString(){
		return "Material: "+ material + ", Squeare Feet: " + squareFeet;
	}
	
}
