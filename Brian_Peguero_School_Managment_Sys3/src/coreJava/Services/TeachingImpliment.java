package coreJava.Services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import coreJava.DAO.DAO;
import coreJava.Enums.TeachingEnum;
import coreJava.Models.Teaching;
import coreJava.Repositories.TeachingDAOI;

public class TeachingImpliment extends DAO implements TeachingDAOI {

	/**
	 * This method takes no parameters and queries the database for every instructor
	 * assigned to a course.
	 * 
	 * @return
	 */
	public List<Teaching> getInstructorsCourses() {
		List<Teaching> listOfInstructors = new ArrayList<Teaching>();
		
		connect();
		
		try {
			ps = conn.prepareStatement(TeachingEnum.GET_INSTRUCTORS_TEACHING_COURSES.getQuery());
			rs = ps.executeQuery();
			
			while(rs.next()) {
				listOfInstructors.add(new Teaching(rs.getString(0), rs.getDouble(1), rs.getString(2), rs.getString(3)));
			}
			
		} catch (SQLException e) {
			System.out.println("Sorry couldn't execute query.");
		} finally {
			dispose();
		}
		
		
		return listOfInstructors;
	}

	/**
	 * This method takes as a parameter a course_id and a instructor_id int and
	 * perform an INSERT query into the TEACHING table to assign an instructor to a
	 * course.
	 * 
	 * @param course_id
	 * @param instructor_id
	 * 
	 * @return
	 */
	public int assignInstructorToCourse(int course_id, int instructor_id) {
		connect();
		
		try {
			ps = conn.prepareStatement(TeachingEnum.ASSIGN_INSTRUCTOR_TO_COURSE.getQuery());
			ps.setInt(1, course_id);
			ps.setInt(2, instructor_id);
			
			ps.executeQuery();
			
		} catch (SQLException e) {
			System.out.println("Sorry couldn't ");
		} finally {
			dispose();
		}
		
		return 0;
	}

}