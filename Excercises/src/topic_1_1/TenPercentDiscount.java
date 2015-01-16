package topic_1_1;

import java.util.List;

public class TenPercentDiscount implements Discount {

	@Override
	public float apply(List<Product> items) {
		float amount = 0;
		for(Product i: items){
			amount += i.getPrice();
		}
		amount *= 0.9;
		return amount;
	}


}
