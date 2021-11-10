package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero entero: ");
		int numero = sc.nextInt();

		System.out.println("Escribe otro numero entero: ");
		int fin = sc.nextInt();
		if (numero >= fin) {
			int contador = 2;
			while (contador < fin) {
				if (numero % contador == 0) {
					System.out.println(contador);

				}
				contador++;
			}
		} else
			System.out.println("Entrada incorrecta.");

	}

}
