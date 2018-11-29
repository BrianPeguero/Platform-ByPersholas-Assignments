package slide20;

/**
 * The program loops through a 2 column text file filled with doubles
 * and prints to the screen the total
 * 
 * @author Brian
 * */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Slide20 {
	
	public static void read(Scanner s) {
		/**
		 * This method is passed in a Scanner object holding a buffered input stream
		 * 
		 * @param s  Scanner type object holding a buffered input stream 
		 * */
		double sum = 0;
		
		while (s.hasNext()) {
			if(s.hasNextDouble()) {
				sum = sum + s.nextDouble();
			} else {
				System.out.println(s.next());
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		/**
		 * The method initializes Scanner to read from a buffered input stream and sends it to 
		 * the read method for processing.
		 * 
		 * */
		Scanner s = null;
		File readin = new File("C:\\Users\\brian\\Desktop\\readin.txt");
		
		try {
			
			s = new Scanner(new BufferedReader(new FileReader(readin)));
		
		} catch (IOException e) {
		
			System.out.println("can't open file.");
		
		}
		
		read(s);
		
		
		s.close();
	}

}
