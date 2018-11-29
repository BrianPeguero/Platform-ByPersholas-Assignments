package problem8;

import java.util.ArrayList;

/**
 * The program is meant to copy an array
 * 
 * @author Brian
 * */
public class Copying {
	
	/**
	 * The method populates an ArrayList
	 * 
	 * @param colors  ArrayList<String>
	 * @return colors  ArrayList<String>
	 * */
	public static ArrayList<String> populate(ArrayList<String> colors){
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Gray");
		colors.add("Black");

		return colors;
	}
	
	/**
	 * takes in two arrays and copies the first into the second
	 * 
	 * @param colors  ArrayList<String>
	 * @param colorsCopy  ArrayList<String>
	 * 
	 * @return colorsCopy
	 * */
	public static ArrayList<String> deepCopy(ArrayList<String> colors, ArrayList<String> colorsCopy) {
		for (int i = 0; i < colors.size(); i++) {
			colorsCopy.add(colors.get(i));
		}
		
		return colorsCopy;
	}
	
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		ArrayList<String> colorsCopy = new ArrayList<String>();
		colors = populate(colors);
		System.out.println(colors);
		
		colorsCopy = deepCopy(colors, colorsCopy);
		System.out.println(colorsCopy);
	}
	
}
