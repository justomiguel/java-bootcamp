package topic_0_1;

public class HouseDirector {
	private HouseBuilder houseBuilder = null;

	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void constructHouse() {
		houseBuilder.buildSquareFeet();
		houseBuilder.buildTerrain();
		houseBuilder.buildRooms();
	}

	public House getHouse() {
		return houseBuilder.getHouse();
	}

}

