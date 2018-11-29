package problem2;
import java.util.Scanner;

public class LegalProblems {

	
	@SuppressWarnings("resource")
	public static String getName() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Whats your name?");
		String name = input.nextLine();
		
		return name;
	}
	
	public static int getAge(String name) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Whats your age " + name + "?");
		int age = input.nextInt();
		input.close();
		
		return age;
	}
	
	public static void ageRequirments(String name, int age) {
		if (age < 16){
			display(name + ", You can't drive");
		}
		if (age < 18) {
			display(name + ", You can't vote");
		}
		if (age < 25) {
			display(name + ", You can't rent a car");
		}
		if (age >= 25) {
			display(name + ", You can do anything!");
		}
	}
	
	public static void display(String restrictions) {
		System.out.println(restrictions);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = getName();
		int age = getAge(name);
		ageRequirments(name, age);

	}

}
