package controlador;

import java.awt.event.*;

import modelo.*;
import vista.*;

public class Controlador_Carga_Secciones extends WindowAdapter {

	Carga_Secciones obj = new Carga_Secciones();
	private Marco_Aplicacion_MVC el_marco;

	public Controlador_Carga_Secciones(Marco_Aplicacion_MVC el_marco) {
		this.el_marco = el_marco;
	}

	public void windowOpened(WindowEvent e) {
		this.obj.ejecuta_consultas();

		try {
			while (obj.rs.next()) {
				this.el_marco.secciones.addItem(obj.rs.getString(1));
			}
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}

}
