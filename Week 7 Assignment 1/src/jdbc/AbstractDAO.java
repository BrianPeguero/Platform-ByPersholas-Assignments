package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AbstractDAO {
	
	private final static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private final static String user = "c##brian";
	private final static String password = "password";
	
	protected static Connection conn = null;
	protected static PreparedStatement ps = null;
	protected static ResultSet rs = null;
	
	public static void connection() {
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("Can't get driver");
		}
	}
	
	public static void dispose() {
		try {
			rs.close();
			ps.close();
			conn.close();
		} catch(Exception e) {
			System.out.println("Can't stop... won't stop");
		}
	}

	public static Connection getConn() {
		return conn;
	}

	public static void setConn(Connection conn) {
		AbstractDAO.conn = conn;
	}

	public static PreparedStatement getPs() {
		return ps;
	}

	public static void setPs(PreparedStatement ps) {
		AbstractDAO.ps = ps;
	}

	public static ResultSet getRs() {
		return rs;
	}

	public static void setRs(ResultSet rs) {
		AbstractDAO.rs = rs;
	}

	public static String getUrl() {
		return url;
	}

	public static String getUser() {
		return user;
	}

	public static String getPassword() {
		return password;
	}
	
	
	
}
