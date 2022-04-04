package Ejercicio2;

public class EmpleadoDistribucion extends Asalariado {
	protected String turno;

	public EmpleadoDistribucion(String nombre, long dNI, int diasVacaciones, String turno) {
		super(nombre, dNI, diasVacaciones);
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

}
