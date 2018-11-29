package week5day1excersise2;

public class Bank {
	private static String bankName = "Bank of America";
	
	private String branchLocation;
	
	public Bank(String bl) {
		this.branchLocation = bl;
	}

	
	public String getBankName() {
	return bankName;
	}

	public static void setBankName(String bankName) {
		Bank.bankName = bankName;
	}

	public String getBranchLocation() {
		return branchLocation;
	}

	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}
	
	
	
	public void checkLocation() {
		System.out.println("The current branch location is " + getBranchLocation());
	}


	public void changeLocation(String location) {
		System.out.println("The branch location is changed from " + getBranchLocation() + " to " + location);
		setBranchLocation(location);
	}
	
	public void checkBalance() {
		System.out.println("You need to create an account before checking a balance.");
	}
	
	public static void changeBank(String newBankName) {
		setBankName(newBankName);
		System.out.println("The bank is now " + newBankName);
	}

	
}