package problem1;

/**
 * The program is meant to read a file line by line
 * using the nio library and newBufferedReader method
 * 
 * @author Brian
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class BasicIO {
	
	public static void read(BufferedReader br) throws IOException {
		/**
		 * The method is passed in a BufferedReader and processes the file
		 * line by line to print out to the screen
		 * 
		 * @param br  newBufferedReader buffer holding a stream of the file
		 * */
		String line;
		
		while((line = br.readLine()) != null) {
				System.out.println(line);
			}
	}

	public static void main(String[] args) {
		/**
		 * Entry point of the program that initializes a path object to be passex into
		 * a newBufferedReader buffer.
		 * */
		Path path = FileSystems.getDefault().getPath("C:\\Users\\brian\\Desktop", "File.txt");
		BufferedReader br = null;
		try {
			br = Files.newBufferedReader(path);
			
			read(br);
		} catch (IOException e) {
			System.out.println("Couldn't open or read file");
		
		}
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("couldn't close file");
		}
		
	}

}
