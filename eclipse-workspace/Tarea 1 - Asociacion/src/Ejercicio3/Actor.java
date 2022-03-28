package Ejercicio3;
//@Autor Javier Cejuela realizado con Adrián Sánchez
public class Actor {
	private String nombre;
	private int nacimiento;

	public Actor(String nombre, int nacimiento) {
		this.nombre = nombre;
		this.nacimiento = nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNacimiento() {
		return nacimiento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNacimiento(int nacimiento) {
		this.nacimiento = nacimiento;
	}

	public void mostrarActor() {
		System.out.println(this.getNombre());
		System.out.println(this.getNacimiento());
	}
}