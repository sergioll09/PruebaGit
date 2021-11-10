package While;

import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un numero entero: ");
		int numero = sc.nextInt();

		while (numero != 0) {
			System.out.println("Escribe otro numero entero: ");
			numero = sc.nextInt();
		}
		System.out.println("Fin del programa");
	}
}