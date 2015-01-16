package topic_1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class MarketManager implements Observer{

	Observable observable;
	List<String> messages;
	
	
	public MarketManager(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
		this.messages = new ArrayList<String>();
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Stock){
			messages.add((String)arg);
		}
		else if(o instanceof ShoppingCart){
			messages.add("Transaction Executed. Number: "+ ((Transaction)arg).getIDTransaction());
		}
	}
}
