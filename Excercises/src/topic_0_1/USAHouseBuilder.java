package topic_0_1;

import java.util.ArrayList;

public class USAHouseBuilder  implements HouseBuilder {

		private House house;

		public USAHouseBuilder() {
			house = new House();
		}

		@Override
		public void buildTerrain() {
			house.setTerrain("Varied");
			
		}

		@Override
		public void buildRooms() {
			Room room1 = new Room();
			ArrayList<String> appliances1 = new ArrayList<String>();
			appliances1.add("Music Stereo by Beats by Dre");
			appliances1.add("Lights from AChina");
			appliances1.add("Heater, Brand \"Generic China\"");
			room1.setAppliances(appliances1);
			
			Room room2 = new Room();
			ArrayList<String> appliances2 = new ArrayList<String>();
			appliances2.add("Microwave  from China");
			appliances2.add("Blender from China");
			appliances2.add("Fridge from China");
			room2.setAppliances(appliances2);
			
			ArrayList<Room> rooms = new ArrayList<Room>();
			rooms.add(room1);
			rooms.add(room2);
			house.setRooms(rooms);
		}

		@Override
		public void buildSquareFeet() {
			house.setSquareFeet(1000);
		}

		@Override
		public House getHouse() {
			return house;
		}

}