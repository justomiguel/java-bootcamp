package keyPoint2;

public class HouseBuildingBuilder implements BuildingBuilder {

	private Building building;

	public HouseBuildingBuilder() {

		building = new Building();

	}

	@Override
	public void buildRooms() {
		building.setRooms(3);

	}

	@Override
	public void buildDiningrooms() {

		building.setDiningrooms(1);

	}

	@Override
	public void buildKitchens() {
		building.setKitchens(1);

	}

	@Override
	public void buildLivingrooms() {
		building.setLivingrooms(2);

	}

	@Override
	public void buildBathrooms() {
		building.setBathrooms(2);

	}

	@Override
	public void buildType() {

		building.setType("House");

	}

	@Override
	public Building getBuilding() {

		return building;
	}

}
