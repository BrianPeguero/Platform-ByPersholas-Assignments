package problem7;

import java.util.ArrayList;

/**
 * The program is meant to reverse the order of an ArrayList
 * 
 * @author Brian
 * */
public class Reversing {
	
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
	 * The method iterates over an ArrayList in descending order and adds 
	 * it to a temporary ArrayList to then get returned 
	 * 
	 * @param colors  ArrayList<String>
	 * @return temp  ArrayList<String>
	 * */
	public static ArrayList<String> reverse(ArrayList<String> colors) {
		ArrayList<String> temp = new ArrayList<String>();
		
		for (int i = colors.size() - 1; i >= 0; i--){
			temp.add(colors.get(i));
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors = populate(colors);
		System.out.println(colors);
		colors = reverse(colors);
		System.out.println(colors);
	}

}
