package Ejercicio1;

public class Coche extends Vehiculo {
	private int combustible;

	public Coche(int ruedas, int velocidad, int combustible) {
		super(ruedas, velocidad);
		this.combustible = combustible;
	}

	public Coche() {
		this(0, 0, 0);
	}

	public void repostar(int mas) {
		if (this.combustible + mas < 60) {
			this.combustible += mas;
		}
	}

	public void consumir(int menos) {
		if (this.combustible + menos >= 0) {
			this.combustible += menos;
		}
	}

	public int getCombustible() {
		return getCombustible();
	}

}
