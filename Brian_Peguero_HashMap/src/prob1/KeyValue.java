package prob1;

import java.util.HashMap;

/**
 * The program initializes a HashMap and adds some key value pairs of integers and
 * colors. After initializing a HashMap the program changes the value of a key-value pair
 * 
 * @author Brian 
 * */
public class KeyValue {

	public static void main(String[] args) {
		HashMap<Integer, String> colors = new HashMap<Integer, String>();
		
		colors.put(1, "Blue");
		colors.put(2, "Black");
		colors.put(3, "Green");
		colors.put(4, "Grey");
		colors.put(5, "Purple");
		
		System.out.println(colors.keySet());
		System.out.println(colors.values());
		
		colors.put(3, "Yellow");
		
		System.out.println(colors.keySet());
		System.out.println(colors.values());
	}

}
