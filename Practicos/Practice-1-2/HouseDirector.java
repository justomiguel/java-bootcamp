
public class HouseDirector {
	private HouseBuilder houseBuilder = null;
	
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	public void constructHouse() {
		houseBuilder.buildAtic();
		houseBuilder.buildBathroom();
		houseBuilder.buildBedroom();
		houseBuilder.buildDiningroom();
		houseBuilder.buildGarage();
		houseBuilder.buildKitchen();		
	}

	public House getHouse() {
		return houseBuilder.getHouse();
	}
}
