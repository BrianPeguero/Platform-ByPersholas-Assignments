package problem5;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Student {
	
	private String name;
	private int grade;
	private double gpa;
	
	public Student(String name, int grade, double gpa) {
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
	}
	
	
	public void getInfo() {
		System.out.println("My name is " + getName() + ". I'm in grade " + Integer.toString(getGrade()) + " and I have a " + Double.toString(getGpa()) + " GPA. For now, at least..");
	}
	
//======================= Getters ===================================	
	public String getName() {
		return this.name;
	}
	
	public int getGrade() {
		return this.grade;
	}

	public double getGpa() {
		return this.gpa;
	}
	
		
//======================= Setters ===================================
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setGrade(int newGrade) {
		this.grade = newGrade;
	}

	public void setGpa(double newGpa) {
		this.gpa = newGpa;
	}


//===================== Static Methods ===========================================	
	public static String[][] getInput() {
		String[][] input = new String[10][3];
		
		Path path = FileSystems.getDefault().getPath("C:\\Users\\brian\\Desktop", "names.txt");
		
		try {
			BufferedReader br = Files.newBufferedReader(path);
			int index = 0;
			String line;
			while((line = br.readLine()) != null) {
				input[index] = line.split(",");
				index++;
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return input;
	}	
	
	public static Student[] fillStudArray(String[][] inputArray) {
		Student[] students = new Student[10];
		
		for(int i = 0; i <= students.length - 1; i++) {
			students[i] = new Student(inputArray[i][0], Integer.parseInt(inputArray[i][1]), Double.parseDouble(inputArray[i][2]));
		}
		
		return students;
	}
	
	public static void displayStudents(Student[] students) {
		for(int i = 0; i <= students.length - 1; i++) {
			students[i].getInfo();
		}
	}
	
	
//======================== Main ===========================================
	public static void main(String[] args) {
		String[][] inputArray = getInput();
		
		Student[] students = fillStudArray(inputArray);
		
		displayStudents(students);

	}
}
