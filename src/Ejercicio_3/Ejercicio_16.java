package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero de varios digitos: ");
		int numero = sc.nextInt();
		boolean primo = true;
		int contador = 2;
		while (contador < numero) {
			if ((numero % contador) == 0) {
				primo = false;
			}
			contador++;
		}
		System.out.println(primo);
	}
}