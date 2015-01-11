package keyPoint2;

public class BuildingDirector {

	private BuildingBuilder buildingBuilder = null;

	public BuildingDirector(BuildingBuilder buildingBuilder) {
		this.buildingBuilder = buildingBuilder;
	}

	public void constructBuilding() {

		buildingBuilder.buildBathrooms();
		buildingBuilder.buildDiningrooms();
		buildingBuilder.buildKitchens();
		buildingBuilder.buildLivingrooms();
		buildingBuilder.buildRooms();
		buildingBuilder.buildType();

	}

	public Building getBuilding() {
		return buildingBuilder.getBuilding();
	}

}
