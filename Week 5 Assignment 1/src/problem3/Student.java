package problem3;
import java.util.Scanner;

public class Student {
	
	private String name;
	private int grade;
	private double gpa;
	
	public Student(String name, int grade, double gpa) {
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public double getGpa() {
		return this.gpa;
	}
	
	@SuppressWarnings("resource")
	public void setName() {
		System.out.print("Name: ");
		Scanner input = new Scanner(System.in);
		this.name = input.next();
	}
	
	@SuppressWarnings("resource")
	public void setGrade() {
		System.out.print("Grade: ");
		Scanner input = new Scanner(System.in);
		this.grade = input.nextInt();
	}
	
	@SuppressWarnings("resource")
	public void setGpa() {
		System.out.print("GPA: ");
		Scanner input = new Scanner(System.in);
		this.gpa = input.nextDouble();
	}
	
	public String toString() {
		return "name: " + this.name + "\nGrade: " + this.grade + "\nGPA: " + this.gpa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("", 0, 0);
		student1.setName();
		student1.setGrade();
		student1.setGpa();
		
		Student student2 = new Student("", 0, 0);
		student2.setName();
		student2.setGrade();
		student2.setGpa();
		
		Student student3 = new Student("", 0, 0);
		student3.setName();
		student3.setGrade();
		student3.setGpa();
		
		System.out.println("");
		System.out.println(student1);
		
		System.out.println("");
		System.out.println(student2);
		
		System.out.println("");
		System.out.println(student3);
		
		System.out.println("");
		System.out.println("average GPA is :" + ((student1.getGrade() + student2.getGrade() + student3.getGrade())/3));
	}

}
