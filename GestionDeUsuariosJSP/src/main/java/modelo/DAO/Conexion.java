package modelo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	protected static Connection con;

	private static String host = "localhost";
	private static String bbdd = "polideportivo";
	private static String usuario = "root";
	private static String contrasenia = "";

	public static void conectar() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://" + host + "/" + bbdd, usuario, contrasenia);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void cerrar() {
		try {
			con.close(); 
		} catch (SQLException e) {
			e.printStackTrace();                 
		}
	}          

}
