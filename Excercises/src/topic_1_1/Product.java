package topic_1_1;

public class Product implements Item {
	
	public static final float MAX_PRICE = 1000000000;
	public static String newLine = System.getProperty("line.separator"); 
	private String name;
	private float price;
	private String description;
	
	public Product(String name, float price, String description){
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String print() {
		return "Item"+this.getName()+ "....... $ "+ this.getPrice();
	}
}
