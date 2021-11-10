package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero de varios digitos: ");
		int numero = sc.nextInt();
		int linea = 1;
		while (numero >= linea) {
			int contador = 0;
			while (numero != contador) {
				System.out.print(linea);
				contador++;
			}
			linea++;
			System.out.println();
		}

	}

}
