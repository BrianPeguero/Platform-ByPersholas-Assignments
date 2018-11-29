package problem1;


/**
 * A Program that creates a letter with my name and address to the screen
 * 
 * @author Brian
 * */
public class Letter {
	
	/**
	 * Responsible for making the top and bottom lines of the letter
	 * */
	public static void border() {
		System.out.print("|");
		for(int i = 0; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println("|");
	}
	
	/**
	 * Responsible for making the stamp of the letter
	 * */
	public static void stamp() {
		System.out.print("|");
		for(int i = 0; i < 46; i++) {
			if(i >= 42) {
				System.out.print("#");
			}
			System.out.print(" ");
		}
		System.out.println("|");
	}
	
	/**
	 * Responsible for making empty space of the letter
	 * */
	public static void blank() {
		System.out.print("|");
		for(int i = 0; i < 50; i++) {
			System.out.print(" ");
		}
		System.out.println("|");
	}
	
	/**
	 * Responsible for making the line holding the name for the letter
	 * */
	public static void name() {
		System.out.print("|");
		for(int i = 0; i < 37; i++) {
			System.out.print(" ");
			if (i == 30) {
				System.out.print("Brian Peguero");
			}
		}
		
		System.out.println("|");
	}

	/**
	 * Responsible for making the line holding the address on the letter
	 * */
	public static void addressLine1() {
		System.out.print("|");
		for(int i = 0; i < 34; i++) {
			System.out.print(" ");
			if (i == 27) {
				System.out.print("884 Riverside Dr");
			}
		}
		
		System.out.println("|");
	}

	/**
	 * Responsible for making the line holding the address on the letter
	 * */
	public static void addressLine2() {
		System.out.print("|");
		for(int i = 0; i < 31; i++) {
			System.out.print(" ");
			if (i == 24) {
				System.out.print("New York, NY, 10032");
			}
		}
		
		System.out.println("|");
	}
	
	public static void main(String[] args) {
		border();
		stamp();
		stamp();
		stamp();
		blank();
		blank();
		name();
		addressLine1();
		addressLine2();
		blank();
		blank();
		border();
		
	}

}
