package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escibe un número: ");
		int numero = sc.nextInt();
		int linea = 1;
		
		while (numero >= linea) {
			int repe = 1;
			int contador = 0;
			while (linea != contador) {
				System.out.print(repe);
				contador++;
				repe++;
			}
			linea++;
			System.out.println();
		}

	}

}