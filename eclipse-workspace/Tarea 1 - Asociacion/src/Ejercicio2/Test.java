package Ejercicio2;
//@Autor Javier Cejuela realizado con Adrián Sánchez
public class Test {
	public static void main(String[] args) {
		Estudiante miEstudiante = new Estudiante("Javier", "Cejuela", "06/06/2003", 0.0);
		Asignatura miAsignatura = new Asignatura("PROG", 7, "1º");
		Asignatura miAsignatura2 = new Asignatura("SSII", 5, "1º");
		Asignatura miAsignatura3 = new Asignatura("BBDD", 9, "1º");
		miEstudiante.matricularEnAsignatura(miAsignatura);
		miEstudiante.matricularEnAsignatura(miAsignatura2);
		miEstudiante.matricularEnAsignatura(miAsignatura3);
		miEstudiante.calcularMedia();
	}
}