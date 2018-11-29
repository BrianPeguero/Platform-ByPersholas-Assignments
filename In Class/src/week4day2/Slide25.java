package week4day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Slide25 {

	public static void main(String[] args) {
		int[] listA = {5, 10, 15, 20, 25, 30, 35};
		int[] listB = {4, 5, 1, 10, 22, 20, 30};
		
		int[] listC = new int[listA.length];
		int index = 0;
		
		for (int i = 0; i <= listB.length - 1; i++) {
			for(int j = 0; j <= listA.length - 1; j++) {
				if (listB[i] == listA[j]) {
					listC[index] = listB[i];
					index++;
				}
			}
		}
		
		System.out.println(Arrays.toString(listC));
	}

}
