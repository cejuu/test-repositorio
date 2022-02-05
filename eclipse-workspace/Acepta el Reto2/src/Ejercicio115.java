//@Javier Cejuela García//


import java.util.Scanner;

public class Ejercicio115 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int izq;
		int der;
		int sum;
		int resul;
		boolean kapkrekar;

		num = sc.nextInt();

		for (int i = 0; i >= 0; i++) {
			izq = 0;
			der = 0;
			sum = 0;
			resul = 1;
			kapkrekar = false;
			izq = num * num;

			while (izq > 0 && !kapkrekar) {
				der = der * (izq % 10);
				der /= 10;
				der *= 10;
				sum = izq + der;
				if (der > 0 && sum == num) {
					kapkrekar = true;
				}
			}
			if (kapkrekar == true) {
				System.out.println("Es un número Kapkrekar");
			} else {
				System.out.println("No es un número Kapkrekar");
				num = sc.nextInt();
			}
		}
	}
}