package problem5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * The program writes to the end of a file
 * 
 * @author Brian
 **/
public class IO {
	

	public static void main(String[] args) {
		String file = "C:\\Users\\brian\\Desktop\\Greeting.txt";
		String message = "Hey there I'm Brain";
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(file));
			
			bw.append(message);
			
		} catch (IOException e) {
			System.out.println("Can't write to the file.");
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
