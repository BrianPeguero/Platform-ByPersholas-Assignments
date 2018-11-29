package week5day3InClass;

public class TaxCalculator {

//Exceptions===========================================
	class CountryNotValidException extends Exception {
		public CountryNotValidException(String message) {
			super(message);
		}
	}

	class EmployeeNameInvalidException extends Exception {
		public EmployeeNameInvalidException(String message) {
			super(message);
		}
	}

	class TaxNotEligibleException extends Exception {
		public TaxNotEligibleException(String message) {
			super(message);
		}
	}

//Methods=================================================
	public double calculateTax(String empName, double empSal, boolean isAmerican) {
		double taxAmount = 0;
		
		if (isAmerican == false) {
			try {
				throw new CountryNotValidException("The employee should be an American citizen for calculating tax");
			} catch (CountryNotValidException c) {
				System.out.println(c.getMessage());
			}
				
		} 
		
		else if (empName.equals(null) || empName.equals("")) {
			try {
				throw new EmployeeNameInvalidException("The employee name can not be empty");
			} catch (EmployeeNameInvalidException n) {
				System.out.println(n.getMessage());
			}
				
		}
		
		else if (empSal > 100000 && isAmerican) {
				taxAmount = empSal * .06;
		} else if ((empSal > 50000 && empSal > 100000) && isAmerican) {
			taxAmount = empSal * .06;
		} else if ((empSal > 30000 && empSal > 50000) && isAmerican) {
			taxAmount = empSal * .06;
		} else if ((empSal > 10000 && empSal > 30000) && isAmerican) {
			taxAmount = empSal * .06;
		} else {
			try {
				throw new TaxNotEligibleException("The employee does not need to pay tax");
			} catch (TaxNotEligibleException t) {
				System.out.println(t.getMessage());
			}
		}
		
		return taxAmount;
	}
	
	
	public static void main(String[] args) {
		System.out.println("The tax amount is " + new TaxCalculator().calculateTax("Ron", 34000, false));
		System.out.println("The tax amount is " + new TaxCalculator().calculateTax("Tim", 1000, true));
		System.out.println("The tax amount is " + new TaxCalculator().calculateTax("Jack", 55000, true));
		System.out.println("The tax amount is " + new TaxCalculator().calculateTax("", 30000, true));
	}

}
