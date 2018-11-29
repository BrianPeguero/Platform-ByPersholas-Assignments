package coreJava.Repositories;

import java.util.List;

import coreJava.Models.Course;

public interface CourseDAOI {

	/**
	 * This method takes no parameter and returns every Course in the database.
	 * 
	 * @return
	 */
	public List<Course> getAllCourses();

	/**
	 * This method takes an int as a parameter and queries the database for all the
	 * courses one instructor is assigned to.
	 * 
	 * @param instructor_id
	 * @return
	 */
	public List<Course> getCourseByInstructor(int instructor_id);
}
