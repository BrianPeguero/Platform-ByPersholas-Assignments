package problem6;

import java.util.ArrayList;
/**
 * The program sorts an ArrayList of type String
 * 
 * @author Brian
 * */
public class Sorting {
	
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
		System.out.println(colors);
		
		return colors;
	}
	
	/**
	 * invokes the sort method and returns a sorted ArrayList
	 * 
	 * @param colors  ArrayList<String>
	 * @return colors  ArrayList<String>
	 * */
	public static void sort(ArrayList<String> colors) {
		colors.sort(null);
		System.out.println(colors);
	}

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors = populate(colors);
		sort(colors);
	}

}
