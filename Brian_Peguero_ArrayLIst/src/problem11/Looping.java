package problem11;

import java.util.ArrayList;

/**
 * The program creates an ArrayList and uses a for-each loop to display 
 * each element to the screen.
 * 
 * @author Brian
 * */
public class Looping {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Gray");
		colors.add("Black");
		
		for(String i : colors) {
			System.out.println(i);
		}
	}

}
