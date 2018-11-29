package problem6;

public class DivisibleBy {
	
	public static boolean isEven(int numb) {
		return numb%2==0;
	}
	
	public static boolean isDivisableBy3(int numb) {
		return numb%3==0;
	}
	
	public static void loop() {
		for (int i=0; i<=20; i++) {
			if (isEven(i) && (isDivisableBy3(i))){
				System.out.println(i + "<=");
			} else if (isEven(i)) {
				System.out.println(i + "<");
			} else if (isDivisableBy3(i)) {
				System.out.println(i + "=");
			} else  {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop();
	}

}
