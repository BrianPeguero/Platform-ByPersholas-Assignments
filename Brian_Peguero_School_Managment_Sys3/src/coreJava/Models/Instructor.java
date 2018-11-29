package coreJava.Models;

public class Instructor {
	
	private int instructor_id;
	private String full_name;
	private String email;
	private String speciality;
	private int admin_role;
	private String password;
	
	public Instructor(int instructor_id, String full_name, String email, String speciality, int admin_role, String password) {
		this.instructor_id = instructor_id;
		this.admin_role = admin_role;
		this.email = email;
		this.full_name = full_name;
		this.password = password;
		this.speciality = speciality;
	}
	
	public Instructor() {
		this.admin_role = 1;
		this.email = "";
		this.full_name = "";
		this.instructor_id = 0;
		this.password = "";
		this.speciality = "";
	}

	public int getInstructor_id() {
		return instructor_id;
	}

	public void setInstructor_id(int instructor_id) {
		this.instructor_id = instructor_id;
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

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getAdmin_role() {
		return admin_role;
	}

	public void setAdmin_role(int admin_role) {
		this.admin_role = admin_role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
