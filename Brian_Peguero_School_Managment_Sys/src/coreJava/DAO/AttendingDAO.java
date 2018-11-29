package coreJava.DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import coreJava.Models.Attending;
import coreJava.Models.Course;

public class AttendingDAO {
	
	public List<Attending> getAttending() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\brian\\Desktop\\attending.csv"));
		List<Attending> attenders = new ArrayList<Attending>();
		
		String line = "";
		
		while((line = br.readLine()) != null) {
			String[] csv = line.split(",");
			attenders.add(new Attending(Integer.parseInt(csv[0]), csv[1]));
		}
		
		br.close();
		
		return attenders;
	}
	
	public void registerStudentToCourse(List<Attending> attending, String email, int course) {
		try {
			attending.add(new Attending(course, email));
			saveAttending(attending);
			System.out.println("You have been registered for the course");
		} catch (IOException e) {
			System.out.println("Couldn't register you for the course.\n");
		}
	}
	
	public List<Course> getStudentCourses(List<Course> courses, List<Attending> attending, String email) throws IOException {
		List<Course> studentsCourses = new ArrayList<Course>();
		List<Integer> courseID = new ArrayList<Integer>();
		
		for(int i = 0; i < attending.size(); i++) {
			if(attending.get(i).getStudent_email().equals(email)) {
				courseID.add(attending.get(i).getCourse_id());
			}
		}
		
		for (int i = 0; i < courseID.size(); i++) {
			if (!studentsCourses.contains(courses.get(i))) {
				studentsCourses.add(courses.get(i));
			}
		}
		
		return studentsCourses;
	}
	
	@SuppressWarnings("resource")
	public void saveAttending(List<Attending> attending) throws IOException {
		File file = new File("resources\\attending.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		
		file.delete();
		
		for (int i = 0; i < attending.size(); i++) {
			bw.write(String.valueOf(attending.get(i).getCourse_id()));
			bw.write(",");
			bw.write(String.valueOf(attending.get(i).getStudent_email()));
			bw.write("\n");
		}
		
		bw.flush();
		
	}
	
}
