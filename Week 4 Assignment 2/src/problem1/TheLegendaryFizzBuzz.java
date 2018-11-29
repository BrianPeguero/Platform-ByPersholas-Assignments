package problem1;

public class TheLegendaryFizzBuzz {
	
	public static void displayFizz() {
		System.out.println("Fizz");
	}
	
	public static void displayBuzz() {
		System.out.println("Buzz");
	}
	
	public static void displayFizzBuzz() {
		System.out.println("Fizz Buzz");
	}

	public static boolean isDivisible3(int i) {
		return i%3==0;
	}
	
	public static boolean isDivisible5(int i) {
		return i%5==0;
	}
	
	public static boolean isDivisible3and5(int i) {
		return i%3==0 && i%5==0;
	}
	
	public static void loop() {
		for (int i = 0; i<100; i++) {
			 if(isDivisible3and5(i)) {
				displayFizzBuzz();
			} else if (isDivisible5(i)) {
				displayBuzz();
			} else if(isDivisible3(i)) {
				displayFizz();
			} else{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop();
	}

}
