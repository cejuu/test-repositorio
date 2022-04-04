package Ejercicio2;

public class EmpleadoProduccion extends Asalariado {
	protected String zona;

	public EmpleadoProduccion(String nombre, long dNI, int diasVacaciones, String zona) {
		super(nombre, dNI, diasVacaciones);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

}
