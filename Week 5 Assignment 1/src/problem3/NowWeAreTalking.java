package problem3;
import java.util.Scanner;

import problem1.Student;

public class NowWeAreTalking extends Student{

	public NowWeAreTalking(String name, int grade, double gpa) {
		super(name, grade, gpa);
		// TODO Auto-generated constructor stub
	}
	
	public static int getTimes() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students will there be? ");
		int times = input.nextInt();
		
		input.close();
		
		return times;
	}

	public static Student[] emptyArrayOfStudents(int times) {
		Student[] arrayOfStudents = new Student[times];
		return arrayOfStudents;
	}
	
	public static Student createStudent() {
		Student aStudent = new Student("", 0, 0);
		aStudent.setName();
		aStudent.setGrade();
		aStudent.setGpa();
		return aStudent;
	}
	
	public static Student[] fillArrayOfStudents(Student[] arrayOfStudents) {
		for (int i = 0; i <= arrayOfStudents.length - 1; i++) {
			arrayOfStudents[i] = createStudent();
		}
		return arrayOfStudents;
	}
	
	public static void displayArrayOfStudents(Student[] arrayOfStudents) {
		for (int i = 0; i <= arrayOfStudents.length - 1; i++) {
			System.out.println(arrayOfStudents[i] + "\n");
		}
	}
	
	public static double displayGpa(Student[] arrayOfStudents) {
		double totalGpa = 0;
		for (int i = 0; i <= arrayOfStudents.length - 1; i++) {
			totalGpa = totalGpa + arrayOfStudents[i].getGpa();
		}
		
		return totalGpa/arrayOfStudents.length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int times = getTimes();
		Student [] emptyArrayOfStudents = emptyArrayOfStudents(times);
		Student[] arrayOfStudents = fillArrayOfStudents(emptyArrayOfStudents);
		displayArrayOfStudents(arrayOfStudents);
		displayGpa(arrayOfStudents);
		
	}

}
