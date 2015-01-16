package topic_1_1;

public class Transaction {
	private Payment payment;
	private float amount;
	private static int uniqueIDTransaction = 0;
	private int IDTransaction;
	
	public Transaction(Payment payment, float amount){
		this.payment = payment;
		this.amount = amount;
		this.IDTransaction = getNewIDTransaction();
	}
	
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	private int getNewIDTransaction(){
		return uniqueIDTransaction++;
	}

	public int getIDTransaction() {
		return IDTransaction;
	}
}
