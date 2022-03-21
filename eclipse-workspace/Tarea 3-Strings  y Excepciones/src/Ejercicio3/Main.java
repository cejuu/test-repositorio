//@Adrián Sánchez de Santos y Javier Cejuela García

package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca la cadena de caracteres: ");
        int num = 0;
        int suma = 0;
        String cadena = in.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.toCharArray()[i];
            if (Character.isDigit(c)) {
                num = Character.getNumericValue(c);
                suma = suma + num;
            }
        }
        if (suma < 20) {
            System.out.println("La suma de los numeros es: " + suma);
        }else {
            RuntimeException miError = new RuntimeException ("Error fuera de rango, la suma es" + suma);
            throw miError;
        }
    }
}
