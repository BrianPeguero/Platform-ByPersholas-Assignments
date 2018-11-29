package problem3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The program asks for a name and score from a user
 * and writes it to a file.
 * 
 * @author Brian
 * */
public class BasicIOProb3 {
	
	 /**
	  * The method asks the user for a name and returns it
	  * 
	 * @param br  BufferedReader 
	 * 
	 * @return name  String
	 * */
	public static String getName(BufferedReader br) {
		System.out.println("Please enter your name: ");
		
		String name = "";
		
			try {
				name = br.readLine();
			} catch (IOException e) {
				System.out.println("Sorry, I didn't quite get that");
			}
		
		
		return name;
	}
	
	
	/**
	 * The method asks the user for a score and returns it
	 * 
	 * @param br  BufferedReader 
	 * 
	 * @return score  int  
	 * */
	public static int getScore(BufferedReader br) {
		int score = 0;
		
		System.out.println("Please enter an integer.");
		
		try {
			score = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.out.println("Sorry that wasn't an integer");
		}
		
		
		return score;
	}
	
	/**
	 * The method takes in an integer and a string to write to a file
	 * 
	 * @param name  String
	 * @param score an integer 
	 * 
	 * @return
	 * */
	public static void toFile(String name, int score) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\brian\\Desktop\\score.txt"));
			
			bw.write(name + " got a score of " + score + " on the math test.\n");
			
			bw.close();
			
		} catch (IOException e) {
			System.out.println("Can't write to file");
		}
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name = getName(br);
		int score = getScore(br);
		
		toFile(name, score);
		
	}

}
