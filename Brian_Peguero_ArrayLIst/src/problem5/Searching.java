package problem5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * The program takes input from the user and searches 
 * the arraylist for the color specified
 * 
 * @author Brian
 * */
public class Searching {

	/**
	 * The method gets input from the user and returns it.
	 * 
	 * @return color  String containing the color
	 * */
	public static String input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What Color would you like me to search for?");
		
		String color = "";
		try {
			color = br.readLine();
		} catch (IOException e) {
			System.out.println("Not working");
		}
		
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("Can't close Stream");
		}
		
		return color;
	}
	
	/**populates the ArrayList given into it
	 * 
	 * @param colors  ArrayList<String>
	 * 
	 * @return colors  ArrayList<String>
	 * */
	public static ArrayList<String> populate(ArrayList<String> colors) {
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Gray");
		colors.add("Black");
		
		return colors;
	}
	
	/**
	 * loops through an array and compares the element to the user input 
	 * 
	 * @param colors  ArrayList<String>
	 * 
	 * @retun color  String
	 * */
	public static void search (ArrayList<String> colors, String color) {
		int colorIndex = 0;
		
		for (int i = 0; i < colors.size(); i++) {
			if (colors.get(i).equals(color)) {
				colorIndex = i;
			}
		}
		
		System.out.printf("The index of %s is at %i", color, colorIndex);
	}
	
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors = populate(colors);
		
		String color = input();
		
		search(colors, color);
	}

}
