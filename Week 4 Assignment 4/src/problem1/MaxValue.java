package problem1;
import java.util.Random;

public class MaxValue {
	
	public static int[][] create2DArray(){
		int [][] empty2DArray = new int[3][3];
		return empty2DArray;
	}
	
	public static int randNumb() {
		Random rand  = new Random();
		int numb = rand.nextInt(100);
		return numb;
	}
	
	public static int[][] fill2DArray(int[][] empty2DArray) {
		for (int i=0; i<=empty2DArray.length-1; i++) {
			for (int j=0; j<=empty2DArray.length-1; j++) {
				empty2DArray[i][j] = randNumb();
			}
		}
		return empty2DArray;
	}
	
	public static void display2DArray(int[][] filled2DArray) {
		for (int i=0; i<=filled2DArray.length-1; i++) {
			for (int j=0; j<=filled2DArray.length-1; j++) {
				System.out.print(filled2DArray[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static int sort2DArray(int[][] filled2DArray) {
		int temp = filled2DArray[0][0];
		
		for (int i=0; i<=filled2DArray.length-1; i++) {
			for (int j=0; j<=filled2DArray.length-1; j++) {
				if(temp<=filled2DArray[i][j]) {
					temp = filled2DArray[i][j];
				}
			}
		}
		System.out.println("");
		return temp;
	}
	
	public static void displayLargest(int numb) {
		System.out.println(numb);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] emptyArray = create2DArray();
		int[][] filledArray = fill2DArray(emptyArray);
		display2DArray(filledArray);
		int largestNumb = sort2DArray(filledArray);
		displayLargest(largestNumb);
	}

}
