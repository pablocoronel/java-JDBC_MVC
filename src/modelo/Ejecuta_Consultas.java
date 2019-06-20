package modelo;

import java.sql.*;

public class Ejecuta_Consultas {

	private Conexion mi_conexion;
	private ResultSet rs;
	private PreparedStatement enviaConsultaSeccion;
	private final String consulta_seccion = "SELECT NOMBRE_ART�CULO, SECCI�N, PRECIO, PA�S_DE_ORIGEN FROM productos WHERE SECCI�N = ?";

	// constructor
	public Ejecuta_Consultas() {
		this.mi_conexion = new Conexion();
	}

	// hacer la consulta
	public ResultSet filtra_BBDD(String seccion, String pais) {
		Connection conecta = this.mi_conexion.getConexion();
		rs = null;

		try {
			if (!seccion.equals("Todos") && pais.equals("Todos")) {
				enviaConsultaSeccion = conecta.prepareStatement(consulta_seccion);
				enviaConsultaSeccion.setString(1, "CER�MICA");

				rs = enviaConsultaSeccion.executeQuery();
			} else if (seccion.equals("Todos") && !pais.equals("Todos")) {

				enviaConsultaSeccion = conecta.prepareStatement(consulta_seccion);
				enviaConsultaSeccion.setString(1, seccion);

				rs = enviaConsultaSeccion.executeQuery();
			} else {
				enviaConsultaSeccion = conecta.prepareStatement(consulta_seccion);
				enviaConsultaSeccion.setString(1, seccion);

				rs = enviaConsultaSeccion.executeQuery();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return rs;
	}
}
