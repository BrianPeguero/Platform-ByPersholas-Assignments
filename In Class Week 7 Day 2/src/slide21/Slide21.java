package slide21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Slide21 {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\brian\\Desktop\\file.txt";
		
		byte[] buffer = new byte[1000];
		
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(fileName);
		} catch (FileNotFoundException e1) {
			System.out.println("can't open file");
		}
		
		int total = 0;
		int nRead = 0;
		
		try {
			while((nRead = inputStream.read(buffer)) != -1) {
				System.out.println(new String (buffer));
				total += nRead;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't open read file");
		} catch(IOException e) {
			System.out.println("Erro reading file");
		}
	}

}
