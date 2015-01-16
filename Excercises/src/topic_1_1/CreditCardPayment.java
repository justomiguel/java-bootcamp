package topic_1_1;

public class CreditCardPayment implements Payment{

	private String name;
	private int creditCardNumer;
	private Discount discount;
	
	public CreditCardPayment(String name, int creditCardNumer){
		this.name = name;
		this.creditCardNumer = creditCardNumer;
		discount = new TenPercentDiscount();
	}
	
	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditCardNumer() {
		return creditCardNumer;
	}

	public void setCreditCardNumer(int creditCardNumer) {
		this.creditCardNumer = creditCardNumer;
	}

	public void pay(float amount) {
		// TODO Auto-generated method stub
		
	}
}
