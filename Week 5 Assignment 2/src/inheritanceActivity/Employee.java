package inheritanceActivity;

public class Employee {
	
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private long employeePhone;
	private double basicSalary;
	private double specialAllowance = 250.80;
	private double hra = 1000.50;
	
	public Employee(long id, String name, String address, long phone){
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
//========== setter methods ========================================================
	
	public long getEmployeeId() {
		return this.employeeId;
	}
	
	public String getEmployeeName() {
		return this.employeeName;
	}
	
	public String getEmployeeAdress() {
		return this.employeeAddress;
	}
	
	public long getEmployeePhone() {
		return this.employeePhone;
	}
	
	public double getBasicSalary() {
		return this.basicSalary;
	}
	
	public double getSpecialAllownce() {
		return this.specialAllowance;
	}
	
	public double getHra() {
		return this.hra;
	}
	
	
//== Setter Methods ============================================	
	public void setEmployeeId(long id) {
		this.employeeId = id;
	}
	
	public void setEmployeeName(String name) {
		this.employeeName = name;
	}
	
	public void setEmployeeAdress(String address) {
		this.employeeAddress = address;
	}
	
	public void setEmployeePhone(long phone) {
		this.employeePhone = phone;
	}
	
	public void setBasicSalary(double salary) {
		this.basicSalary = salary;
	}
	
	public void setSpecialAllownce(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}
	
	public void setHra(double hra) {
		this.hra = hra;
	}
	
	
//====================================================================
	public void calculateSalary() {
		double salary = getBasicSalary() + (getBasicSalary() * 
				getSpecialAllownce()/100) +
				(getBasicSalary() * (getHra()/100));
		System.out.println(getEmployeeName() + " is making: " + salary);
	}
	
	public void calculateTransportAllowance() {
		double transportAllowance = ((getBasicSalary() * 10)/100);
		System.out.println("Your transportation allowance is: " + transportAllowance);
	}
	
	
	
}