//@Adri?n S?nchez de Santos y Javier Cejuela Garc?a

package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cadena de caracteres: ");
        int num = 0;
        int suma = 0;
        String cadena = sc.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.toCharArray()[i];
            if (Character.isDigit(c)) {
                num = Character.getNumericValue(c);
                suma = suma + num;
            }
        }
        System.out.println("La suma de los numeros es: " + suma);
    }
}
