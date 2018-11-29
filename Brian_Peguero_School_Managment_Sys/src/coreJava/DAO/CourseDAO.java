package coreJava.DAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import coreJava.Models.Course;

public class CourseDAO {
	
	/**
	 * creates a List of Courses by reading in a file and fillinf it with that information
	 * */
	public List<Course> getAllCourses() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("resources\\courses.csv"));
		List<Course> courses = new ArrayList<Course>();
		
		String line = "";
		
		while((line = br.readLine()) != null) {
			String[] csv = line.split(",");
			courses.add(new Course(Integer.parseInt(csv[0]), csv[1], csv[2]));
		}
		
		br.close();
		
		return courses;
	}
	
}
