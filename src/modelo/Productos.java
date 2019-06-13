package modelo;

public class Productos {

	private String nombre_articulo;
	private String seccion;
	private String precio;
	private String pais_origen;

	public Productos() {
		this.nombre_articulo = "";
		this.seccion = "";
		this.precio = "";
		this.pais_origen = "";
	}

	public String getNombre_articulo() {
		return nombre_articulo;
	}

	public void setNombre_articulo(String nombre_articulo) {
		this.nombre_articulo = nombre_articulo;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getPais_origen() {
		return pais_origen;
	}

	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}
}
