package coreJava.Models;

public class Attending {
	
	private int course_id;
	private String student_email;
	
	public Attending(int course_id, String student_email) {
		this.course_id = course_id;
		this.student_email = student_email;
	}
	
	
	public Attending() {
		this.course_id = 0;
		this.student_email = null;
	}


	public int getCourse_id() {
		return course_id;
	}


	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}


	public String getStudent_email() {
		return student_email;
	}


	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}

}
