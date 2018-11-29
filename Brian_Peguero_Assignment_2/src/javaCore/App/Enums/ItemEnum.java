package javaCore.App.Enums;

public enum ItemEnum {
	GET_ITMES_IN_STOCK("SELECT * FROM item WHERE quantity_in_stock>0"),
	UPDATE_QUANTITY_IN_STOCK("ALTER TABLE item");
		
	private String query;
		
	ItemEnum(String query){
		this.query = query;
	}
		
	public String getQuery() {
		return query;
	}
}
