package coreJava.Repositories;

import java.util.List;

import coreJava.Models.Instructor;

public interface InstructorDAOI {

	/**
	 * This method takes no parameter and returns every Instructor in the database.
	 * 
	 * @return
	 */
	public List<Instructor> getAllInstructors();

	/**
	 * This method takes a String as a parameter and queries the database for an
	 * Instructor with such an email and returns an Instructor Object
	 * 
	 * @param email
	 * @return
	 */
	public Instructor getInstructorByEmail(String email);

	/**
	 * This method takes two arguments: an instructor object with all its
	 * information and a String which represent the password entered by the user
	 * trying to login as an instructor. This returns �Wrong Credentials�, �Admin�
	 * or �Instructor�.
	 * 
	 * @param instructor
	 * @param comparablePassword
	 * @return
	 */
	public String validateUser(Instructor instructor, String comparablePassword);
}
