package problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadingAFile {

	@SuppressWarnings("hiding")
	public static void main(String[] args) {
		// The name of the file to open.
        String fileName = "C:\\Users\\brian\\Desktop\\Hello.txt";

        try {
        	File file = new File(fileName); 
        	Scanner sc = new Scanner(file); 

        	while (sc.hasNextLine()) {
        		System.out.println(sc.nextLine());
        	}
        	
        	sc.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {System.out.println("Error reading file '" + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }

	}

}
