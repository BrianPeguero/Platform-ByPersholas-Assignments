package week5day1excersise2;

public class TestBank {

	public static void main(String[] args) {
		Checking c1 = new Checking("Bronx, NY");
		
		c1.checkLocation();
		Bank.changeBank("Chase Bank");
		c1.deposit(100);
		c1.deposit(200);
		c1.witdraw(250);
		c1.deposit(300);
		c1.witdraw(400);
		c1.checkBalance();
		
		Savings s1 = new Savings("Bronx, NY");
		System.out.println(s1.getBankName());
		s1.changeLocation("New York, NY");
		s1.deposit(100);
		s1.deposit(200);
		s1.deposit(300);
		s1.checkBalance();
		s1.getInterestTotal();

	}

}
