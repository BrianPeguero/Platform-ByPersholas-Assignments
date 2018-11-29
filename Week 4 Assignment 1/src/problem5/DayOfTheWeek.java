package problem5;
import java.util.Scanner;

public class DayOfTheWeek {

	public static int getNumb() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("eneter a number from 1-7 for the day of the week you would like: ");
		int numb = input.nextInt();
		input.close();
		
		return numb;
	}
	
	public static String dayOfTheWeek(int numb) {
		String day = "";
		
		if((numb>=1 && numb<=7)) {
			switch (numb) {
				
				case 1:
					day = "Monday";
					break;
				case 2:
					day = "Tuesday";
					break;
				case 3:
					day = "Wednesday";
					break;
				case 4:
					day = "Thursday";
					break;
				case 5:
					day = "Friday";
					break;
				case 6:
					day = "Saturday";
					break;
				case 7:
					day = "Sunday";
					break;
					
			}
		} else {
			day = "Error";
		}
		
		return day;
	}
	
	public static void display(String day) {
			System.out.println(day);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb = getNumb();
		String day = dayOfTheWeek(numb);
		display(day);

	}

}
