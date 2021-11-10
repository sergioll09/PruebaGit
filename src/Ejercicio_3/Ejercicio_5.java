package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número:");
		int numero1 = sc.nextInt();

		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador + "*" + numero1 + "=" + (numero1 * contador));
			System.out.println(numero1);

		}

	}

}
