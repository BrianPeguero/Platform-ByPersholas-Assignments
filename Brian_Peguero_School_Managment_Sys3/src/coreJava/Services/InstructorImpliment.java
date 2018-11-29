package coreJava.Services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import coreJava.DAO.DAO;
import coreJava.Enums.InstructorEnum;
import coreJava.Models.Instructor;
import coreJava.Repositories.InstructorDAOI;

public class InstructorImpliment extends DAO implements InstructorDAOI {

	/**
	 * This method takes no parameter and returns every Instructor in the database.
	 * 
	 * @return
	 */
	public List<Instructor> getAllInstructors() {
		List<Instructor> listOfInstructors = new ArrayList<Instructor>();
		
		connect();
		
		try {
			ps = conn.prepareStatement(InstructorEnum.GET_ALL_INSTRUCTORS.getQuery());
			rs = ps.executeQuery();
			
			while (rs.next()) {
				listOfInstructors.add(new Instructor(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5)));
			}
			
		} catch (SQLException e) {
			System.out.println("Sorry no Instructors to show.");
		} finally {
			dispose();
		}
		
		return listOfInstructors;
	}

	/**
	 * This method takes a String as a parameter and queries the database for an
	 * Instructor with such an email and returns an Instructor Object
	 * 
	 * @param email
	 * @return
	 */
	public Instructor getInstructorByEmail(String email) {
		Instructor instructor = null;
		
		connect();
		
		try {
			ps = conn.prepareStatement(InstructorEnum.GET_INSTRUCTOR_BY_EMAIL.getQuery());
			ps.setString(1, email);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				instructor = new Instructor(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}
		} catch (SQLException e) {
			System.out.println("Sorry couldn't find the Instructor.");
		} finally {
			dispose();
		}
		return instructor;
	}

	/**
	 * This method takes two arguments: an instructor object with all its
	 * information and a String which represent the password entered by the user
	 * trying to login as an instructor. This returns “Wrong Credentials”, “Admin”
	 * or “Instructor”.
	 * 
	 * @param instructor
	 * @param comparablePassword
	 * @return
	 */
	public String validateUser(Instructor instructor, String comparablePassword) {
		String message = "";
		
		if ((instructor.getPassword().equals(comparablePassword)) && (instructor.getAdmin_role() == 0)) {
			message = "Instructor";
		} else if ((instructor.getPassword().equals(comparablePassword)) && (instructor.getAdmin_role() == 1)) {
			message = "Admin";
		} else {
			message = "Wrong Credentials";
		}
		
		return message;
	}

}
