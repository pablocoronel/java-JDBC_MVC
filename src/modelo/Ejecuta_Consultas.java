package modelo;

public class Ejecuta_Consultas {
	private String pruebas = "";

	public String filtra_BBDD(String seccion, String pais) {
		if (!seccion.equals("Todos") && pais.equals("Todos")) {
			pruebas = "Elegiste una seccion";
		} else if (seccion.equals("Todos") && !pais.equals("Todos")) {
			pruebas = "Elegiste un pais";
		} else {
			pruebas = "Ambos";
		}

		return pruebas;
	}
}
