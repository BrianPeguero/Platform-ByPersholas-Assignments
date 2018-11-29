package slide18;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Slide18 {
	public static void main(String[] args) throws DirectoryNotEmptyException, IOException{
		Path filePath = Paths.get("C:\\Users\\brian\\Desktop\\sample.txt");
		
		filePath.toFile().delete();
		
		System.out.println("File or directory is deleted");
	}
}
