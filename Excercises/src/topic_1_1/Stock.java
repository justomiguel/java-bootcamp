package topic_1_1;

import java.util.HashMap;
import java.util.Observable;


//there should be a lot more functionality for stock
//implemented this class because the changed price requirement didn't make sense on the Shopping Cart
//so both change price and add item are observed from here
public class Stock extends Observable{
	
	private static Stock instance;
	private HashMap<String, Item> productsAndOffers;
	
	private Stock(){
		productsAndOffers = new HashMap<String, Item>();
	}
	
	public static Stock getInstance(){
		if(instance == null)
			return new Stock();
		return instance;
	}
	
	public void addItem(Item i){
		productsAndOffers.put(i.getName(), i);
	}
	
	//should send more information, the object itself maybe, but for simplicity, i only sent a message
	public void notifyPriceChange(Item i){
		this.setChanged();
		this.notifyObservers("Item "+ i.getName() + "has changed price to "+ i.getPrice());
	}
	
	public void notifyAddedChange(Item i){
		this.setChanged();
		this.notifyObservers("Item "+ i.getName() + "was added");
	}
	
	public void changePrice(String name, float newPrice){
		Item i = productsAndOffers.get(name);
		if(i != null){
			i.setPrice(newPrice);
			notifyPriceChange(i);
		}
	}
}
