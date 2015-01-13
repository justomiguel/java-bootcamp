package topic_0_1;

import java.util.ArrayList;

public class Room {
	private Wall walls;
	private ArrayList<String> appliances;
	private ArrayList<String> wardrobes;
	//many more
	
	
	public ArrayList<String> getAppliances() {
		return appliances;
	}
	public Wall getWalls() {
		return walls;
	}
	public void setWalls(Wall walls) {
		this.walls = walls;
	}
	public void setAppliances(ArrayList<String> appliances) {
		this.appliances = appliances;
	}
	public ArrayList<String> getWardrobes() {
		return wardrobes;
	}
	public void setWardrobes(ArrayList<String> wardrobes) {
		this.wardrobes = wardrobes;
	}
	
	public String toString(){
		String result = "";
		result += "  Wall info: + " + walls + System.getProperty("line.separator"); 
		result += "  Appliances: " + appliances.toString() + System.getProperty("line.separator"); 
		result += "  Wardrobes: " + wardrobes.toString();
		return result;
	}
	
}
