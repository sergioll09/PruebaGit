package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero entero: ");
		int i,numero = sc.nextInt();
		i = 0;
		while (i != numero) {
			numero = numero + i;
			i = i + 1;
			System.out.println("Escribe un numero entero: ");
		}
		System.out.println(numero);
	}
}