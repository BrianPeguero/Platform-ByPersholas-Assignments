package coreJava.Models;

public class Course {
	
	private int course_id;
	private String course_name;
	private String instructor_name;
	
	
	public Course(int course_id, String course_name, String instructor_name) {
		this.course_id = course_id;
		this.course_name = course_name;
		this.instructor_name = instructor_name;
	}
	
	public Course() {
		this.course_id = 0;
		this.course_name = null;
		this.instructor_name = null;
	}

	public int getID() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getName() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getInstructor() {
		return instructor_name;
	}

	public void setInstructor_name(String instructor_name) {
		this.instructor_name = instructor_name;
	}

}
