package problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;



public class BasicIO {
/**
 * The program reads a file line by line and stores it into an array
 * 
 * @author Brian
 */
	
	
	/**
	 * The method iterates through the array and keeps a
	 * running total of the size
	 * 
	 * @param br  a Buffered Reader
	 * @param path  a Path object
	 * 
	 * @return count  an integer containing the size of the file, line by line
	 * */
	@SuppressWarnings("unused")
	public static int size(BufferedReader br, Path path) {
		
		int count = 0;

		try {
			br = Files.newBufferedReader(path);
			String line = "";

			while ((line = br.readLine()) != null) {
				count++;
			}
			br.close();

		} catch (IOException e) {
			e.getStackTrace();
		}

		return count;
	}
	
	
	/**
	 * The method reads through the file a second time in order to store in to the String array
	 * 
	 * @param br  a Buffered Reader object
 	 * @param path  a Path object
	 * 
	 * @return excerpt  a String array containing the content of the file
	 * */
	public static String[] store(BufferedReader br, Path path, int count) {
		String[] excerpt = new String[count];
		String line = null;
		int i = 0;
		
		try {
			br = Files.newBufferedReader(path);
			
			while ((line = br.readLine()) != null) {
				excerpt[i] = line;
				i++;
			}
			
		} catch (IOException e) {
			System.out.println("oh well");
		}
		return excerpt;
	}
	
	/**
	 * The file iterates over the String array to display it to the console
	 * */
	public static void display(String[] excerpt) {
		for (int i = 0; i < excerpt.length; i++) {
			System.out.println(excerpt[i]);
		}
	}

	public static void main(String[] args) {
		Path path = FileSystems.getDefault().getPath("C:\\Users\\brian\\Desktop\\file.txt");
		BufferedReader br = null;
		int count = size(br, path);
		String[] excerpt = store(br, path, count);
		display(excerpt);

	}

}
