package coreJava.Enums;

public enum InstructorEnum {
	GET_ALL_INSTRUCTORS("SELECT * FROM instructor"),
	GET_INSTRUCTOR_BY_EMAIL("SELECT * FROM instructor WHERE email=?");
	
	private final String query;
	
	InstructorEnum(String query){
		this.query = query;
	}
	
	public String getQuery() {
		return query;
	}
}
