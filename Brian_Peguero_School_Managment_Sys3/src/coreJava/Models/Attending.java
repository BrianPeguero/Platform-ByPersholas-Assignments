package coreJava.Models;

public class Attending {
	private String course_name;
	private String full_name;
	private String email;
	
	public Attending() {
		this.course_name = "";
		this.email = "";
		this.full_name = "";
	}
	
	public Attending(String course_name, String full_name, String email) {
		this.course_name = course_name;
		this.email = email;
		this.full_name = full_name;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
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
	
	
	
}
