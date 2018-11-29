package slide21;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Slide21 {

	public static void main(String[] args) throws IOException {
		File newFile = null;
		
		File playGround = new File("C:\\Users\\brian\\Desktop\\PlayGround");
		
		playGround.mkdir();
		System.out.println(playGround.isDirectory());
		
		new File(playGround.getAbsolutePath() + "\\first").mkdirs();
		newFile = new File(playGround.getAbsolutePath() + "\\simple.txt");
		newFile.createNewFile();
		
		System.out.println(newFile.getName());
		
		Files.move(Paths.get(newFile.getName()),
				Paths.get(playGround.getAbsolutePath() + "\\first\\" + (newFile.getName())),
				StandardCopyOption.REPLACE_EXISTING);

	}

}
