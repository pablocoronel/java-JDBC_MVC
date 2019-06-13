package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private Connection conexion_BD = null;

	public Conexion() {

	}

	/**
	 * CONEXION CON BD
	 */
	public Connection getConexion() {
		String url = "jdbc:mysql://localhost:3306/jdbc_curso_sql";
		String user = "root";
		String password = "";

		try {
			// conexion
			this.conexion_BD = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return this.conexion_BD;
	}
}
