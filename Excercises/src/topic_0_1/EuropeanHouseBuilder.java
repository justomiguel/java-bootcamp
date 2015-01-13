package topic_0_1;

import java.util.ArrayList;

public class EuropeanHouseBuilder  implements HouseBuilder {

		private House house;

		public EuropeanHouseBuilder() {
			house = new House();
		}

		@Override
		public void buildTerrain() {
			house.setTerrain("Plain");
			
		}

		@Override
		public void buildRooms() {
			Room room1 = new Room();
			ArrayList<String> appliances1 = new ArrayList<String>();
			appliances1.add("Music Stereo Made in Germany");
			appliances1.add("Lights from Australia");
			appliances1.add("Heater, Brand \"LG\"");
			room1.setAppliances(appliances1);
			
			Room room2 = new Room();
			ArrayList<String> appliances2 = new ArrayList<String>();
			appliances2.add("Microwave USA");
			appliances2.add("Blender Turkey");
			appliances2.add("Fridge India");
			room2.setAppliances(appliances2);
			
			ArrayList<Room> rooms = new ArrayList<Room>();
			rooms.add(room1);
			rooms.add(room2);
			house.setRooms(rooms);
		}

		@Override
		public void buildSquareFeet() {
			house.setSquareFeet(50);
		}

		@Override
		public House getHouse() {
			return house;
		}

}
