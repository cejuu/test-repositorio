package Taller_Agenda;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Agenda {
	static Scanner sc = new Scanner(System.in);
	static TreeMap<String, Contacto> miAgenda = new TreeMap<String, Contacto>();

	public static void main(String[] args) {
		short opcion = -1;

		// Menu
		do {

			System.out.println("1. Nuevo Piloto");
			System.out.println("2. Buscar Pilotos");
			System.out.println("3. Mostrar Escudería");
			System.out.println("4. Eliminar Piloto");
			System.out.println("0. Para salir del programa.");
			System.out.print("Pulsa la opción que quieras realizar: ");
			opcion = sc.nextShort();

			switch (opcion) {
			case 1:
				System.out.println("1. Cargar elementos en el conjunto a puntuar");
				nuevoPiloto();
				break;
			case 2:
				System.out.println("2. Buscar");
				buscarPilotos();
				break;
			case 3:
				System.out.println("3. Mostrar Escudería");
				mostrarPilotos();
				break;
			case 4:
				System.out.println("4. Eliminar Piloto");
				eliminarPiloto();
				break;
			case 0:
				System.out.println("Muchas gracias por usar la app de buscar pilotos de F1.");
				break;
			default:
				System.out.println("Opción incorrecta, vuelve a intentarlo, no está ese piloto.");
				break;
			}
		} while (opcion != 0);

	}

	private static void nuevoPiloto() {
		Contacto nuevo = new Contacto();
		System.out.println("Escribe el nombre: ");
		nuevo.setNombre(sc.next());
		System.out.println("Escribe el teléfono de contacto: ");
		nuevo.setTelefono(sc.next());
		System.out.println("Escribe el email: ");
		nuevo.setEmail(sc.next());
		miAgenda.put(nuevo.getNombre(), nuevo);
	}

	private static void mostrarPilotos() {
		for (Entry<String, Contacto> entry : miAgenda.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	private static void buscarPilotos() {
		System.out.print("Inserte el nombre del piloto: ");
		String buscador = sc.next();

		if (miAgenda.containsKey(buscador)) {
			System.out.println(miAgenda.get(buscador));
		} else {
			System.err.println("Este piloto no existe.");
		}
	}

	private static void eliminarPiloto() {
		System.out.print("Inserte el nombre del piloto que quiere eliminar: ");
		String borrador = sc.next();
		if (miAgenda.containsKey(borrador)) {
			miAgenda.remove(borrador);
		}
	}
}
