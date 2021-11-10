package Entornos_de_desarrollo;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;

		System.out.println("Introduzca un número:");

		if (sc.hasNextInt()) {
			numero = sc.nextInt();

			double contador = 1;
			double suma = 0;
			while (contador <= numero) {
				suma = (1 / contador) + suma;
				contador++;
			}
			System.out.println("La suma de la serie es " + suma);
		} else {
			System.out.println("Error. Introduce un número entero");
		}
	}
}
