package problem4;

import java.util.ArrayList;
/**
 * The program removes the 3rd element from the ArrayList colors.
 * 
 * @author Brian
 **/
public class Removing {
	
	/**
	 * The method populate, populates an empty ArrayList of type String
	 * with different colors.
	 * 
	 * @param colors  an empty ArrayList of type String
	 * @return colors a populated ArrayList with String elements
	 **/
	public static ArrayList<String> populate(ArrayList<String> colors) {
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Gray");
		colors.add("Black");
		
		return colors;
	}
	/**
	 * The method remove, takes in a populated ArrayList of type string
	 * gets the element in the 3rd position of the ArrayList and removes it
	 * 
	 * @param colors  an ArrayList of type String
	 * @return colors  an ArrayList of type String with the 3rd element removed
	 * */
	public static ArrayList<String> remove(ArrayList<String> colors) {
		String temp = colors.get(2);
		colors.remove(temp);
		return colors;
	}

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		System.out.println(populate(colors));
		System.out.println(remove(colors));
	}

}
