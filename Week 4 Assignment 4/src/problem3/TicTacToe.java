package problem3;
import java.util.Scanner;

public class TicTacToe {
	
	@SuppressWarnings("resource")
	public static int[] getCoordinate() {
		Scanner inputx = new Scanner(System.in);
		Scanner inputy = new Scanner(System.in);
		
		System.out.println("Please enter the row youd like your next move to be: ");
		int x = inputx.nextInt();
		
		System.out.println("Please enter the row youd like your next move to be: ");
		int y = inputy.nextInt();
		
		int[] coordinates = {x, y};
		
		return coordinates;
	}
	
	public static String[][] createGrid() {
		String[][] empty2DArray = new String[3][3];
		return empty2DArray;
	}

	public static void display2DArray(String[][] filled2DArray) {
		for (int i = 0; i <= filled2DArray.length - 1; i++) {
			for (int j = 0; j <= filled2DArray.length - 1; j++) {
				System.out.print(filled2DArray[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static String[][] fill2DArray(String[][] empty2DArray) {
		for (int i = 0; i <= empty2DArray.length - 1; i++) {
			for (int j = 0; j <= empty2DArray.length - 1; j++) {
				empty2DArray[i][j] = "|_|";
			}
		}
		return empty2DArray;
	}
	
	public static boolean checkBoard(String[][] board) {
		boolean empty = true;
		for (int i = 0; i <= board.length - 1; i++) {
			for (int j = 0; j <= board.length - 1; j++) {
				if (board[i][j].equals("|_|")) {
					empty = true;
				} else {
					empty = false;
				}
			}
		}
		return empty;
	}
	
	public static boolean turnEven (int turn) {
		return (turn%2 == 0);
	}
	
	public static void playGame(String[][] board) {
		int turn = 0;
		while (checkBoard(board)) {
			display2DArray(board);
			int[] coordinate = getCoordinate();
			if (turnEven(turn) && board[coordinate[0]][coordinate[1]].equals("|_|")) {
				board[coordinate[0]][coordinate[1]] = "|X|";
				turn++;
			} else if (!(turnEven(turn)) && (board[coordinate[0]][coordinate[1]].equals("|_|"))) {
				board[coordinate[0]][coordinate[1]] = "|Y|";
				turn++;
			} else {
				System.out.println("That place it taken");
			}
		}
		System.out.println("\nThe board is filled here is the end result:\n");
		display2DArray(board);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] emptyArray = createGrid();
		String[][] filledArray = fill2DArray(emptyArray);
		playGame(filledArray);
	}

}
