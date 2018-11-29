package problem4;
import java.util.Scanner;

public class SpecificLegalProbs {
	
	public static int getAge() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		int age = input.nextInt();
		input.close();
		
		return age;
	}
	
	public static String ageRequirements(int age) {
		String restriction = "";
		
		if(age<=16) {
			restriction = "You can't drive.";
		} else if(age>16 && age<18) {
			restriction = "You can't vote.";
		} else if(age>=18 && age<25) {
			restriction = "You can't rent a car.";
		} else if(age>=25) {
			restriction = "You can do anything that's legal.";
		}
		
		return restriction;
	}
	
	public static void display(String restriction) {
		System.out.println(restriction);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = getAge();
		String restriction = ageRequirements(age);
		display(restriction);
	}

}
