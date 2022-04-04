package Ejercicio2;

public class Asalariado {
	protected String nombre;
	protected long DNI;
	protected int diasVacaciones;

	public Asalariado(String nombre, long dNI, int diasVacaciones) {
		this.nombre = nombre;
		DNI = dNI;
		this.diasVacaciones = diasVacaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDNI() {
		return DNI;
	}

	public void setDNI(long dNI) {
		DNI = dNI;
	}

	public int getDiasVacaciones() {
		return diasVacaciones;
	}

	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}

}
