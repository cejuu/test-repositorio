package Ejercicio3;
//@Autor Javier Cejuela realizado con Adrián Sánchez
public class Pelicula {
	private String titulo;
	private String director;
	private int duracion;
	private Actor[] actores = new Actor[15];
	private int numeroActores;

	public Pelicula(String titulo, String director, int duracion) {
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDirector() {
		return director;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void mostrarPelicula() {
		System.out.println(this.getTitulo());
		System.out.println(this.getDirector());
		System.out.println(this.getDuracion());
	}
}
