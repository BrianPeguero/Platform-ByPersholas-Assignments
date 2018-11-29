package problem3;
import java.util.Random;

public class LargestValue {
	
	public static int[] createArray() {
		int[] emptyArray = new int[10];
		return emptyArray;
	}
	
	public static int randNumb() {
		//creating a seed to check if each run through is correct 
		Random rand = new Random();
		
		int numb = rand.nextInt(100);
		
		return numb;
	}
	
	public static int[] populateArray(int[] emptyArray){
		for(int i=0; i<=emptyArray.length-1; i++) {
			emptyArray[i] = randNumb();
		}
		return emptyArray;
	}
	
	public static void displayArray(int[] populatedArray){
		for (int i=0; i<=populatedArray.length-1; i++) {
			System.out.print(populatedArray[i] + " ");
		}
		System.out.println("");
	}
	
	public static int largestElement(int[] populatedArray){
		int temp = populatedArray[0];
		
		for (int i=0; i<=populatedArray.length-1; i++) {
			if(temp<=populatedArray[i]) {
				temp = populatedArray[i];
			} 
		}
		return temp;
	}
	
	public static void displayLargestElement(int largestElement){
		System.out.println(largestElement);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] emptyArray = createArray();
		int[] populatedArray = populateArray(emptyArray);
		displayArray(populatedArray);
		int largestElement = largestElement(populatedArray);
		displayLargestElement(largestElement);
	}

}
