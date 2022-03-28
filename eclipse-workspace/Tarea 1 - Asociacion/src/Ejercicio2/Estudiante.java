package Ejercicio2;
//@Autor Javier Cejuela realizado con Adrián Sánchez
import java.util.ArrayList;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private double notaMedia;
	private ArrayList<Asignatura> todasAsignaturas;

	public Estudiante(String nombre, String apellido, String fechaNacimiento, double notaMedia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.notaMedia = notaMedia;
		this.todasAsignaturas = new ArrayList<Asignatura>();
	}

	public void matricularEnAsignatura(Asignatura string) {
		todasAsignaturas.add(string);
	}

	public void mostrarDatos() {
		System.out.println(nombre);
		System.out.println(apellido);
		System.out.println(fechaNacimiento);
		System.out.println(notaMedia);
	}

	public void calcularMedia() {
		int suma = 0;
		double media;
		for (int i = 0; i < todasAsignaturas.size(); i++) {
			suma = suma + todasAsignaturas.get(i).getNotaAlumno();
		}
		notaMedia = suma / todasAsignaturas.size();
		System.out.println("La media es:" + notaMedia);
	}
}