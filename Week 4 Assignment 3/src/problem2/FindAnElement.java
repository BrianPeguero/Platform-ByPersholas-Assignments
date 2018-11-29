package problem2;
import java.util.Random;
import java.util.Scanner;

public class FindAnElement {
	
	public static int randNumb() {
		//Instantiate a random object to use the methods of the class
		Random rand = new Random();
		
		//use dot method on instantiated object with range [0-100)
		int numb = rand.nextInt(100);
		
		return numb;
	}
	
	public static int[] createArray() {
		//create and empty array of 10 spaces
		int[] createdArray = new int[10];
		return createdArray;
	}
	
	public static int[] populateArray(int[] emptyArray) {
		for (int i=0; i<=emptyArray.length-1; i++) {
			emptyArray[i] = randNumb();
		}
		return emptyArray;
	}
	
	public static void displayArray(int[] populatedArray) {
		for (int i=0; i<=populatedArray.length-1; i++) {
			System.out.print(populatedArray[i] + " ");
		}
	}
	
	public static int getIndex() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nFrom what number would you like me to find for you: ");
		int numb = input.nextInt();
		
		input.close();
		
		return numb;
	}
	
	public static void getElement(int[] populatedArray, int numb) {
		for (int i=0; i<=populatedArray.length-1; i++) {
			if(populatedArray[i] == numb) {
				System.out.println("I found it! Its at index " + i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] emptyArray = createArray();
		int[] populatedArray = populateArray(emptyArray);
		displayArray(populatedArray);
		int numb = getIndex();
		getElement(populatedArray, numb);
	}

}