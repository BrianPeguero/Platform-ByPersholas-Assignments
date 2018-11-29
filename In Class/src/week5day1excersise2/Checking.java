package week5day1excersise2;

public class Checking extends Account{

	public Checking(String bl) {
		super(bl);
		
	}
	
	public void checkBalance() {
		System.out.println("== Checking Account ==");
		super.checkBalance();
	}
	
	public void deposit(double amt) {
		System.out.println(amt + " deposited to the checking account");
		setBalance(amt);
	}
	
	public void witdraw(double amt) {
		if (getBalance() >= amt) {
			System.out.println("$" + amt +" withdrawn from the checking account");
			setBalance(getBalance() - amt);
		} else {
			setBalance(0);
			System.out.println("The current balance is smaller than the withdrawal amount requested");
			System.out.println("$" + amt + " withdrawn from the checking account");
		}
		
		checkBalance();
	}
	
}
