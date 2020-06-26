package awl.modulo4.conexion;

import java.sql.*;

public class ConexionSingleton {

	private static Connection conn = null;
	private String driver;
	private String url;
	private String usuario;
	private String password;
	
	private ConexionSingleton() {
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		driver = "oracle.jdbc.driver.OracleDriver";
		usuario = "usertest3";
		password = "1234";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, password);	
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		if (conn == null) {
			new ConexionSingleton();
		}
		return conn;
	}
}
