package problem1;
import java.util.Random;

public class CopyAnArray {
	
	public static int randNumb() {
		Random rand = new Random();
		
		int numb = rand.nextInt(100);
		
		return numb;
	}
	
	public static int[] createArray() {
		int[] array = new int[10];
		
		for(int i=0; i<=array.length-1; i++) {
			array[i] = randNumb();
		}
		
		return array;
	}
	
	public static int[] copiedArray(int[] originalArray) {
		int[] copiedArray = new int[10];
		
		for(int i=0; i<=originalArray.length-1; i++) {
			copiedArray[i] = originalArray[i];
		}
		
		return copiedArray;
	}
	
	public static void displayArrays(int[] originalArray, int[] copiedArray) {
		for (int i=0; i<=originalArray.length-1; i++) {
			System.out.print(originalArray[i] + " ");
		}
		
		System.out.println("");
		
		for (int i=0; i<=copiedArray.length-1; i++) {
			System.out.print(copiedArray[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] createdArray = createArray();
		int[] copiedArray = copiedArray(createdArray);
		displayArrays(createdArray, copiedArray);
	}

}
