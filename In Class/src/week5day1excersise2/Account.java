package week5day1excersise2;

public class Account extends Bank{
	
	private double balance;
	
	public Account(String bl) {
		super(bl);
		this.balance = 0.0;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void checkBalance() {
		System.out.println("The current balance is " + getBalance());
	}
	
}