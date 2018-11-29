package inheritanceActivity;

public class Manager extends Employee{

	public Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.setBasicSalary(salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = 15 * (getBasicSalary()/100);
		System.out.println("Your transportation allowance is: " + transportAllowance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
