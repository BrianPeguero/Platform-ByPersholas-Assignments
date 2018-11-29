package problem4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The program reads write to a file and reads from it
 * displaying it to the console.
 * 
 * @author Brian
 * */

public class BasicIO {
	
	/**
	 * The method reads from a file and and displays it on the console
	 * 
	 * @param br  a BufferedReader buffer
	 * */
	public static void readFrom(BufferedReader br) throws IOException {
		System.out.println(br.readLine());
	}
	
	/**
	 * The method writes a message to a file 
	 * 
	 * @param bw  a BufferedWriter object
	 * @param line  a String 
	 * **/
	public static void writeTo(BufferedWriter bw, String line) throws IOException {
		bw.write(line);
	}
	
	
	/**
	 * While there is still more lines to write it will write to a file and then read from it.
	 * 
	 * @param br  BufferedReader
	 * @param bw  BufferedWriter
	 * @param message  String
	 * */
	public static void process(BufferedReader br, BufferedWriter bw, String message) throws IOException {
		while ((message = br.readLine()) != null) {
			writeTo(bw, message);
			readFrom(br);
		}
	}

	public static void main(String[] args) {
		String readFile = "C:\\Users\\brian\\Desktop\\readin.txt";
		String writeFile = "C:\\Users\\brian\\Desktop\\readout.txt";
		
		String message = "This is a messge I want to write to a file.";
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader(readFile));
			bw = new BufferedWriter(new FileWriter(writeFile));
			
			
			process(br, bw, message);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not find file");
		} catch (IOException e) {
			System.out.println("Could not read file");
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				System.out.println("Something happened");
			}
			
		}

	}

}
