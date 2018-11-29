package javaCore.App.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractDAO {
	
	private final String url = "jdbc:oracle:thin:localhost:1521:orcl";
	private final String user = "username";
	private final String password = "password";
	
	protected Connection connection = null;
	protected PreparedStatement ps = null;
	protected ResultSet rs = null;
	
	public void connect() {
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Can't connect to the database...");
		}
	}
	
	public void dispose() {
		try {
			rs.close();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println("Can't close connection. Force stop it...");
		}
		
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public PreparedStatement getPs() {
		return ps;
	}

	public void setPs(PreparedStatement ps) {
		this.ps = ps;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
	
	
}