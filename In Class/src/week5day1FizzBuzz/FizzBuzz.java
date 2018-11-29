package week5day1FizzBuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {
	
	public static String getInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your parenthasis: ");
		String input = br.readLine();
		
		br.close();
		
		return input;
	}
	
	public static void parseString(String input) {
		int left = 0;
		int right = 0;
		
		String leftParen = "(";
		String rightParen = ")";
		
		for(int i = 0; i <= input.length() - 1; i++) {
			if(Character.toString(input.charAt(i)).equals(leftParen)) {
				left++;
			} else if (Character.toString(input.charAt(i)).equals(rightParen)) {
				right++;
			}
		}
		
	}
	
	public static void main(String[] args) {
		try {
			String input = getInput();
		} catch (IOException e) {
			System.out.println("Bitch");
		}
	}

}
