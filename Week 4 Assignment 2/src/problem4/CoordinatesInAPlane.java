package problem4;
import java.util.Scanner;

public class CoordinatesInAPlane {
	
	@SuppressWarnings("resource")
	public static int xCoord() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Whats you x coordinate?");
		int x = input.nextInt();
		
		return x;
	}
	
	public static int yCoord() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Whats you y coordinate?");
		int y = input.nextInt();
		
		input.close();
		return y;
	}
	
	public static void coords(int x, int y) {
		for (int i=0; i<=x; i++) {
			for(int j=0; j<=y; j++) {
				System.out.println("(" + i + ", " + j + ")");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = xCoord();
		int y = yCoord();
		coords(x, y);
	}

}
