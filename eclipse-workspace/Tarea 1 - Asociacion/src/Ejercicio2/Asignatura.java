package Ejercicio2;
//@Autor Javier Cejuela realizado con Adrián Sánchez
public class Asignatura {
	private String denominacion;
	private int notaAlumno;
	private String cursoAlumno;

	public Asignatura(String denominacion, int notaAlumno, String cursoAlumno) {
		this.denominacion = denominacion;
		this.notaAlumno = notaAlumno;
		this.cursoAlumno = cursoAlumno;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public int getNotaAlumno() {
		return notaAlumno;
	}

	public String getCursoAlumno() {
		return cursoAlumno;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public void setNotaAlumno(int notaAlumno) {
		this.notaAlumno = notaAlumno;
	}

	public void setCursoAlumno(String cursoAlumno) {
		this.cursoAlumno = cursoAlumno;
	}
}
