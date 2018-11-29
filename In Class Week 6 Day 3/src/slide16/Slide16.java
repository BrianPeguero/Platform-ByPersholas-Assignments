package slide16;

/**
 * The program reads in a file character by character and outputs it 
 * to the console
 * 
 * 
 * @author Brian
 * */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Slide16 {
		
		public static String readIn(BufferedReader br) {
			/**
			 * Using the inputstream the file reads line by line
			 * and returns the line read in
			 * 
			 * @param BufferedReader  reading a file stream
			 * @return line  The String representation of the character
			 * */
			String line = null;
			try {
				line = br.readLine();
			} catch (IOException e) {
				System.out.println("Could not read file.");
			}
			return line;
		}
		
		public static void read(BufferedReader br) throws IOException {
			/**
			 * The method loops through the file until readin return null or the end of the file
			 * 
			 * @param br  a BufferedReader holding an InputStream of the file
			 * 
			 * @return
			 * */
			String line;
			
			while((line = readIn(br)) != null) {
				System.out.println(line);
			}
		}

		public static void main(String[] args) {
			/**
			 * The entry point of the program that initializes the FileReader, FileWriter, InputStrem, and OutputStream
			 * passed to other functions to carry out the rest of the program and finally closes the streams when done processing
			 * */
			
			FileReader inputStream = null;
			BufferedReader br = null;
			try {
				inputStream = new FileReader(new File("C:\\Users\\brian\\Desktop\\readin.txt"));
				br = new BufferedReader(inputStream);
			} catch (IOException e) {
				System.out.println("You sure the files are there?");
			}
			
			
			try {
				read(br);
			} catch (IOException e) {
				System.out.println("Sorry something went wrong.");
			}
			
			try {
				inputStream.close();
				br.close();
			} catch (IOException e) {
				System.out.println("Exiting program");
			}
			
		}
}
