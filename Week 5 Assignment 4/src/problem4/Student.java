package problem4;

import java.io.*;
import java.nio.charset.StandardCharsets;
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
	public static String[] getNameInput() {
		String[] names = new String[10];
		
		Path path = FileSystems.getDefault().getPath("C:\\Users\\brian\\Desktop", "names.txt");
		
		try {
			BufferedReader br = Files.newBufferedReader(path);
			int index = 0;
			String line;
			while((line = br.readLine()) != null) {
				names[index] = line;
				index++;
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return names;
	}
	
	public static int[] getGradeInput() {
		int[] grades = new int[10];
		
		Path path = FileSystems.getDefault().getPath("C:\\Users\\brian\\Desktop", "names.txt");
		
		try {
			BufferedReader br = Files.newBufferedReader(path);
			int index = 0;
			String line;
			while((line = br.readLine()) != null) {
				grades[index] = Integer.parseInt(line);
				index++;
			}
			
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return grades;
	}
	
	public static double[] getGpaInput() {
		double[] gpas = new double[10];
		
		Path path = FileSystems.getDefault().getPath("C:\\Users\\brian\\Desktop", "names.txt");
		
		try {
			BufferedReader br = Files.newBufferedReader(path);
			int index = 0;
			String line;
			while((line = br.readLine()) != null) {
				gpas[index] = Double.parseDouble(line);
				index++;
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gpas;
	}
	
	public static Student[] fillStudArray(String[] names, int[] grades, double[] gpas) {
		Student[] students = new Student[10];
		
		for(int i = 0; i <= students.length - 1; i++) {
			students[i] = new Student(names[i], grades[i], gpas[i]);
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
		String[] names = getNameInput();
		int[] grades = getGradeInput();
		double[] gpas = getGpaInput();
		
		Student[] students = fillStudArray(names, grades, gpas);
		
		displayStudents(students);

	}
}
