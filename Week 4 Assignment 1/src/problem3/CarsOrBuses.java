package problem3;

public class CarsOrBuses {
	
	public static void decisions(int buses, int cars, int people){
		//the if else statement evaluates which of the statements is true if none are then it will move on
		if(cars > people){
			display("We should take the cars.");
		}else if(people > cars) {
			display("We should not take the cars.");
		} else {
			display("We can't decide.");
		}
		
		//the if else statement evaluates which of the statements is true if none are then it will move on
		if(buses > cars){
			display("That's too many buses.");
		} else if(cars > buses){
			display("Maybe we should take the buses.");
		} else {
			display("We still can't decide.");
		}
		
		//the if else statement evaluates which of the statements is true if none are then it will move on
		if(people > buses) {
			display("Alright, let's just take the buses.");
		} else {
			display("Let's just take the cars.");
		}
	}
	
	public static void display(String decision) {
		System.out.println(decision);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if i take out the else in one of the statement then it will display the out statement
		int buses = 10;
		int people = 10;
		int cars = 10;
		
		decisions(buses, people, cars);

	}

}
