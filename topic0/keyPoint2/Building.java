package keyPoint2;

public class Building {

	private int rooms;
	private int kitchens;
	private int bathrooms;
	private int livingrooms;
	private int diningrooms;
	private String type;

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getKitchens() {
		return kitchens;
	}

	public void setKitchens(int kitchens) {
		this.kitchens = kitchens;
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}

	public int getLivingrooms() {
		return livingrooms;
	}

	public void setLivingrooms(int livingrooms) {
		this.livingrooms = livingrooms;
	}

	public int getDiningrooms() {
		return diningrooms;
	}

	public void setDiningrooms(int diningroom) {
		this.diningrooms = diningroom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "Type:" + type + " rooms:" + rooms + " kitchens:" + kitchens + " bathrooms:" + bathrooms + " livingrooms:" + livingrooms
				+ " diningrooms:" + diningrooms;
	}

}
