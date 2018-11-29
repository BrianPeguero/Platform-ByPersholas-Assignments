package problem7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * The program finds the longest word in the file and displays it to the console
 * 
 * @author Brian
 * */
public class LongestWordInFile {
	
	
	/**
	 * The method reads the contents of the file line by line and returns a string containing
	 * all its contents.
	 * 
	 * @throws IOException
	 * @param br  BufferedReader
	 * 
	 * @return excerpt String
	 * */
	public static String read(BufferedReader br) throws IOException {
		String line = "";
		String excerpt = "";
		
		while((line = br.readLine()) != null) {
			excerpt = excerpt + line + " ";
		}
		return excerpt;
	}
	
	/**
	 * The method accepts a String and Strips it of all special characters.
	 * Then splits the string by the white spaces and iterats through the list to
	 * find the longest word
	 * 
	 * @param excerpt  String
	 * */
	public static void longestWord(String excerpt) {
		String longestWord = "";
		
		String[] excerptArray = excerpt.replaceAll("[\\-\\+\\.\\^\\n:?,;]","").split(" ");
		
		for(int i = 0; i < excerptArray.length; i++) {
			if(excerptArray[i].length() > longestWord.length()) {
				longestWord = excerptArray[i];
			}
		}
		System.out.println(longestWord);
	}

	public static void main(String[] args) {
		String file = "C:\\Users\\brian\\Desktop\\File.txt";
		
		String excerpt = "";
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			excerpt = read(br);
			longestWord(excerpt);
		} catch (FileNotFoundException e) {
			System.out.println("Couldnt Open the file");
		} catch (IOException e) {
			System.out.println("could not read file");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
