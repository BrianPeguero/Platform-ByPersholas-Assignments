package problem4;
import java.util.Scanner;

public class MovemetOna2DPlane {
	
	public static String[][] createGrid(){
		String[][] grid = new String[5][5];
		
		for(int i = 0; i <= grid.length - 1; i++) {
			for(int j = 0; j <= grid.length - 1; j++) {
				grid[i][j] = "O";
			}
		}
		
		grid[0][0] = "X";
		
		return grid;
	}
	
	@SuppressWarnings("resource")
	public static String getInput() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("what direction would you like the X to go?");
		String direction = input.next();
		
		return direction;
	}
	
	public static void display(String[][] grid) {
		for(int i = 0; i <= grid.length - 1; i++) {
			for(int j = 0; j <= grid.length - 1; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println("");
		}
	}
	
	public static int[] getIndexOfX(String[][] grid) {
		int[] index = new int[2];
		
		for(int i = 0; i <= grid.length - 1; i++) {
			for(int j = 0; j <= grid.length - 1; j++) {
				if(grid[i][j].equals("X")) {
					index[0] = i;
					index[1] = j;
				}
			}
		}
		return index;
	}
	
	
	//checks validity of the up move
	public static boolean isUpValid (String grid[][]) {
		int[] position = getIndexOfX(grid);
		return position[0] - 1 >= 0;
	}
	
	//checks validity of the down move
	public static boolean isDownValid (String grid[][]) {
		int[] position = getIndexOfX(grid);
		return position[0] + 1 < 5;
	}
		
	//checks validity of the left move
	public static boolean isLeftValid (String grid[][]) {
		int[] position = getIndexOfX(grid);
		return position[1] - 1 >= 0;
	}
		
	//checks validity of the right move
	public static boolean isRightValid (String grid[][]) {
		int[] position = getIndexOfX(grid);
		return position[1] + 1 < 5;
	}
	
	
	
	
	
	//moves the position of X on the grid
	public static String[][] moveUp (String grid[][], int[]position) {
		grid[position[0]][position[1]] = "O";
		grid[position[0] - 1][position[1]] = "X";
		return grid;
	}
	
	public static String[][] moveDown (String grid[][], int[]position) {
		grid[position[0]][position[1]] = "O";
		grid[position[0] + 1][position[1]] = "X";
		return grid;
	}
	
	public static String[][] moveLeft (String grid[][], int[]position) {
		grid[position[0]][position[1]] = "O";
		grid[position[0]][position[1] - 1] = "X";
		return grid;
	}
	
	public static String[][] moveRight (String grid[][], int[]position) {
		grid[position[0]][position[1]] = "O";
		grid[position[0]][position[1] + 1] = "X";
		return grid;
	}
	
	
	
	//the actual prompt of getting the direction and displaying it to the user till an 
	//invalid move is made
	/**
	 * Takes in the initial grid and gets updated with each iteration if the correct
	 * key word is used and if where the user wants to move the X is valid.
	 * 
	 * If the direction is not correct the user can try inputing the direction again.
	 * 
	 * if the move is not valid it will isValidMove will be set to false and
	 * exit out of the program.
	 * 
	 * @param grid the initialized grid.
	**/
	public static void move(String[][] grid) {
		
		String[][] updatedGrid = new String[5][5];
		
		boolean isMoveValid = true;
		
		display(grid);
		
		
		while(isMoveValid) {
			String direction = getInput();
		
			if(direction.equals("up")) {
				if(isUpValid(grid)) {
					int[] indexOfX = getIndexOfX(grid);
					updatedGrid = moveUp(grid, indexOfX);
					display(updatedGrid);
				} else {
					isMoveValid = false;
					System.out.println("Invalid move, sorry");
					display(grid);
				}
			} else if(direction.equals("down")) {
				if(isDownValid(grid)) {
					int[] indexOfX = getIndexOfX(grid);
					updatedGrid = moveDown(grid, indexOfX);
					display(updatedGrid);
				} else {
					isMoveValid = false;
					System.out.println("Invalid move, sorry");
					display(grid);
				}
			} else if(direction.equals("left")) {
				if(isLeftValid(grid)) {
					int[] indexOfX = getIndexOfX(grid);
					updatedGrid = moveLeft(grid, indexOfX);
					display(updatedGrid);
				} else {
					isMoveValid = false;
					System.out.println("Invalid move, sorry");
					display(grid);
				}
			} else if(direction.equals("right")) {
				if(isRightValid(grid)) {
					int[] indexOfX = getIndexOfX(grid);
					updatedGrid = moveRight(grid, indexOfX);
					display(updatedGrid);
				} else {
					isMoveValid = false;
					System.out.println("Invalid move, sorry");
					display(grid);
				}
			} else {
				System.out.println("Wrong input try again\n");
			}
			
			grid = updatedGrid;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] grid = createGrid();
		move(grid);
	}

}
