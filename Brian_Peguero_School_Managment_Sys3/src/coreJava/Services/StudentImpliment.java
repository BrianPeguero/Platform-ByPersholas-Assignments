package coreJava.Services;

import java.sql.SQLException;

import coreJava.DAO.DAO;
import coreJava.Enums.StudentEnum;
import coreJava.Models.Student;
import coreJava.Repositories.StudenDAOI;

public class StudentImpliment extends DAO implements StudenDAOI{

	/**
	 * This method takes a String as a parameter and queries the database for an
	 * Student with such an email and returns a Student Object.
	 * 
	 * @param email
	 */
	public Student getStudentByEmail(String email) {
		connect();
		
		Student student = null;
		
		try {
			ps = conn.prepareStatement(StudentEnum.GET_STUDENT_BY_EMAIL.getQuery());
			ps.setString(1, email);
			rs = ps.executeQuery();
		
			while (rs.next()) {
				student = new Student(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
			}
		} catch (SQLException e) {
			System.out.print("\nSorry couldn't execute your query.\n");
		} finally {
			dispose();
		}
		
		return student;
	}

	/**
	 * This method takes two parameters: the first one is the password from the
	 * database and the second one is the password from the user input. If both
	 * passwords are the same return true otherwise return false.
	 * 
	 * @param passToValidate
	 * @param comparablePas
	 * @return
	 */
	public boolean ValidateUser(String passwordToValidate, String comparablePassword) {
		boolean isValidUser = false;
		
		if (passwordToValidate.equals(comparablePassword)) {
			isValidUser = true;
		}
		
		return isValidUser;
	}
	
}
