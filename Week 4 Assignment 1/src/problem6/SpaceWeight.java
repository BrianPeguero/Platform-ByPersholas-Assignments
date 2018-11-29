package problem6;
import java.util.Scanner;

public class SpaceWeight {
	
	
	@SuppressWarnings("resource")
	public static double getWeight() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your weight: ");
		double weight = input.nextDouble();
		
		return weight;
	}
	
	@SuppressWarnings("resource")
	public static int getPlanet() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number of the planet you would like to go to:\n");
		System.out.println("1: Venus\n2: Mars\n3: Jupiter\n4: Saturn\n5: Uranus\n6: Neptune\n");
		
		int planet = input.nextInt();
		
		return planet;
	}
	
	public static double weightCalc(int planet) {
		double[] planets = { .78, .39, 2.65, 1.17, 1.05, 1.23 };
		double gravity = 0;
		
		for (int i=0; i <= planets.length-1; i++) {
			if(i+1==planet) {
				gravity = planets[i];
			} 
		}
		return gravity;
	}
	
	public static void display(double gravity, double weight) {
		System.out.println("Your weight would be " + gravity*weight);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight = getWeight();
		int planet = getPlanet();
		double gravity = weightCalc(planet);
		display(gravity, weight);

	}

}
