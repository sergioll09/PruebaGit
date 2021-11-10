package Ejercicio_3;

import java.util.Scanner;

public class Ejemplo_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero entero: ");
		int numero = sc.nextInt();
		int contador = 0;
		int sumatorio = 1;
		int aleatoriosDos = 1;
		while (numero > contador) {
			int aleatorios = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
			 aleatoriosDos = aleatorios;
			while (aleatorios > 1) {
				sumatorio = (aleatorios + sumatorio);
				aleatorios--;
			}
			System.out.println("El sumatorio de " + aleatoriosDos + ": " + sumatorio);
			contador++;
		}
	}
}