package topic_1_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import topic_1_1.ShoppingCart;
import topic_1_1.Stock;
import topic_1_1.Transaction;


//Class added to show observer pattern
public class MusicView implements Observer{

	Observable observable;
	
	
	public MusicView(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof TrackController){
			//Show the selected song in a special view
		}
	}
}
