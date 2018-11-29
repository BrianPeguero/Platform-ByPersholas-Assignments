package problem5;
import java.util.Scanner;

public class AreaCalc {
	
	public AreaCalc() {
		
	}
	
	@SuppressWarnings("resource")
	public void areaCircle() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the radius of the circle?");
		double radius = input.nextDouble();
		
		 System.out.println(Math.PI * radius);
	}
		
	@SuppressWarnings("resource")
	public void areaRectangle() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the width of the rectangle?");
		double width = input.nextDouble();
		
		System.out.println("What is the height of the rectangle?");
		double height = input.nextDouble();
		
		System.out.println(width * height);
	}
	
	@SuppressWarnings("resource")
	public void areaSquare() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the length of the side of the square?");
		double side = input.nextDouble();
		
		System.out.println(Math.pow(side, 2));
	}
	
	@SuppressWarnings("resource")
	public void areaTriangle() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the width of the triangle?");
		double width = input.nextDouble();
		
		System.out.println("What is the height of the triangle?");
		double height = input.nextDouble();
		
		System.out.println((width * height)/2);
	}
	
	@SuppressWarnings("resource")
	public static int getInput() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What shape would you like to find the area of?");
		System.out.println("You may choose from:\n1 for circle\n2 for triangle\n3 for square\n4 for rectangle");
		
		int shape = input.nextInt();
		
		return shape;
	}
	
	public static void theChoice(AreaCalc shape, int choice) {
		switch (choice){
		case 1:
			shape.areaCircle();
			break;
		case 2:
			shape.areaTriangle();
			break;
		case 3:
			shape.areaSquare();
			break;
		case 4:
			shape.areaRectangle();
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCalc shape = new AreaCalc();
		int choice = getInput();
		theChoice(shape, choice);
	}

}
