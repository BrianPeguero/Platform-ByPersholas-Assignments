package problem6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * The program reads the first 3 lines of a file
 * 
 * @author Brian
 * */
public class BasicIO {
	
	/**
	 * The method reads a file line by line until the first 3 lines are read
	 * or till the file returns a null
	 * 
	 * @param br  a BufferedReader
	 * */
	public static void read(BufferedReader br) throws IOException{
		int count = 0;
		String line = null;
		
		while(((line = br.readLine()) != null) && (count < 3)) {
				System.out.println(line);
				count++;
		}
	}

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\brian\\Desktop\\File.txt"));
			read(br);
			
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
