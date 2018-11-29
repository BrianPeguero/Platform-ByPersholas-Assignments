package coreJava.Repositories;

import coreJava.Models.Student;

public interface StudenDAOI {
	/**
	 * This method takes a String as a parameter and queries the database for an
	 * Student with such an email and returns a Student Object.
	 * 
	 * @param email
	 */
	public Student getStudentByEmail(String email);

	/**
	 * This method takes two parameters: the first one is the password from the
	 * database and the second one is the password from the user input. If both
	 * passwords are the same return true otherwise return false.
	 * 
	 * @param passToValidate
	 * @param comparablePas
	 * @return
	 */
	public boolean ValidateUser(String passToValidate, String comparablePas);
}
