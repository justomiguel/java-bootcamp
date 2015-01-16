package topic_1_1;

public class CashPayment implements Payment{

	private Discount discount;
	
	public CashPayment(){
		discount = new MostExpensiveDiscount();
	}
	
	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
	public void pay(float amount) {
		// make the payment
		
	}
}
