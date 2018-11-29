package problem4;
import java.util.Random;
import java.util.Scanner;

public class HowManyTimes {
	
	public static int randNumb() {
		Random rand = new Random();
		
		int numb = rand.nextInt(100);
		
		return numb;
	}
	
	public static int[] createArray(){
		int[] emptyArray = new int[10];
		return emptyArray;
	}
	
	public static int[] populateArray(int [] arrayToPopulate) {
		for(int i=0; i<=arrayToPopulate.length-1; i++) {
			arrayToPopulate[i] = randNumb();
		}
		return arrayToPopulate;
	}
	
	public static void displayArray(int[] populatedArray){
		for(int i=0; i<=populatedArray.length-1; i++) {
			System.out.print(populatedArray[i] + " ");
		}
	}
	
	public static int getNumb() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nEnter a number you want to find the frquency of in the array:");
		int numb = input.nextInt();
		
		input.close();
		
		return numb;
	}
	
	public static void freq(int[] populatedArray, int numb) {
		int count = 0;
		for (int i=0; i<=populatedArray.length-1; i++) {
			if(populatedArray[i] == numb) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] emptyArray = createArray();
		int[] populatedArray = populateArray(emptyArray);
		displayArray(populatedArray);
		int numb = getNumb();
		freq(populatedArray, numb);
	}

}
