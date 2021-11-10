package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero de varios digitos: ");
		int numero = sc.nextInt();
		int numerofinal = 0;
		int resto = 0;
		while (numero > 1) {
			resto = numero % 10;
			numero = (numero - resto) / 10;
			numerofinal = (numerofinal + resto);
		}
		System.out.println(numerofinal);
	}
}
