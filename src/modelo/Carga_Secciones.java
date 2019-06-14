package modelo;

import java.sql.*;

public class Carga_Secciones {
	private Conexion mi_conexion;
	public ResultSet rs;

	public Carga_Secciones() {
		this.mi_conexion = new Conexion();
	}

	// PROFE
	/*
	 * public String ejecuta_consultas() { Productos mi_producto = null;
	 * 
	 * Connection acceso_BBDD = mi_conexion.getConexion();
	 * 
	 * try { Statement secciones = acceso_BBDD.createStatement();
	 * 
	 * rs = secciones.executeQuery("SELECT DISTINCT SECCIÓN FROM productos");
	 * 
	 * mi_producto = new Productos(); mi_producto.setSeccion(rs.getString(1));
	 * 
	 * rs.close(); } catch (Exception e) { // TODO: handle exception
	 * e.printStackTrace(); }
	 * 
	 * return mi_producto.getSeccion(); }
	 */

	public ResultSet ejecuta_consultas() {
		Connection accessoBBDD = mi_conexion.getConexion();
		try {
			Statement secciones = accessoBBDD.createStatement();
			return rs = secciones.executeQuery("SELECT DISTINCTROW SECCIÓN FROM PRODUCTOS");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
