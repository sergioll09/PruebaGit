package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero entero: ");
		int numero = sc.nextInt();
		int maximo = 0;
		for (int contador = 1; contador <= numero; contador++) {
			int aleatorio = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
			System.out.println(aleatorio);
			if (aleatorio > maximo) {
				maximo = aleatorio;

			}
		}
		System.out.println("El numero Maximo es :" + maximo);
	}
}
