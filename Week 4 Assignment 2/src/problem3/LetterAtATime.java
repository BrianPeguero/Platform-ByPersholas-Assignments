package problem3;
import java.util.Scanner;

public class LetterAtATime {
	
	public static String getMessage() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What's your message?");
		String message = input.nextLine();
		
		input.close();
		return message;
	}
	
	public static void perChar(String message) {
		for (int i=0; i<=message.length()-1; i++) {
			System.out.println(i + ": " + message.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = getMessage();
		perChar(message);
	}

}
