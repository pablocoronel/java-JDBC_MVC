package modelo;

import java.sql.*;

public class Carga_Secciones {
	private Conexion mi_conexion;
	public ResultSet rs;

	public Carga_Secciones() {
		this.mi_conexion = new Conexion();
	}

	public String ejecuta_consultas() {
		Productos mi_producto = null;

		Connection acceso_BBDD = mi_conexion.getConexion();

		try {
			Statement secciones = acceso_BBDD.createStatement();

			rs = secciones.executeQuery("SELECT DISTINCT SECCIÓN FROM productos");

			while (rs.next()) {
				mi_producto = new Productos();

				mi_producto.setSeccion(rs.getString(1));
				return mi_producto.getSeccion();
			}

			rs.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return mi_producto.getSeccion();
	}
}
