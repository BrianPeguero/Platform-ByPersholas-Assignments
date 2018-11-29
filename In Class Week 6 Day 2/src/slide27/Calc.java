package slide27;
/*
 * The use of the program is to better understand chaining methods and optimize speed while coding.
 * The Calc class can take a list and total them up. The Calc class can also take in 2 integers and perform an operation
 *  given to it on them as well.
 * The class Calc has 3 fields num1, num2, and sum.
 * 
 * */
import java.util.Arrays;
import java.util.List;

public class Calc {
	
	public int sum;
	public int num1;
	public int num2;

	public Calc performSum(List<Integer> nums) {
		/**
		 * The method loops through the list and adds up the total in the sum field of calc
		 * 
		 * @param nums  list of integer elements
		 **/
		for(int i = 0; i < nums.size(); i++) {
			this.sum = this.sum + nums.get(i);
		}
		return this;
	}
	
	public void displaySum() {
		/**
		 * Displays a the field sum from the Calc class
		 * 
		 * @return
		 **/
		 System.out.println(this.sum);
	}
	
	public Calc numberToPerformOn(int num1, int num2) {
		/**
		 * Given 2 integer parameters it sets the fields of the calc class to them as well as
		 * returns the whole class to be performed in another operation
		 * 
		 * @param num1  integer type value
		 * @param num2  integer type value
		 * */
		this.num1 = num1;
		this.num2 = num2;
		
		return this;
	}
	
	public void Operation(String operator) {
		/**
		 * Operation utilizes a switch case to decipher which operation was passed in and displays
		 * the arithmetic solution
		 * 
		 * @param String Operator 
		 *
		 **/
		switch (operator) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-" :
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		}
	}
	
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.performSum(Arrays.asList(3,4,7)).displaySum();
		
		calc.numberToPerformOn(3, 4).Operation("*");

	}

}
