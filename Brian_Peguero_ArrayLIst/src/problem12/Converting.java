package problem12;

import java.util.ArrayList;

/**
 * The program converts an array to an array list
 * 
 * @author Brian
 * */
public class Converting {

	public static void main(String[] args) {
		String[] colorsA = {"Blue", "Green", "Red", "Gray", "Black"};
		ArrayList<String> colorsAL = new ArrayList<String>();
		
		for (int i = 0; i < colorsA.length; i++) {
			colorsAL.add(colorsA[i]);
		}
	}

}
