package coreJava.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import coreJava.Models.Student;

public class StudentDAO {
	
	/**
	 * creates a list of students from data of a file
	 * */
	@SuppressWarnings("resource")
	public List<Student> getStudents() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("resources\\students.csv"));
		List<Student> students = new ArrayList<Student>();
		String line = "";
		
		while((line = br.readLine()) != null) {
			String[] csv = line.split(",");
			students.add(new Student(csv[0], csv[1], csv[2]));
		}
		
		return students;
	}
	
	/**
	 * after being passed in a list of student objects and an email. using a for loop to iterate
	 * through the list its checks each email from the student and returns that student object
	 * 
	 * @param List<Student>  studentList
	 * @param email  String
	 * */
	public Student getStudentByEmail(List<Student> studentList, String email) {
		Student student = null;
		
		for (int i = 0; i < studentList.size(); i++) {
			if(email.equals(studentList.get(i).getEmail())) {
				student = studentList.get(i);
			}
		}
		return student;
	}
	
	/**
	 * by iterating through a list of students and comparing the values of each email and password to that
	 * passed in. the method validates the user.
	 * 
	 * @param List<Student>  studentList
	 * @param String  email
	 * @param pass  String
	 * 
	 * @return isValid  boolean
	 * */
	public boolean validateUser(List<Student> studentList, String email, String pass) {
		boolean isValid = false;
		
		for (int i = 0; i < studentList.size(); i++) {
			if((email.equals(studentList.get(i).getEmail())) && (pass.equals(studentList.get(i).getPassword()))) {
				isValid = true;
			}
		}
		
		return isValid;
	}
	
}
