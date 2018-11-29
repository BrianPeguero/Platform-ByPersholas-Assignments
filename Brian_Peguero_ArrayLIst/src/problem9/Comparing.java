package problem9;

import java.util.ArrayList;

/**
 * The program is meant to compare to arrays and 
 * display the elements that they have in common
 * 
 * @author Brian
 * */
public class Comparing {
	
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
	 * takes in two arrays iterates through them and compares each element
	 * 
	 * @param colors  ArrayList<String>
	 * @param colorsCopy  ArrayList<String>
	 * 
	 * @return colorsCopy
	 * */
	public static void union(ArrayList<String> colors, ArrayList<String> colors2) {
		if (colors.size() >= colors2.size()) {
			for (int i = 0; i < colors.size(); i++) {
				if (colors.contains(colors2.get(i))) {
					System.out.println(colors2.get(i));
				}
			} 
		}else {
			for (int i = 0; i < colors2.size(); i++) {
				if(colors2.contains(colors.get(i))) {
					System.out.println(colors.get(i));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		ArrayList<String> colors2 = new ArrayList<String>();
		colors = populate(colors);
		colors2 = populate(colors2);
		
		union(colors, colors2);
	}
	
}
