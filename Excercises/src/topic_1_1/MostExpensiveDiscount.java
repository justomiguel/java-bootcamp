package topic_1_1;

import java.util.List;

public class MostExpensiveDiscount implements Discount {

	@Override
	public float apply(List<Product> items) {
		float max = 0;
		float amount = 0;
		for(Product i: items){
			amount += i.getPrice();
			if(i.getPrice() > max)
				max = i.getPrice();
		}
		amount -= max;
		max *= 0.1;
		amount += max;
		
		return amount;
	}

}
