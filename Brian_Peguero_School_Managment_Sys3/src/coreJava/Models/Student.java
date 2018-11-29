package coreJava.Models;

public class Student {
	
	private int student_id;
	private String full_name;
	private String email;
	private double gpa;
	private String password;
	private int student_role;
	
	public Student() {
		this.email = "";
		this.full_name = "";
		this.gpa = 0;
		this.password = "";
		this.student_id = 0;
		this.student_role = -1;
	}
	
	public Student(int student_id, String full_name, String email, double gpa, String password) {
		this.email = email;
		this.full_name = full_name;
		this.gpa = gpa;
		this.password = password;
		this.student_id = student_id;
		this.student_role = -1;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStudent_role() {
		return student_role;
	}

	public void setStudent_role(int student_role) {
		this.student_role = student_role;
	}
	
	
	
}