package week5day1excersise2;

public class Savings extends Account {

	private static double interestRate = 5;
	
	private double interestTotal;
	private double depositTotal;
	
	public Savings(String bl) {
		super(bl);
		this.depositTotal = 0;
		this.interestTotal = 0;
	}
	
	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		Savings.interestRate = interestRate;
	}

	public double getInterestTotal() {
		return interestTotal;
	}

	public void setInterestTotal(double interestTotal) {
		this.interestTotal = interestTotal;
	}

	public double getDepositTotal() {
		return depositTotal;
	}

	public void setDepositTotal(double depositTotal) {
		this.depositTotal = depositTotal;
	}

	public void checkBalance() {
		System.out.println("The total deposited amount is $" + getDepositTotal());
		System.out.println("The total amount of interest is $" + getInterestTotal());
		System.out.println("==Savings Account==");
		System.out.println("The current balance is $" + getBalance());
	}
	
	public void deposit(double amt) {
		double interest = getBalance() * getInterestRate();
		setBalance(getBalance() + interest);
		setDepositTotal(amt);
		setInterestTotal(interest);
		
		System.out.println("$" + amt + " deposited into the savings account");
		System.out.println("Interest in the amount of $" + interest + " added to the savings account");

		checkBalance();
	}
}
