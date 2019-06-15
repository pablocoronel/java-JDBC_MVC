package controlador;

import java.awt.event.*;
import modelo.*;
import vista.*;

// para eventos es ActionListener
public class Controlador_Boton_Ejecuta implements ActionListener {
	private Marco_Aplicacion_MVC el_marco;
	Ejecuta_Consultas obj = new Ejecuta_Consultas();

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

		el_marco.resultado.append(obj.filtra_BBDD(seleccion_seccion, seleccion_pais));
		el_marco.resultado.append("\n");
	}

}
