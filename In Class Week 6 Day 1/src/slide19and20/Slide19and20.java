package slide19and20;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Slide19and20 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter dirPath: ");
		String dirPath = br.readLine();
		
		System.out.println("Enter dirName: ");
		String dirName = br.readLine();
		
		File f = new File(dirPath, dirName);
		
		if (f.exists()) {
			String arr[] = f.list();
			int n = arr.length;
			
			for (int i  = 0; i < n; i++) {
				System.out.println(arr[i]);
				File f1 = new File(arr[i]);
				
				if (f1.isFile()) {
					System.out.println(" : is a file");
				}
				
				System.out.println("No. of entries " + n);
			}
		} else {
			System.out.println("Directory not found");
		}
	}
		
		
}