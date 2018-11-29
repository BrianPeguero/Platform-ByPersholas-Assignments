package javaBufferedReaderConsole;

import java.io.*;
import java.nio.file.*;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name ");
		
		try {
			String name = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
