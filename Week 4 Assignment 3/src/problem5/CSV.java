package problem5;
import java.util.Scanner;

public class CSV {
	
	public static String getInput(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an list seperated by commas:");
		String csvList = input.nextLine();
		
		input.close();
		
		return csvList.replaceAll("\\s", "");
	}
	
	public static String[] splitString(String csvList) {
		String[] seperatedList = csvList.split(",");
		return seperatedList;
	}
	
	public static String[] trimWhitespaces(String[] seperatedList) {
		for(int i=0; i<=seperatedList.length-1; i++) {
			seperatedList[i] = seperatedList[i].trim();
		}
		return seperatedList;
	}
	
	
	public static void displayStringArray(String[] completeArray){
		for(int i=0; i<=completeArray.length-1; i++) {
			System.out.print(completeArray[i] + " ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String csv = getInput();
		String[] splitCSV = splitString(csv);
		String[] completeList = trimWhitespaces(splitCSV);
		displayStringArray(completeList);
	}

}
