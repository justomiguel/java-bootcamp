package topic_1_1;

import java.util.List;

public class CheapestItemFreeDiscount implements Discount {

	
	public float apply(List<Product> items) {
		float min = Product.MAX_PRICE;
		float amount = 0;
		for(Product i: items){
			amount += i.getPrice();
			if(i.getPrice() < min)
				min = i.getPrice();
		}
		amount -= min;
		return amount;
	}
}
