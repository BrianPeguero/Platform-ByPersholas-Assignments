package problem3;
import java.util.ArrayList;
/**
* The program initializes an array list of type string
* to be passed to a method update that returns an updated
* array that removes the 5th element of the array and updates it
* with a new element
* 
* @author Brian
* */
public class Updating {

	
	/**
	 * The method updates the fifth position of the ArrayList by removing it and
	 * adding a new element in its place
	 * 
	 * @param colors  and ArrayList of type String
	 **/
	public static ArrayList<String> update(ArrayList<String> colors) {
		colors.remove(5);
		colors.add(5, "Magenta");
		
		return colors;
	}
	
	
	/**
	 * The entry point to the program that initializes an ArrayList to be passed
	 * into the method update
	 **/
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Gray");
		colors.add("Black");
		colors.add("Orange");
		colors.add("Yellow");
		colors.add("Purple");
		
		System.out.println(colors);
		
		colors = update(colors);
		
		System.out.println(colors);
		
	}

}
