package coreJava.Enums;

public enum CourseEnum {
	GET_ALL_COURSES("SELECT * FROM courses"),
	GET_COURSE_BY_INSTRUCTOR("SELECT course.* "
							+ "FROM course "
							+ "JOIN teaching ON course.course_id = teaching.course_id "
							+ "WHERE instructor_id=?");
	
	private final String query;
	
	CourseEnum(String query){
		this.query = query;
	}
	
	public String getQuery() {
		return query;
	}
}
