import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter the number of integers that will be inserted: ");
		int size = scanner.nextInt();
		System.out.println("Enter some integers to insert to the ArrayList: ");
		while (size-- > 0) {
			// To add an element to the ArrayList
			al.add(scanner.nextInt());
		}
		int top = Integer.MIN_VALUE;
		for (int elemento : al) {
            if (elemento >=top) {
				top = elemento;
			}
        }
		System.out.println("The largest value: " + top);
	}
}
