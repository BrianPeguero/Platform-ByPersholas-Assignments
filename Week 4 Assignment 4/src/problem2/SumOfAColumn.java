package problem2;

import java.util.Random;
import java.util.Scanner;

public class SumOfAColumn {

	public static int getColumn() {
		Scanner input = new Scanner(System.in);

		System.out.print("input which column you would like to add up: ");
		int column = input.nextInt();

		input.close();

		return column;
	}

	public static int[][] create2DArray() {
		int[][] empty2DArray = new int[3][3];
		return empty2DArray;
	}

	public static int randNumb() {
		Random rand = new Random();
		int numb = rand.nextInt(100);
		return numb;
	}

	public static int[][] fill2DArray(int[][] empty2DArray) {
		for (int i = 0; i <= empty2DArray.length - 1; i++) {
			for (int j = 0; j <= empty2DArray.length - 1; j++) {
				empty2DArray[i][j] = randNumb();
			}
		}
		return empty2DArray;
	}

	public static void display2DArray(int[][] filled2DArray) {
		for (int i = 0; i <= filled2DArray.length - 1; i++) {
			for (int j = 0; j <= filled2DArray.length - 1; j++) {
				System.out.print(filled2DArray[i][j] + " ");
			}
			System.out.println("");
		}
	}
	public static int sort2DArray(int column, int[][] filled2DArray) {
		int sum = filled2DArray[0][column] + filled2DArray[1][column] + filled2DArray[2][column];
		return sum;
	}
	
	public static void displaySum(int sum){
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] emptyArray = create2DArray();
		int[][] filledArray = fill2DArray(emptyArray);
		display2DArray(filledArray);
		int column = getColumn();
		int sum = sort2DArray(column, filledArray);
		displaySum(sum);
	}

}