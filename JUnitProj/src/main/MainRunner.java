package main;

public class MainRunner {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		calculator();
	}
	
	public static void calculator() {
		int n = 0;
		int m = 0;
		int result = 0;
		
		n = 1;
		m = 2;
		
		result = new Calculator().adder(n, m);
		System.out.println(result);
	}
	
}
