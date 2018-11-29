package coreJava.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import coreJava.CustomExceptions.StudentRegistrationException;
import coreJava.Models.Attending;
import coreJava.Models.Course;
import coreJava.Models.Instructor;
import coreJava.Models.Student;
import coreJava.Models.Teaching;
import coreJava.Services.AttendingImpliment;
import coreJava.Services.CourseImpliment;
import coreJava.Services.InstructorImpliment;
import coreJava.Services.StudentImpliment;
import coreJava.Services.TeachingImpliment;

public class App {

	public static int getInput(BufferedReader br) throws NumberFormatException, IOException {
		return Integer.parseInt(br.readLine());
	}

	public static String getCredentials(BufferedReader br) throws IOException {
		return br.readLine();
	}

	public static int intro(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("\nAre you a(n):\n" + "1. Instructor\n" + "2. Student\n" + "3. quit\n");

		return getInput(br);
	}

	public static String getEmail(BufferedReader br) throws IOException {
		System.out.print("\nEnter your email:\t");
		return getCredentials(br);
	}

	public static String getPassword(BufferedReader br) throws IOException {
		System.out.print("\nEnter you password:\t");
		return getCredentials(br);
	}

	public static void displayCourses(List<Course> listOfCourses) {
		System.out.println("All Courses:\n" + "ID\tCOURSE NAME\tMINIMUN GPA");
		for (int i = 0; i < listOfCourses.size(); i++) {
			System.out.println(listOfCourses.get(i).getCourse_id() + "\t" + listOfCourses.get(i).getCourse_name() + "\t"
					+ listOfCourses.get(i).getMinimum_gpa() + "\n");
		}
	}

	public static void registerStudent(BufferedReader br, Student student) {
		List<Course> listOfCourses = new CourseImpliment().getAllCourses();
		AttendingImpliment attending = new AttendingImpliment();
		displayCourses(listOfCourses);

		try {
			System.out.println("Which Course would you like to register for?");
			int input = getInput(br);

			Course courseToRegisterTo = null;
			for (Course course : listOfCourses) {
				if (course.getCourse_id() == input) {
					courseToRegisterTo = course;
				}
			}

			attending.registerStudentToCourse(student, courseToRegisterTo);

		} catch (NumberFormatException e) {
			System.out.println("\nSorry didn't get that\n");
			registerStudent(br, student);
		} catch (IOException e) {
			System.out.println("\nSorry didn't get that\n");
			registerStudent(br, student);
		} catch (StudentRegistrationException e) {
			System.out.println("\nBack To Menu\n");
			loggedInStudent(br, student);
		}
	}

	public static void displayStuCourses(List<Attending> studentsCourses, Student student) {
		System.out.println("#\tCourse Name\tInstructor Name\tInstructor Email");
		for (int i = 0; i < studentsCourses.size(); i++) {
			System.out.println(i + "\t" + studentsCourses.get(i).getCourse_name() + "\t"
					+ studentsCourses.get(i).getFull_name() + "\t" + studentsCourses.get(i).getEmail());
		}
	}

	public static void loggedInStudent(BufferedReader br, Student student) {
		List<Attending> studentsCourses = new AttendingImpliment().getStudentCourse(student.getStudent_id());
		displayStuCourses(studentsCourses, student);

		int input;

		try {
			System.out.println("\n1. Register to course\n2. logout\n");
			input = getInput(br);

			while (input != 2) {
				if (input == 1) {
					registerStudent(br, student);
				} else {
					System.out.println("\nSorry I didn't get that please try again\n");
					loggedInStudent(br, student);
				}

				System.out.println("\n1. Register to course\n2. logout\n");
				input = getInput(br);
			}

		} catch (NumberFormatException e) {
			System.out.println("\nSorry not a number");
			System.out.println("\n1. Register to course\n2. logout\n");
			loggedInStudent(br, student);
		} catch (IOException e) {
			System.out.println("\nSorry not a number");
			System.out.println("\n1. Register to course\n2. logout\n");
			loggedInStudent(br, student);
		}
	}

	public static void studentLogin(BufferedReader br) {
		try {
			String email = getEmail(br);
			String password = getPassword(br);

			StudentImpliment stuI = new StudentImpliment();
			Student stu = stuI.getStudentByEmail(email);

			if (stuI.ValidateUser(stu.getPassword(), password)) {
				loggedInStudent(br, stu);
			} else {
				System.out.println("\nSorry I didn't get that. Try again...\n");
				studentLogin(br);
			}
		} catch (IOException e) {
			System.out.println("\nSorry I didn't get that. Try again...\n");
			studentLogin(br);
		}

	}
	
	public static void displayInstructorsAndCourses() {
		List<Teaching> teacher = new TeachingImpliment().getInstructorsCourses();
		System.out.println("Course Name\tCourse Min GPA");
		for (Teaching teach : teacher) {
			System.out.println(teach.getCourse_name() + "\t" + teach.getMinimum_gpa() + "\n");
		}
	}
	
	public static void displayInstructorCourses(Instructor instructor) {
		List<Teaching> teacher = new TeachingImpliment().getInstructorsCourses();
		System.out.println("Course Name\tCourse Min GPA");
		for (Teaching teach : teacher) {
			if (teach.getEmail().equals(instructor.getEmail())) {
				System.out.println(teach.getCourse_name() + "\t" + teach.getMinimum_gpa() + "\n");
			}
		}
	}
	
	public static void displayInstructors() {
		List<Instructor> listOfIns = new InstructorImpliment().getAllInstructors();
		
		System.out.println("Instructors");
		System.out.println("ID\tName\tEmail\tSpeciality");
		System.out.println("=============================================");
		
		for (Instructor ins : listOfIns) {
			System.out.println(ins.getInstructor_id() + "\t" + ins.getFull_name() + "\t" + ins.getSpeciality());
		}
	
	}
	
	public static void assignInstructor(BufferedReader br) {
		TeachingImpliment teaching = new TeachingImpliment();
		List<Course> listOfCourses = new CourseImpliment().getAllCourses();
		
		displayInstructorsAndCourses();
		
		try {
			displayInstructors();
			System.out.println("\nWhich Instructor?");
			int instructor = getInput(br);
			
			displayCourses(listOfCourses);
			System.out.println("\nWhich Course?");
			int course = getInput(br);
			
			int record = teaching.assignInstructorToCourse(course, instructor);
			
			System.out.println("-->Instructor Assigned<--");
			System.out.println("New Record ID: " + record);
			
			displayInstructorsAndCourses();
		} catch (NumberFormatException e) {
			System.out.println("\nSorry... Try again\n");
			assignInstructor(br);
		} catch (IOException e) {
			System.out.println("\nSorry... Try again\n");
			assignInstructor(br);
		}
		
	}
	
	public static void loggedInAdminInstructor(BufferedReader br, Instructor instructor) {
		List<Teaching> teacher = new TeachingImpliment().getInstructorsCourses();
		System.out.println("\nCourse Name\tCourse Min GPA\tInstructor Name\tInstructor Email");
		
		for (Teaching teach : teacher) {
			System.out.println(teach.getCourse_name() + "\t" + teach.getMinimum_gpa() + "\t" + teach.getFull_name() + "\t" + teach.getEmail());
		}
		
		int input;
		
		try {
			System.out.println("\n1. Assign instructor to course\n2. Logout");
			input = getInput(br);
			
			while (input == 1) {
				assignInstructor(br);
				
				System.out.println("\\n1. Assign instructor to course\\n2. Logout");
				input = getInput(br);
			}
		} catch (NumberFormatException e) {
			System.out.println("\nSorry didn't get that try again\n");
			loggedInAdminInstructor(br, instructor);
		} catch (IOException e) {
			System.out.println("\nSorry didn't get that try again\n");
			loggedInAdminInstructor(br, instructor);
		}
		
	}

	public static void loggedInInstructor(BufferedReader br, Instructor instructor) {
		displayInstructorCourses(instructor);
		menu(br);
	}

	public static void instructorLogin(BufferedReader br) throws IOException {
		InstructorImpliment ins = new InstructorImpliment();
		String role = "";

		try {
			String email = getEmail(br);
			String password = getPassword(br);

			Instructor instructor = new InstructorImpliment().getInstructorByEmail(email);

			while (!(role = ins.validateUser(instructor, password)).equals("")) {
				if (role.equals("Instructor")) {
					loggedInInstructor(br, instructor);
				} else if (role.equals("Admin")) {
					loggedInAdminInstructor(br, instructor);
				} else if (role.equals("Wrong Credentials")) {
					System.out.println("\nSorry I didn't get that. Try again...\n");
					instructorLogin(br);
				}
			}
		} catch (IOException e) {
			System.out.println("\nSorry I didn't get that. Try again...\n");
			instructorLogin(br);
		}
	}

	public static void menu(BufferedReader br) {
		try {
			int introInput = intro(br);
			while (introInput == 1) {
				instructorLogin(br);
				
				introInput = intro(br);
			}
		} catch (NumberFormatException | IOException e) {
			System.out.println("\nSorry i didnt get that please try again.\n");
			menu(br);

		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		menu(br);
		
		br.close();
	}

}
