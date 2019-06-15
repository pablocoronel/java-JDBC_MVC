package modelo;

import java.sql.*;

public class Carga_Menues {
	private Conexion mi_conexion;
	public ResultSet rs;
	public ResultSet rs_2;

	public Carga_Menues() {
		this.mi_conexion = new Conexion();
	}

	// PROFE
	public String ejecuta_consultas() {
		Productos mi_producto = null;

		Connection acceso_BBDD = mi_conexion.getConexion();

		try {
			mi_producto = new Productos();

			Statement secciones = acceso_BBDD.createStatement();
			Statement paises = acceso_BBDD.createStatement();

			rs = secciones.executeQuery("SELECT DISTINCT SECCIÓN FROM productos");
			rs_2 = paises.executeQuery("SELECT DISTINCT PAÍS_DE_ORIGEN FROM productos");

			mi_producto.setSeccion(rs.getString(1));
			mi_producto.setPais_origen(rs_2.getString(1));

			rs.close();
			rs_2.close();
			
			acceso_BBDD.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return mi_producto.getSeccion();
	}

	// MEJORADO
//	public ResultSet ejecuta_consultas() {
//		Connection accessoBBDD = mi_conexion.getConexion();
//		try {
//			Statement secciones = accessoBBDD.createStatement();
//			return rs = secciones.executeQuery("SELECT DISTINCTROW SECCIÓN FROM PRODUCTOS");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return null;
//	}
}
