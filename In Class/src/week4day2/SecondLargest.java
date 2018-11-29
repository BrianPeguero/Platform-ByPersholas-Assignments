package week4day2;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		int[] listB = {45, 5, 1, 10, 22, 20, 30};
		
		int largestTemp = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i = 1; i <= listB.length - 1; i++) {
			if(largestTemp <= listB[i]) {
				secondLargest = largestTemp;
				largestTemp = listB[i];
			}
		}
		
		System.out.println(secondLargest);
		
	}
}
