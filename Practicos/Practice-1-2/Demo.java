
public class Demo {
	public static void main(String[] args) {

		HouseBuilder houseBuilder = new SimpleHouse();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		House house = houseDirector.getHouse();
		System.out.println(house);
		
	}
}
