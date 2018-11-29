package slide17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Slide17 {

	public static void main(String[] args) {
		
		Path file = null;
		
		BufferedReader br = null;
		
		String line;
		try {
			file = Paths.get("");
			InputStream inputStream = Files.newInputStream(file);
			br = new BufferedReader(new InputStreamReader(inputStream));
			
			System.out.println("Reading the first line:\n" + br.readLine());
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (IOException e){
			System.out.println("You failed");
		} finally {
			try {
				br.close();
			} catch (IOException e){}
		}
		
	}

}
