package problem4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * The program reads the first 3 numbers of a file
 * stores them into an array and calculates the sum
 * 
 * @author Brian
 * */
public class BasicIO2Prob4 {
	
	/**
	 * The method reads the first 3 numbers from a file and stores them
	 * into an Array of integers
	 * 
	 *  @return nums  int[]
	 * */
	public static int[] getNums() {
		int[] nums = new int[3];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(""));
			
			for (int i = 0; i < 3; i++) {
				nums[i] = br.read();
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't open file");
		} catch (NumberFormatException e) {
			System.out.println("These aren't numbers");
		} catch (IOException e) {
			System.out.println("Can't read file");
		}
		
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = getNums();
		
		System.out.println(nums[0] + nums[1] + nums[2]);
	}

}
