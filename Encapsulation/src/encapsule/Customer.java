package encapsule;

public class Customer {
	private int customerId;
	private String customerName;
	private double Amount;
	private long Phone;
	Customer(int customerId, String customerName, double Amount){
		this.customerId = customerId;
		this.customerName = customerName;
		this.Amount = Amount;
	}
	public void setPhone(long Phone) {
		this.Phone = Phone;
	}
	public long getPhone() {
		return Phone;
	}
	public void setAmount(double Amount) {
		this.Amount = this.Amount + Amount;
	}
	public double getAmount() {
		return Amount;
	}
	public String getCustomername() {
		return customerName;
	}
	public int CustomerId() {
		return getCustomerId();
	}
	public int getCustomerId() {
		return customerId;
	}
}
