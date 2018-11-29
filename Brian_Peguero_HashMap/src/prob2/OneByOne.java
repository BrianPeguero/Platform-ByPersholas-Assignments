package prob2;

import java.util.HashMap;

/**
 * The program creates a HashMap of integers and colors of type String
 * then loops through each key-value pair using a for loop and for-each loop
 * 
 * @author Brian 
 * */
public class OneByOne {

	public static void main(String[] args) {
		HashMap<Integer, String> colors = new HashMap<Integer, String>();
		
		colors.put(1, "Blue");
		colors.put(2, "Black");
		colors.put(3, "Green");
		colors.put(4, "Grey");
		colors.put(5, "Purple");
		
		Object[] keys = colors.keySet().toArray();
		
		for (int i = 0; i <= colors.size() - 1; i++) {
			System.out.println(keys[i] + " : " + colors.get(keys[i]));
		}
		
		for(Object i : keys) {
			System.out.println(keys[(int) i] + " : " + colors.get(keys[(int) i]));
		}
	}

}
