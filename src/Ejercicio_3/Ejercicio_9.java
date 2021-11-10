package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero entero: ");
		int numero = sc.nextInt();
		int contador = 1;
		float resultado = 0;
		while (contador <= numero) {
			resultado = ((1 / (float) contador) + resultado);
			contador++;
			System.out.println("El resultado intermedio es: " + resultado);
		}
		System.out.println("El resultado es: " + resultado);

	}

}
