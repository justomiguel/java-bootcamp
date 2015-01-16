package topic_1_1;

public class PayPalPayment implements Payment {
	private String email;
	private String password;
	private Discount discount;
	
	public PayPalPayment(String email, String password){
		this.email = email;
		this.password = password;
		discount = new CheapestItemFreeDiscount();
	}
	
	public Discount getDiscount() {
		return discount;
	}
	
	public void setDiscount(Discount d) {
		this.discount = d;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void pay(float amount) {
		// make the payment, communicate with paypal
	}
}
