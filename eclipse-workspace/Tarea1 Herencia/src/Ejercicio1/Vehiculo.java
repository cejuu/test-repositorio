package Ejercicio1;

public class Vehiculo {
	private int Ruedas;
	private int Velocidad;

	public Vehiculo(int ruedas, int velocidad) {
		this.Ruedas = ruedas;
		this.Velocidad = velocidad;
	}

	public Vehiculo() {
		this(0, 0);
	}

	public void acelerar(int mas) {
		if (this.Velocidad + mas < 120) {
			this.Velocidad += mas;
		}
	}

	public void frenar(int menos) {
		if (this.Velocidad - menos >= 0) {
			this.Velocidad -= menos;
		}
	}

	public int getRuedas() {
		return getRuedas();
	}

	public int getVelocidad() {
		return getVelocidad();
	}
}
