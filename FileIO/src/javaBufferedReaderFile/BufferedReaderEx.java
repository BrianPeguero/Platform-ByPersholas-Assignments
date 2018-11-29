package javaBufferedReaderFile;

import java.nio.file.*;
import java.io.*;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path filePathName = FileSystems.getDefault().getPath("Hello.txt", "Desktop");
		try {
		
			InputStream inptStrm = Files.newInputStream(filePathName);
			BufferedReader br = new BufferedReader(new InputStreamReader(inptStrm));
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		
		} catch (IOException e) {
			
			System.out.println("couldn't find file path");
			
		}
		
		
	}

}
