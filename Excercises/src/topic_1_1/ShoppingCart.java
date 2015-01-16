package topic_1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


public class ShoppingCart extends Observable{
	
	private List<Product> items;
	private Payment payment;
	
	public ShoppingCart(){
		items = new ArrayList<Product>();
	}
	
	public void setPayment(Payment payment){
		this.payment = payment;
	}
	
	public void deleteItem(Product i){
		items.remove(i);
	}
	
	public void addItem(Product i){
		items.add(i);
	}
	
	public void notifyTransactionChange(Transaction t){
		this.setChanged();
		this.notifyObservers(t);
	}
	
	public Transaction checkOut(){
		float amount = payment.getDiscount().apply(items);
		payment.pay(amount);
		emptyCart();
		Transaction t = new Transaction(payment, amount);
		notifyTransactionChange(t);
		return t;
	}

	private void emptyCart() {
		items.clear();
		
	}
}
