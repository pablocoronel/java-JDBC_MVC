package modelo;

import java.sql.*;

public class Ejecuta_Consultas {

	private Conexion mi_conexion;
	private ResultSet rs;

	private PreparedStatement enviaConsultaSeccion;
	private final String consulta_seccion = "SELECT NOMBRE_ARTÍCULO, SECCIÓN, PRECIO, PAÍS_DE_ORIGEN FROM productos WHERE SECCIÓN = ?";

	private PreparedStatement enviaConsultaPais;
	private final String consulta_pais = "SELECT NOMBRE_ARTÍCULO, SECCIÓN, PRECIO, PAÍS_DE_ORIGEN FROM productos WHERE PAÍS_DE_ORIGEN = ?";

	private PreparedStatement enviaConsultaTodos;
	private final String consulta_todos = "SELECT NOMBRE_ARTÍCULO, SECCIÓN, PRECIO, PAÍS_DE_ORIGEN FROM productos WHERE SECCIÓN = ? AND PAÍS_DE_ORIGEN = ?";

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
				enviaConsultaSeccion.setString(1, "CERÁMICA");

				rs = enviaConsultaSeccion.executeQuery();
			} else if (seccion.equals("Todos") && !pais.equals("Todos")) {

				enviaConsultaPais = conecta.prepareStatement(consulta_pais);
				enviaConsultaPais.setString(1, pais);

				rs = enviaConsultaPais.executeQuery();
			} else {
				enviaConsultaTodos = conecta.prepareStatement(consulta_todos);
				enviaConsultaTodos.setString(1, seccion);
				enviaConsultaTodos.setString(2, pais);

				rs = enviaConsultaTodos.executeQuery();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return rs;
	}
}
