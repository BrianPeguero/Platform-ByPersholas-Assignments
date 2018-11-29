package problem4;
import java.util.Scanner;

public class PythagoreanTheorum {
	
	public PythagoreanTheorum() {
	}
	
	public double pythagorean(double a, double b) {
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return c;
	}
	
	public static double[] getSides() {
		double[] sides = new double[2];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("");
		sides[0] = input.nextDouble();
		
		System.out.println("");
		sides[1] = input.nextDouble();
		
		input.close();
		
		return sides;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PythagoreanTheorum tri = new PythagoreanTheorum();
		double[] sides = getSides();
		tri.pythagorean(sides[0], sides[1]);
	}

}
