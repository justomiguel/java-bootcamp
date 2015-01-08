
public class SimpleHouse implements HouseBuilder {
	private House house;
	
	public SimpleHouse() {
		house = new House();
	}

	@Override
	public void buildBedroom() {
		house.setBedroom(1);
				
	}

	@Override
	public void buildBathroom() {
		house.setBathroom(1);
		
	}

	@Override
	public void buildKitchen() {
		house.setKitchen(1);
		
	}

	@Override
	public void buildGarage() {
		house.setGarage(0);
		
	}

	@Override
	public void buildDiningroom() {
		house.setDiningroom(1);
		
	}

	@Override
	public void buildAtic() {
		house.setAtic(0);
		
	}

	@Override
	public House getHouse() {
		return house;
	}

}
