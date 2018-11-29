package problem6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The program is meant to take input from the user to to choose from a
 * file to open and read every third character to decipher the message hidden inside
 * 
 * @author Brian
 * */
public class BasicIO2Prob6 {
	
	/**
	 * The method uses scanner to retrieve the users choice of file they would
	 * like to open 
	 * 
	 * @return choice  int
	 * */
	public static String getChoice() {
		String choice = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Which puzzle would you like to get solved: 1 or 2?");
		try {
			choice = br.readLine();
		} catch (IOException e) {
			System.out.println("Couldn't read your input");
		}
		
		return choice;
	}
	
	/**
	 * The method opens the file of choice and only stores every third charcter to 
	 * a String variable
	 * 
	 * @param choice  int
	 * */
	public static void solvepuzzle(String choice) {
		int line = 0;
		
		String solvedPuzzle = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\puzzle" + choice + ".txt"));
			
			while((line = br.read()) != -1) {
				if(line%3 == 0) {
					solvedPuzzle = solvedPuzzle + (char) line;
				}
				
				br.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Couldn't open file");
		} catch (IOException e) {
			System.out.println("Can't read file");
		}
		
		System.out.println(solvedPuzzle);
	}
	
	public static void main(String[] args) {
		String choice = getChoice();
		
		solvepuzzle(choice);
	}

}
