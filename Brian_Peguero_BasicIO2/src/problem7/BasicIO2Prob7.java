package problem7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Program that read a file byte by byte and 
 * capitalizes every vowel before being written
 * to a new file.
 * 
 * @author Brian
 * */
public class BasicIO2Prob7 {
	
	/**
	 * Method reads a file character by character
	 * 
	 * @param br  BufferedReader
	 * @throws IOException
	 * */
	public static int readFrom(BufferedReader br) throws IOException {
		return br.read();
	}
	
	/**
	 * Method reads a file character by character
	 * 
	 * @param br  BufferedReader
	 * @throws IOException
	 * */
	public static void writeTo(BufferedWriter bw, String letter) throws IOException {
		bw.write(letter);
	}
	
	/**
	 * Method checks if the vowel passed in is lower case and returns a boolean
	 * if the character is
	 * 
	 * @param letter  String the String representation of the character
	 * 
	 * @return isLower  a boolean
	 * */
	public static boolean isLowerCaseVowel(String letter) {
		String[] vowels = {"a", "e", "i", "o", "u"};
		
		boolean isLower = false;
		for (int i = 0; i<vowels.length; i++) {
			if (letter == vowels[i]) {
				isLower = true;
			}
		}
		return isLower;
	}
	
	/**
	 * Method is passed in a String and returns the vowel to upper case
	 * using a switch case to determine which letter it is.
	 * 
	 * @param Letter  a string containing a vowel
	 * @return letter  a Capitalized version of the vowel
	 * */
	public static String toUpperCase(String letter) {
		if(letter.equals("a")) {
			letter = "A";
		} else if(letter.equals("e")) {
			letter = "E";
		} else if(letter.equals("i")) {
			letter = "I";
		} else if(letter.equals("o")) {
			letter = "O";
		}else if(letter.equals("u")) {
			letter = "U";
		}
		
		return letter;
	}
	
	/**
	 * The method processes the file character by character 
	 * evaluates whether the character passed in is a
	 * vowel and if it is then is passed to a method to capitalize it
	 * finally writes the letter to a file with all the vowels capitalized
	 * 
	 * @param br  BufferedReader
	 * @param bw  BufferedWriter
	 * */
	public static void process(BufferedReader br, BufferedWriter bw) throws IOException {
		int chr = 0;
		
		while ((chr = readFrom(br)) != -1) {
			if (isLowerCaseVowel(String.valueOf(chr))) {
				writeTo(bw, toUpperCase(String.valueOf(chr)));
			}
			writeTo(bw, String.valueOf(chr));
		}
	}

	public static void main(String[] args) {
		Path path = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
		try {
			path  = FileSystems.getDefault().getPath("C:\\Users\\brian\\Desktop\\readFrom.txt");
			br = Files.newBufferedReader(path);
			bw = new BufferedWriter(new FileWriter("C:\\Users\\brian\\Desktop\\writeTo.txt"));
			process(br, bw);

			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
