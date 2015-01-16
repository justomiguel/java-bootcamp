package topic_1_1;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		//Test for topics 1 and 2 and 3
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new Product("Computer", 1000, "Used"));
		cart.addItem(new Product("Mouse", 40, "New"));
		cart.addItem(new Product("Keyboard", 100, "New"));
		
		cart.setPayment(new PayPalPayment("iberras@gmail.com", "*****"));
		Transaction t = cart.checkOut();
		
		
		
		//Test for composite pattern
		Product p1 = new Product("Computer", 1000, "Used");
		Product p2 = new Product("casa", 1000, "Used");
		Product p3 = new Product("perro", 1000, "Used");
		
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(p1);
		items.add(p2);
		items.add(p3);
		
		Offer o = new Offer("Oferta 1",30, items);
		System.out.println(o.print());
	}

}
