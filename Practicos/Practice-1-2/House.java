
public class House {
	private  int bedroom, bathroom, kitchen, garage, diningroom, atic;
	
	public int getBedroom(){
		return(this.bedroom);
	
	}
	
	public void setBedroom(int bedroom){
		this.bedroom = bedroom;
	}
	
	public int getBathroom(){
		return(this.bedroom);
	
	}
	
	public void setBathroom(int bathroom){
		this.bathroom = bathroom;
	}
	
	public int getKitchen(){
		return(this.kitchen);
	
	}
	
	public void setKitchen(int kitchen){
		this.kitchen = kitchen;
	}
	
	public int setGarage(){
		return(this.garage);
	
	}
	
	public void setGarage(int garage){
		this.garage = garage;
	}
	
	public int setDiningroom(){
		return(this.diningroom);
	
	}
	
	public void setDiningroom(int diningroom){
		this.diningroom = diningroom;
	}

	public int setAtic(){
		return(this.atic);
	
	}
	
	public void setAtic(int atic){
		this.atic = atic;
	}
	
	public String toString() {
		return "House with: " + bedroom + " bedroom/s, " + bathroom + " bathroom/s, " + garage + " garage/s, " + diningroom + " diningroom/s, " + atic + " atic";
	}
}
