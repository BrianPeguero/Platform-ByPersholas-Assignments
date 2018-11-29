package coreJava.MainEntryPoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import coreJava.DAO.AttendingDAO;
import coreJava.DAO.CourseDAO;
import coreJava.DAO.StudentDAO;
import coreJava.Models.Attending;
import coreJava.Models.Course;
import coreJava.Models.Student;

public class MainRunner {

	/**
	 * The method tries to read and parse the integer from the input
	 * 
	 * @param br BufferedReader
	 * 
	 * @return input integer
	 */
	public static int getInput(BufferedReader br) throws IOException, NumberFormatException {
		int input;

		try {
			input = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.out.println("Sorry I didnt get that. Please try again\n");
			input = getInput(br);
		} catch (NumberFormatException e) {
			System.out.println("Sorry I didnt get that. Please try again\n");
			input = getInput(br);
		}

		return input;
	}

	/**
	 * The method tries to read and parse the integer from the input
	 * 
	 * @param br BufferedReader
	 * 
	 * @return input integer
	 */
	public static String getEmail(BufferedReader br) {
		String email;

		try {
			System.out.print("Please Enter your email:\t");
			email = br.readLine();
		} catch (IOException e) {
			System.out.println("\nSorry I didnt get that. Please try again\n");
			email = getEmail(br);
		}

		return email;
	}

	/**
	 * The method tries to read input
	 * 
	 * @param br BufferedReader
	 * 
	 * @return password
	 */
	public static String getPassword(BufferedReader br) {
		String password = "";

		try {
			System.out.print("Please Enter your password:\t");
			password = br.readLine();
		} catch (IOException e) {
			System.out.println("\nSorry I didnt get that. Please try again\n");
			menu(br);
		}

		return password;
	}
	
	/**
	 * the method calls on register student to course using course ID and student email
	 * 
	 * @param BufferedReader br
	 * @param List<Course> courseList 
	 * @param AttendingDAO attendingDAO
	 * @param List<Attending> attendingList 
	 * @param Student student
	 * */
	public static void registerNewCourse(BufferedReader br, 
										List<Course> courseList, AttendingDAO attendingDAO,
										List<Attending> attendingList, Student student) throws IOException {
		// Display a list1 of all Classes
		allClasses(courseList);
		System.out.print("Select Course by ID Number: ");
		int courseID = Integer.parseInt(br.readLine());
		System.out.println("\nAttempting to Register...\n");
		attendingDAO.registerStudentToCourse(attendingList, student.getEmail(), courseID);
	}

	/**
	 * after the student is logged in the it asks them for their choice of loggin out or registering for  ne course
	 * 
	 * @param BufferedReader br 
	 * @param List<Student> studentList 
	 * @param StudentDAO studentDAO
	 * @param String email
	 * */
	public static void loggedIn(BufferedReader br, List<Student> studentList, StudentDAO studentDAO, String email) {
		try {

			CourseDAO courseDAO = new CourseDAO();
			AttendingDAO attendingDAO = new AttendingDAO();
			Student student = studentDAO.getStudentByEmail(studentList, email);
			List<Course> courseList = courseDAO.getAllCourses();
			List<Attending> attendingList = attendingDAO.getAttending();

			myClasses(student, courseList, attendingList);

			try {
				System.out.println("What would you like to do?\n1. Register for a new Class\n2. Log Out\n");
				int input = getInput(br);
				while (input == 1) {
					registerNewCourse(br, courseList, attendingDAO, attendingList, student);
					System.out.println("\nWhat would you like to do?\n1. Register for a new Class\n2. Log Out\n");
					input = getInput(br);
				}
				System.out.println("\nlogging out...\n");
			} catch (IOException e) {
				System.out.println("\nSorry try again...\n");
				loggedIn(br, studentList, studentDAO, email);
			} catch (NumberFormatException e) {
				System.out.println("\nSorry try again...\n");
				loggedIn(br, studentList, studentDAO, email);
			}

		} catch (IOException e) {
			System.out.println("You've been logged out try again\n");
			menu(br);
		} catch (NumberFormatException e) {
			System.out.println("You've been logged out try again\n");
			menu(br);
		}
	}

	
	/**
	 * the start menu of the program after confirming that they want to continue as a student
	 * using their email and password they are validated with the records and either proceed to told to try again
	 * 
	 * @param BufferedReader  br
	 * */
	public static void menu(BufferedReader br) {
		try {

			System.out.println("Are you a student?\n1. Student\n2. Quit\n");
			int input = getInput(br);
			if (input == 1) {
				StudentDAO studentDAO = new StudentDAO();
				List<Student> studentList = studentDAO.getStudents();
				String email = getEmail(br);
				String password = getPassword(br);

				if (studentDAO.validateUser(studentList, email, password)) {
					loggedIn(br, studentList, studentDAO, email);
				} else {
					System.out.println("\nSorry I didnt get that. Please try again\n");
					menu(br);
				} 
			} else if(input == 2) {
				
			} else if(input >= 2) {
				menu(br);
			}
			System.out.println("Logging out...\n");
		} catch (IOException e) {
			System.out.println("Sorry I didnt get that. Please try again\n");
			menu(br);
		} catch (NumberFormatException e) {
			System.out.println("Sorry I didnt get that. Please try again\n");
			menu(br);
		}
	}

	public static void myClasses(Student student, List<Course> courseList, List<Attending> attendingList)
			throws IOException {
		System.out.println("\nMy Classes: ");
		System.out.printf("%-5s|%-25s|%-25s\n", "#", "COURSE NAME", "INSTRUCTOR NAME");
		AttendingDAO attendingDAO = new AttendingDAO();
		List<Course> courses = attendingDAO.getStudentCourses(courseList, attendingList, student.getEmail());
		for (Course course : courses) {
			System.out.printf("%-5s|%-25s|%-25s\n", course.getID(), course.getName(), course.getInstructor());
		}
	}

	public static void allClasses(List<Course> courseList) {
		System.out.println("\nAll Classes: ");
		System.out.printf("%-5s|%-25s|%-25s\n", "#", "COURSE NAME", "INSTRUCTOR NAME");
		for (Course course : courseList) {
			System.out.printf("%-5s|%-25s|%-25s\n", course.getID(), course.getName(), course.getInstructor());
		}
	}

	/**initializes and closes a buffered reader instance*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		menu(br);

		br.close();
	}

}
