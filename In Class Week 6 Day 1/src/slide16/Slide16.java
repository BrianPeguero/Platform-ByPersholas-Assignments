package slide16;

import java.io.File;

public class Slide16 {
	public static void checkFileExists() {
		String fname = "C:\\Users\\brian\\Desktop\\sample.txt";
		
		File f = new File(fname);
		
		System.out.println("File name: " + f.getName());
		System.out.println("Path: " + f.getPath());
		System.out.println("Absolute path: " + f.getAbsolutePath());
		System.out.println("Parent: " + f.getParent());
		System.out.println("Exists: " + f.exists());
		
		if(f.exists()) {
			System.out.println("Is writeable: " + f.canWrite());
			System.out.println("Is readable: " + f.canRead());
			System.out.println("Is a directory: " + f.isDirectory());
			System.out.println("File size in bytes: " + f.length());
		}
	}
	
	public static void main(String[] args) {
		checkFileExists();
	}
}
