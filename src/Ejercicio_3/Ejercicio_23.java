package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escibe un n�mero: ");
		int numero = sc.nextInt();
		int contador = 1;
		while (contador <= numero) {
			System.out.println("La tabla del :" + numero);
			System.out.println(numero + "* 1 = " + (numero * 1));
			System.out.println(numero + "* 2 = " + (numero * 2));
			System.out.println(numero + "* 3 = " + (numero * 3));
			System.out.println(numero + "* 4 = " + (numero * 4));
			System.out.println(numero + "* 5 = " + (numero * 5));
			System.out.println(numero + "* 6 = " + (numero * 6));
			System.out.println(numero + "* 7 = " + (numero * 7));
			System.out.println(numero + "* 8 = " + (numero * 8));
			System.out.println(numero + "* 9 = " + (numero * 9));
			System.out.println(numero + "* 10 = " + (numero * 10));
			numero--;
		}
	}
}
