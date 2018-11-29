package Day1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

public class AbsoluteAndRelative {

	public static void main(String[] args) throws IOException {
		
		File root = new File("C:\\Users\\brian\\Desktop\\PlayGround");
		
		if(root.exists()) {
			String[] rootContents = root.list();
			
		for(String folderName : rootContents) {
			File tempDir = new File(root.getAbsolutePath() + "\\" + folderName);
			
			if(!folderName.equals("ParkOne")) {
				String[] tempDirContents = tempDir.list();
				for(String tempFileName : tempDirContents) {
					File tempPath = new File(root.getAbsolutePath() + "\\" + folderName + "\\" + tempFileName);
					System.out.println(tempFileName);
					Files.move(tempPath.toPath(), new File(root.getAbsolutePath() + "\\ParkOne\\" + tempFileName).toPath(), StandardCopyOption.REPLACE_EXISTING);
				}
			}
			
			
			
		}
			
			
			
			
			
			
			
		}
		

	}

}
