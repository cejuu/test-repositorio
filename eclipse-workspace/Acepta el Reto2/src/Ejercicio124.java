//@Autor Javier Cejuela García//



import java.util.Scanner;

public class Ejercicio124 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:  ");
		String[][] s1 = new String[1][2];
		String[][] s2 = new String[1][2];
		int[] n1;
		int[] n2;
		int respuesta = 0;
		int acarreo = 0;
		
		while (true) {
			for (int i = 0; i >= 1; i++) {
				s1[i][i] = sc.toString();
			}

				if (s1.equals("") && s2.equals("")) {
			}
			n1 = new int [Math.max(s1.length, s2.length)];
			n2 = new int [Math.max(s1.length, s2.length)];
			
			for (int i = 0; i < n1.length; i++) {
				n1[i] = Integer.parseInt(s1.length + "");
			}
			for (int i = 0; i < n2.length; i++) {
				n2[i] = Integer.parseInt(s2.length + "");
			}
			for (int i = 0; i < n2.length; i++) {
				
			}
			for (int i = 0; i < n1.length; i++) {
                if ((n1[i] + n2[i] + acarreo) >= 10) {
                    respuesta++;
                    acarreo = (n1[i]+ n2[i] + acarreo) / 10;
                }
                else acarreo = 0;
            }
            System.out.println( respuesta );
		}
	}
}