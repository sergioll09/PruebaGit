package Ejercicio_3;

import java.util.Scanner;

public class Ejemplo_17_Sergio_Labra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero entero: ");
		int numero = sc.nextInt();
		int contador = 1;
		int inpar = 1;
		int par = 1;
		int multiplicar = 1;
		int doce = 1;
		while (numero > contador) {
			int aleatorios = (int) Math.floor(Math.random() * (20 - 5 + 1) + 5);
			System.out.println(aleatorios);
			if ((aleatorios % 2) == 0) {
				par++;
			} else {
				inpar = inpar + aleatorios;
			
			if (aleatorios == 12) {
			doce = multiplicar * 12;
			
			if (multiplicar == 2) {
				par++;
			
			contador++;
			}
			}
			}
		}
		System.out.println("Hay " + inpar + " numero de pares");
		System.out.println("La suma de los inpares es: " + doce);
		System.out.println("Los que acaben en dos multiplicados " + par);
	}
}