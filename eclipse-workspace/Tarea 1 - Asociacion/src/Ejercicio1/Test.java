package Ejercicio1;
//@Autor Javier Cejuela realizado con Adri�n S�nchez
public class Test {
    public static void main(String[] args) {
        Salon miSalon = new Salon();
        Cocina miCocina = new Cocina();
        Casa miCasa = new Casa(30.4, "Vva de la Ca�ada", miSalon, miCocina);
        System.out.println(miCasa.getSuperficie() + " " + miCasa.getDireccion() + " " + miCasa.getSalonCasa() + " " + miCasa.getCocina());
    }
}
