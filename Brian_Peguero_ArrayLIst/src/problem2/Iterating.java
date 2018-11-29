package problem2;

/**
 * The program initializes an ArrayList and prints each element out to the console
 * 
 * @author Brian
 * */

import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Gray");
		colors.add("Black");
		
		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}
	}

}
