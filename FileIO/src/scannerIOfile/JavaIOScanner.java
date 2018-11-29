package scannerIOfile;

import java.io.*;
import java.util.Scanner;

public class JavaIOScanner {
	
    @SuppressWarnings("hiding")
	public static void main(String [] args) throws Exception {

        // The name of the file to open.
        String fileName = "C:\\Users\\brian\\Documents\\Programming\\Java\\workspace\\FileIO\\src\\fileIO\\Actor.csv";

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