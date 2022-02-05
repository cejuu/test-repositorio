//@Autor Javier Cejuela García//
package Arrays;

import java.util.Scanner;

public class Ejercicio151 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean ident = true;

		num = sc.nextInt();
		int [][] matriz = new int[num][num];

		for (int i = 0; i != 1; i++) { 
			matriz = new int[num][num];
			ident = false; // Utilizamos el booleano para saber si es 1 que nos diga que es verdadero y si es 0 que sea falso, salvo en la diagonal mayor
		}
		for (int i = 0; i < num; i++) { //Con el bucle for dentro de otro es decir el método burbuja, conseguimos ordenador los números. 
			for (int j = 0; j < num; j++) {
				matriz[i][j] = sc.nextInt();
			}

		}
		for (int k = 0; k < num; k++) {
			for (int l = 0; l < num; l++) {
				if (matriz[k][k] != 1) {
					ident = true;
				}
			}
			num = sc.nextInt();
		}
		if (ident) {
			for (int i = 0; i < num; i++) {
				for (int n = num - 1; n > i; n++) {
					if (matriz[i][i] != 0) {
						ident = false;
					}
				}
			}
		}
		if (ident) {
			System.out.println("Es una matriz identidad");
		} else {
			System.out.println("No es una matriz identidad");
		}
		sc.close();
	}
}