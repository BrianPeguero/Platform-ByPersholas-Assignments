package problem2;

import problem1.Student;

public class GettingMoreAdvanced extends Student{

	public GettingMoreAdvanced(String name, int grade, double gpa) {
		super(name, grade, gpa);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = new Student[3];
		
		double totalGpa = 0;
		for (int i = 0; i <= students.length - 1; i++) {
			Student student = new Student("", 0, 0);
			students[i] = student;
			students[i].setName();
			students[i].setGrade();
			students[i].setGpa();
			System.out.println("");
			
			totalGpa = totalGpa + students[i].getGpa();
		}
		
		System.out.println("Total GPA: " + ((totalGpa)/3));
		
	}

}