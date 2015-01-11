package KeyPoint3;

public class Hospital {

	private int bedRooms;
	private int diagnostics;
	private int treatments;
	private int traumaCenter;
	private int dentalCenter;
	private int recidenceRooms;
	private int parking;
	private int waitRooms;
	private int frontDesk;
	private String type;
	private String name;

	public int getBedRooms() {
		return bedRooms;
	}

	public void setBedRooms(int bedRooms) {
		this.bedRooms = bedRooms;
	}

	public int getDiagnostics() {
		return diagnostics;
	}

	public void setDiagnostics(int diagnostics) {
		this.diagnostics = diagnostics;
	}

	public int getTreatments() {
		return treatments;
	}

	public void setTreatments(int treatments) {
		this.treatments = treatments;
	}

	public int getTraumaCenter() {
		return traumaCenter;
	}

	public void setTraumaCenter(int traumaCenter) {
		this.traumaCenter = traumaCenter;
	}

	public int getDentalCenter() {
		return dentalCenter;
	}

	public void setDentalCenter(int dentalCenter) {
		this.dentalCenter = dentalCenter;
	}

	public int getRecidenceRooms() {
		return recidenceRooms;
	}

	public void setRecidenceRooms(int staffRecidences) {
		this.recidenceRooms = staffRecidences;
	}

	public int getParking() {
		return parking;
	}

	public void setParking(int parking) {
		this.parking = parking;
	}

	public int getWaitRooms() {
		return waitRooms;
	}

	public void setWaitRooms(int waitRooms) {
		this.waitRooms = waitRooms;
	}

	public int getFrontDesk() {
		return frontDesk;
	}

	public void setFrontDesk(int frontDesk) {
		this.frontDesk = frontDesk;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return "Name:"+name+" type:"+type+" frontDesk:"+frontDesk+" waitRooms:"+waitRooms+" Parking:"+parking+
				" recidenceRooms:"+recidenceRooms+" dentalCenter:"+dentalCenter+" traumaCenter:"+traumaCenter+
				" treatments:"+treatments+" diagnostics:"+diagnostics+" bedRooms:"+bedRooms;
	}

}
