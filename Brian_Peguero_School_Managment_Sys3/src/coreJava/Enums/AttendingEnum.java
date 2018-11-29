package coreJava.Enums;

public enum AttendingEnum {
	GET_GPA_MINIMUM("SELECT gpa_minimum FROM course"),
	REGISTER_STUDENT_TO_COURSE("ALTER attending"
							 + "INSERT VALUES( ?, ?)"),
	GET_STUDENTS_COURSES("SELECT course.course_name, student.email , student.full_name " + 
						 "FROM attending  " + 
						 "JOIN course " + 
						 "ON course.course_id = attending.course_id " + 
						 "JOIN student " + 
						 "ON attending.student_id = student.student_id");
	
	private final String query;
	
	AttendingEnum(String query){
		this.query = query;
	}
	
	public String getQuery() {
		return this.query;
	}
}