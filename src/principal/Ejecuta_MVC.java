package principal;

import javax.swing.JFrame;

import vista.Marco_Aplicacion_MVC;

public class Ejecuta_MVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_Aplicacion_MVC mi_marco = new Marco_Aplicacion_MVC();

		mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mi_marco.setVisible(true);
	}

}
