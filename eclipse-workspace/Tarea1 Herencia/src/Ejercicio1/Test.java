package Ejercicio1;

public class Test {
	public static void main(String[] args) {
		Coche damcar = new Coche(0, 4, 60);
		damcar.acelerar(100);
		System.out.println(damcar.getVelocidad() + "km/h");
		damcar.consumir(20);
		System.out.println(damcar.getCombustible() + "litros");
		damcar.frenar(60);
		System.out.println(damcar.getVelocidad() + "frenar");
		damcar.acelerar(90);
		System.out.println(damcar.getVelocidad() + "km/h");
		damcar.consumir(10);
		System.out.println(damcar.getCombustible() + "litros");
		damcar.frenar(0);
		System.out.println(damcar.getVelocidad() + "km/h");
		damcar.repostar(20);
		System.out.println(damcar.getCombustible() + "litros");
		System.out.println(damcar.getCombustible() + "cuantos litro quedan");
	}
}
