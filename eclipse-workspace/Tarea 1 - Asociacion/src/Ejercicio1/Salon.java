package Ejercicio1;
//@Autor Javier Cejuela realizado con Adrián Sánchez
public class Salon {
	private int numeroTelevisores;
	private String tipoSalon;

	public Salon() {
		this.numeroTelevisores = 0;
		this.tipoSalon = "desconocido";
	}

	public Salon(int numeroTelevisores, String tipoSalon) {
		this.numeroTelevisores = numeroTelevisores;
		this.tipoSalon = tipoSalon;
	}
}
