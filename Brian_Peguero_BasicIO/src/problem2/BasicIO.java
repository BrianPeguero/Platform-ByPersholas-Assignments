package problem2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BasicIO {
/**
 * The program reads a file line by line and stores it in a String variable
 * 
 * @author Brian
 **/
	
	public static String read(BufferedReader br, String file) { 
		/**
		 * The method method takes in a BufferedReader and a String containing the file you want to read.
		 * reads the file line by line and stores it in a String variable
		 * 
		 * @param br  a BufferedReader object
		 * @param file The String representation of the files path
		 * 
		 * @return excerpt  a String that contains all the line of the file
		 * **/
		String line;
		String excerpt = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			while ((line = br.readLine()) != null) {
				excerpt = excerpt + line;
			}
			
		} catch (IOException e) {
			System.out.println("Couldn't open or read the file.");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
			}
		}
		return excerpt;
	}
	
	public static void main(String[] args) {
		/**
		 * Entry point of the method that initializes the 
		 * buffered reader and stores the contents of the file in a String
		 * */
		String file = "C:\\Users\\brian\\Desktop\\File.txt";
		
		BufferedReader br = null;
		String excerpt = read(br, file);
				
		System.out.println(excerpt);
		

	}

}
