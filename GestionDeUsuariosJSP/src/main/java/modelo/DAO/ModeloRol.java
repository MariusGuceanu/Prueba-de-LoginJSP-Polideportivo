package modelo.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModeloRol {

	public Rol cargarRol (int id_Rol) {
		Rol rol = new Rol();
	
		Conexion.conectar();

		try {
			String st = "SELECT * FROM roles WHERE id_Rol = ?";

			PreparedStatement pst = Conexion.con.prepareStatement(st);

			pst.setInt(1, id_Rol);

			ResultSet result = pst.executeQuery();
			result.next();

			rol.setId_Rol(result.getInt("id_Rol"));
			rol.setTitulo(result.getString("titulo"));


		} catch (SQLException e) {
			e.printStackTrace();
		}
		Conexion.cerrar();
		
		return rol;
	}
}
