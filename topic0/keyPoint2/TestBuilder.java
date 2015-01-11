package keyPoint2;

public class TestBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BuildingBuilder buildingBuilder = new HouseBuildingBuilder();

		BuildingDirector buildingDirector = new BuildingDirector(buildingBuilder);

		buildingDirector.constructBuilding();

		Building building = buildingDirector.getBuilding();

		System.out.println(building);

	}

}
