package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "C##BrianPeguero";
		String password = "password";
		
		//connects to the database
		Connection conn = DriverManager.getConnection(url, user, password);
		
		//creates a statement object
		Statement statement = conn.createStatement();
		//adds an SQL statement to statement to be executed
		statement.executeQuery("SELECT * FROM table");
	}
	
}
