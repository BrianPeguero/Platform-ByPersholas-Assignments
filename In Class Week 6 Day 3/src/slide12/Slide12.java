package slide12;

/**
 * The program reads in a file character by character and outputs it to another
 * file 
 * 
 * @author Brian
 * */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Slide12 {
	
	public static int readIn(FileReader readIn) {
		/**
		 * Using the inputstream the file reads character by character
		 * and returns the integer
		 * 
		 * @param readIn  reading a file stream
		 * @return numb  the integer representation of the character
		 * */
		int numb = -1;
		try {
			numb = readIn.read();
		} catch (IOException e) {
			System.out.println("Could not read file.");
		}
		return numb;
	}
	
	public static void readOut(FileWriter readout, int c) {
		/**
		 * Using the outputstream the file writes character by character
		 * 
		 * @param readOut  reading a file stream
		 * @return
		 * */
		try {
			readout.write(c);
		} catch (IOException e) {
			System.out.println("Couldn't write to file.");
		}
	}
	
	public static void read(FileReader readIn, FileWriter readOut) throws IOException {
		/**
		 * The method loops through the file until readin return -1 or the end of the file
		 * 
		 * @param readIn  a FileReader holding an InputStream of the file
		 * @param readOut a FileWriter holding an OutputStream of the file
		 * 
		 * @return
		 * */
		int c;
		
		while((c = readIn(readIn)) != -1) {
			readOut(readOut, c);
		}
	}

	public static void main(String[] args) {
		/**
		 * The entry point of the program that initializes the FileReader, FileWriter, InputStrem, and OutputStream
		 * passed to other functions to carry out the rest of the program and finally closes the streams when done processing
		 * */
		
		FileReader inputStream = null;
		FileWriter outputStream = null;
		try {
			inputStream = new FileReader(new File("C:\\Users\\brian\\Desktop\\readin.txt"));
			outputStream = new FileWriter(new File("C:\\Users\\brian\\Desktop\\readout.txt"));
		} catch (IOException e) {
			System.out.println("You sure the files are there?");
		}
		
		
		try {
			read(inputStream, outputStream);
		} catch (IOException e) {
			System.out.println("Sorry something went wrong.");
		}
		
		try {
			inputStream.close();
			outputStream.close();
		} catch (IOException e) {
			System.out.println("Exiting program");
		}
		
	}

}
