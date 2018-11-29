package coreJava.Enums;

public enum StudentEnum {
	GET_STUDENT_BY_EMAIL("SELECT * FROM student WHERE email=?"),
	STUDENT_PASSWORD("SELECT password FROM student WHERE email=?");
	
	private final String query;
	
	StudentEnum(String query){
		this.query = query;
	}
	
	public String getQuery() {
		return query;
	}
}