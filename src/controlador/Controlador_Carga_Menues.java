package controlador;

import java.awt.event.*;
import java.sql.*;

import modelo.*;
import vista.*;

public class Controlador_Carga_Menues extends WindowAdapter {

	Carga_Menues obj = new Carga_Menues();
	private Marco_Aplicacion_MVC el_marco;

	public Controlador_Carga_Menues(Marco_Aplicacion_MVC el_marco) {
		this.el_marco = el_marco;
	}

	// PROFE
	public void windowOpened(WindowEvent e) {
		this.obj.ejecuta_consultas();

		try {
			// secciones
			while (obj.rs.next()) {
				this.el_marco.secciones.addItem(obj.rs.getString(1));
			}
			
			// paises
			while (obj.rs_2.next()) {
				this.el_marco.paises.addItem(obj.rs_2.getString(1));
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	// MEJORADO
//	public void windowOpened(WindowEvent e) {
//		ResultSet res = null;
//
//		try {
//			res = obj.ejecuta_consultas();
//
//			while (res.next()) {
//				el_marco.secciones.addItem(res.getString(1));
//			}
//
//			res.close();
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}
//	}
}
