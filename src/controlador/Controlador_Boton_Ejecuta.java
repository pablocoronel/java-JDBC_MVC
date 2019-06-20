package controlador;

import java.awt.event.*;
import java.sql.*;

import modelo.*;
import vista.*;

// para eventos es ActionListener
public class Controlador_Boton_Ejecuta implements ActionListener {
	private Marco_Aplicacion_MVC el_marco;
	Ejecuta_Consultas obj = new Ejecuta_Consultas();
	private ResultSet resultado_consulta;

	/*
	 * constructor
	 */
	public Controlador_Boton_Ejecuta(Marco_Aplicacion_MVC el_marco) {
		this.el_marco = el_marco;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String seleccion_seccion = (String) this.el_marco.secciones.getSelectedItem();
		String seleccion_pais = (String) this.el_marco.paises.getSelectedItem();

		// obtiene el ResultSet retornado en Ejecuta_Consultas.java
		resultado_consulta = obj.filtra_BBDD(seleccion_seccion, seleccion_pais);

		try {
			// limpia la pantalla de resultados
			el_marco.resultado.setText("");

			while (resultado_consulta.next()) {
				// se agrega a la pantalla de resultados cada fila del ResultSet (una columna)
				el_marco.resultado.append(resultado_consulta.getString(1));
				el_marco.resultado.append(", ");

				el_marco.resultado.append(resultado_consulta.getString(2));
				el_marco.resultado.append(", ");

				el_marco.resultado.append(resultado_consulta.getString(3));
				el_marco.resultado.append(", ");

				el_marco.resultado.append(resultado_consulta.getString(4));
				el_marco.resultado.append("\n");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
