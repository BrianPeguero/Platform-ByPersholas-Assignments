package problem5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * The program asks the user which of the two files of integers they would like
 * to open and find the sum of.
 * 
 * @author Brian
 * **/
public class BasicIO2Prob5 {
	
	/**
	 * The method gets an input from the user and returns it
	 * 
	 * @return Brian
	 * */
	public static String getChoice() {
		System.out.println("Which file would you like to open; 1, 2, or 3?");
		
		Scanner input = new Scanner(System.in);
		String choice = input.next();
		
		input.close();
		
		return choice;
	}
	
	/**
	 * The method opens the file of choice and creates a running total
	 * of the integers in it.
	 * 
	 * @param choice  integer
	 * */
	public static void openFile (String choice) {
		int total = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\" + "nums" + choice + ".txt"));
			
			for (int i = 0; i < 3; i++) {
				total = total + br.read();
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Couldn't open the file");
		} catch (NumberFormatException e) {
			System.out.println("Not an Integer");
		} catch (IOException e) {
			System.out.println("Couldn't read from file");
		}
		
		System.out.println("The total from the file was " + total);
		
	}

	public static void main(String[] args) {
		String choice = getChoice();
		
		openFile(choice);
	}

}
