package Ejercicio2;

public class Test {
	public static void main(String[] args) {
		EmpleadoDistribucion empleadoDistri = new EmpleadoDistribucion("Laura", 98765432, 30, "Mañana");
		EmpleadoProduccion empleadoProduc = new EmpleadoProduccion("Manuel", 12345678, 25, "Madrid");

		System.out.println("Empleado de Distribución");
		System.out.println(empleadoDistri.nombre);
		System.out.println(empleadoDistri.DNI);
		System.out.println(empleadoDistri.diasVacaciones);
		System.out.println(empleadoDistri.turno);
		System.out.println("Empleado de Producción");
		System.out.println(empleadoProduc.nombre);
		System.out.println(empleadoProduc.DNI);
		System.out.println(empleadoProduc.diasVacaciones);
		System.out.println(empleadoProduc.zona);
	}
}
