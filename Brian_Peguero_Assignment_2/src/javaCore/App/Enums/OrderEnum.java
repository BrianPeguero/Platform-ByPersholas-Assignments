package javaCore.App.Enums;

public enum OrderEnum {
	CREATE_ORDER("INSERT INTO order VALUES(?, ?)");
		
	private String query;
		
	OrderEnum (String query){
		this.query = query;
	}
		
	public String getQuery() {
		return query;
	}
}
