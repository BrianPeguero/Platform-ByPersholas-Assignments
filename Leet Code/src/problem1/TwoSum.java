package problem1;

import java.util.ArrayList;

/*
 * Given an array of integers, return indices of 
 * the two numbers such that they add up to a 
 * specific target.
 * 
 * You may assume that each input would have exactly 
 * one solution, and you may not use the same element 
 * twice.
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * 
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * 
 * return [0, 1].
 * */

public class TwoSum {

	public static int[] twoSum(int[] numbs, int target) {
		int[] indices = new int[2];
		int temp = 0;
		
		ArrayList<Integer> AL = new ArrayList<Integer>();
		
		for (int i = 0; i <= numbs.length - 1; i++) {
			AL.add(numbs[i]);
			
		}
		
		for (int i = 0; i <= numbs.length - 1; i++) {
				temp = target - numbs[i];
				if(AL.contains(temp) && 
				  (indices[0] != i) && (indices[1] != i)) {
					indices[0] = i;
					indices[1] = AL.indexOf(temp);
				}
		}

		return indices;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 10, 11, 15, 7 };
		int target = 9;

		int[] indices = twoSum(nums, target);
		System.out.println("[" + indices[1] + " , " + indices[0] + "]");

	}
	
/*
 * use a hash table to search for the compliment of the index and target
 * using .containsKey(complement)
 * */

}
