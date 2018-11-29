package problem10;

import java.util.ArrayList;

/**
 * The program will append the contents of one 
 * ArrayList to another
 * 
 * @author Brian
 * */
public class Appending {
	
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
	 * The method appends the second array to the first element by element
	 * 
	 * @param colors  ArrayList<String>
	 * @param colors2  ArrayList<String>
	 * 
	 * @return colors  ArrayList<String>
	 * */
	public static ArrayList<String> append(ArrayList<String> colors, ArrayList<String> colors2) {
		for (int i = 0; i < colors2.size(); i++) {
			colors.add(colors2.get(i));
		}
		return colors;
	}

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		ArrayList<String> colors2 = new ArrayList<String>();
		colors = populate(colors);
		colors2 = populate(colors2);
		
		System.out.println(append(colors, colors2));
	}

}
