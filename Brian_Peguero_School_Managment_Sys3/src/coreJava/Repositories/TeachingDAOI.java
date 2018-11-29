package coreJava.Repositories;

import java.util.List;

import coreJava.Models.Teaching;

public interface TeachingDAOI {

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
	public int assignInstructorToCourse(int course_id, int instructor_id);

	/**
	 * This method takes no parameters and queries the database for every instructor
	 * assigned to a course.
	 * 
	 * @return
	 */
	public List<Teaching> getInstructorsCourses();
	
}
