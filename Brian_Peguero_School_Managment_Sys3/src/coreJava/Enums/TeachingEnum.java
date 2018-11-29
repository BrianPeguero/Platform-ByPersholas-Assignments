package coreJava.Enums;

public enum TeachingEnum {
	ASSIGN_INSTRUCTOR_TO_COURSE("ALTER teacher"
							  + "INSERT VALUES(?, ?, ?)"),
	GET_INSTRUCTORS_TEACHING_COURSES("SELECT course.course_name, course.minimun_gpa, instructor.full_name, instructor.emial "
								   + "FROM teaching "
								   + "JOIN course "
								   + "ON course.course_id = teaching.course_id "
								   + "JOIN instructor "
								   + "ON instructor.instructor_id = teaching.instructor_id");
	
	private final String query;
	
	TeachingEnum(String query){
		this.query = query;
	}
	
	public String getQuery() {
		return query;
	}
}
