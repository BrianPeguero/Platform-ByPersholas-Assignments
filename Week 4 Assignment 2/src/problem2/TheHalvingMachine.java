package problem2;
import java.util.Scanner;

public class TheHalvingMachine {
	
	public static long getNumb() {
		Scanner input = new Scanner(System.in);
		long numb = 1;
		
		System.out.println("Enter an even number:");
		
		numb = input.nextLong();
		
		if ((isZero(numb))) {
			System.out.println("Hey thats not a valid input!");
		}
		
		input.close();
		
		return numb;
	}
	
	public static boolean isEven(long numb) {
		return numb%2==0;
	}
	
	public static boolean isZero(long numb) {
		return numb<=0;
	}
	
	public static void display(long halved) {
		System.out.println(halved);
	}
	
	
	public static void halvingMachine(long numb) {
		while (!(isZero(numb)) && !(numb == 1)) {
			if (isEven(numb)) {
				numb = numb/2;
				display(numb);
			} else {
				numb++;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long numb = getNumb();
		
		halvingMachine(numb);
		
	}

}
