package problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadingMultiFiles {

	@SuppressWarnings({ "resource", "hiding" })
	public static void main(String[] args) {
		// The name of the file to open.
        String courseCodeFile = "C:\\Users\\brian\\Desktop\\courseCode.txt";
        String courseNameFile = "C:\\Users\\brian\\Desktop\\courseName.txt";

        try {
        	File codeFile = new File(courseCodeFile);
        	File nameFile = new File (courseNameFile);
        	
        	Scanner sc1 = new Scanner(codeFile);
        	Scanner sc2 = new Scanner(nameFile);

        	while (sc1.hasNextLine()) {
        		while (sc2.hasNextLine()) {
        			System.out.println(sc1.nextLine() + " - "+ sc2.nextLine());
        		}
        	}
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open files");                
        }
        catch(IOException ex) {System.out.println("Error reading files");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
	}

}
