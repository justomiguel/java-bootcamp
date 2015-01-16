package topic_1_1;

import java.util.List;

public class Offer implements Item {
	
	private List<Item> items;
	private String name;
	private float price;
	
	public Offer(String name, float price, List<Item> items){
		this.name = name;
		this.items = items;
		this.price = price;
	}
	
	@Override
	public String print() {
		StringBuilder result = new StringBuilder();
		result.append(Product.newLine);
		result.append("Offer...." + name + " $"+ price);
		result.append(Product.newLine);
		for(Item i: items){
			result.append(Product.newLine);
			result.append(" "+ i.print());
			result.append(Product.newLine);
		}
		return result.toString();
	}

	public float getPrice(){
		return price;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
