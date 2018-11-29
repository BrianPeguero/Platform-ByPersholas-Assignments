package inheritanceActivity;

public class InheritanceActivity{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m1 = new Manager(126534, "Peter", "Chennai", 237844, 65000);
		m1.calculateSalary();
		m1.calculateTransportAllowance();
		
		Trainee t1 = new Trainee(29846, "Jack", "Mumbai, India", 442085, 45000);
		t1.calculateSalary();
		t1.calculateTransportAllowance();
		
	}

}
