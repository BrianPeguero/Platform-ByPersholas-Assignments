package week6day1class1;

import java.awt.BufferCapabilities;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Slide9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter diretory path: ");
		String dirPath = br.readLine();
		
		System.out.println("enter directory name");
		String dirName = br.readLine();
		
		File file = new File(dirPath, dirName);
		
		String[] arr = null;
		int n = 0;
		
		if(file.exists()) {
			arr = file.list();
			
			n = arr.length;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
			File f1 = new File(arr[i]);
			
			if(f1.exists()) {
				System.out.println(": is a file");
				System.out.println("No. of entries in this directory " + n);
			} else {
				System.out.println("Directory not found");
			}
		}
		
	}

}
