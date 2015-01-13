package topic_0_1;

public class Main {
	
	public static void main(String[] args) {
		HouseBuilder houseBuilder = new ArgentinianHouseBuilder();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		House house = houseDirector.getMeal();
		System.out.println("House 1");
		System.out.println(house);
	}
}

