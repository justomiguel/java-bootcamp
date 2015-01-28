package topic_0_1;

import java.util.ArrayList;


public class ArgentinianHouseBuilder implements HouseBuilder {

	private House house;

	public ArgentinianHouseBuilder() {
		house = new House();
	}

	@Override
	public void buildTerrain() {
		house.setTerrain("Hill");
		
	}

	@Override
	public void buildRooms() {
		Room room1 = new Room();
		ArrayList<String> appliances1 = new ArrayList<String>();
		appliances1.add("Music Stereo Made in Argentina");
		appliances1.add("Lights");
		appliances1.add("Light Lamp Assembled in Tierra del fuego");
		appliances1.add("Heater, Brand \"Las Lilianas\"");
		room1.setAppliances(appliances1);
		Wall wall = new Wall();
		wall.setMaterial("Concrete");
		wall.setSquareFeet(20);
		room1.setWalls(wall);
		ArrayList<String> wardrobes1 = new ArrayList<String>();
		wardrobes1.add("Bed");
		wardrobes1.add("Closet");
		room1.setWardrobes(wardrobes1);
		
		
		Room room2 = new Room();
		ArrayList<String> appliances2 = new ArrayList<String>();
		appliances2.add("Microwave Atma");
		appliances2.add("Blender Carrefour");
		appliances2.add("Fridge Philips");
		room2.setAppliances(appliances2);
		room2.setWalls(wall);
		ArrayList<String> wardrobes2 = new ArrayList<String>();
		wardrobes2.add("Kitchen Table");
		wardrobes2.add("Table");
		room2.setWardrobes(wardrobes2);
		
		
		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(room1);
		rooms.add(room2);
		
		
		house.setRooms(rooms);
	}

	@Override
	public void buildSquareFeet() {
		house.setSquareFeet(300);
	}

	@Override
	public House getHouse() {
		return house;
	}

}