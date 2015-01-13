package topic_0_1;

import java.util.ArrayList;

public class House {
	private String terrain;
	private ArrayList<Room> rooms;
	private float squareFeet;
	
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}
	public String getTerrain() {
		return terrain;
	}
	public void setTerrain(String terrain) {
		this.terrain = terrain;
	}

	public float getSquareFeet() {
		return squareFeet;
	}
	public void setSquareFeet(float squareFeet) {
		this.squareFeet = squareFeet;
	}
	
	public String toString(){
		String house;
		house = "This house has " + System.getProperty("line.separator");
		house += "Square Feet: " + squareFeet + " m2" + System.getProperty("line.separator"); 
		house += "Terrain: " + terrain + System.getProperty("line.separator"); 
		house += "Rooms: "+ System.getProperty("line.separator"); 
		for(Room r: rooms){
			house += " Room:"+ System.getProperty("line.separator"); 
			house += r.toString() + System.getProperty("line.separator");
			
		}
		return house;
	}
	
}
