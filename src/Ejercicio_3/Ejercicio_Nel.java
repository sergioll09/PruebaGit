package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_Nel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe un n�mero entero: ");
		int primerNumero = 0;
		if (sc.hasNextInt()) {
			primerNumero = sc.nextInt();

			System.out.print("Escribe otro n�mero entero: ");
			int segundoNumero = 0;
			if (sc.hasNextInt()) {
				segundoNumero = sc.nextInt();

				System.out.print("Suma,resta, multiplicaci�n o divisi�n: ");
				char letra = sc.next().charAt(0);

				if ((letra == 's') || (letra == 'S')) {
					System.out.println("Suma = " + (primerNumero + segundoNumero));
				} else if ((letra == 'r') || (letra == 'R')) {
					System.out.println("Resta = " + (primerNumero - segundoNumero));
				} else if ((letra == 'm') || (letra == 'M')) {
					System.out.println("Multiplicaci�n = " + (primerNumero * segundoNumero));
				} else if ((letra == 'd') || (letra == 'D')) {
					if (segundoNumero != 0) {
						System.out.println("Divisi�n = " + ((float) primerNumero / segundoNumero));
					} else {
						System.out.print("No se puede dividir entre 0, subnormal");
					}
				} else {
					System.out.println("Operaci�n no encontrada");
				}

			} else {
				System.out.println("Entrada incorrecta");
			}
		} else {
			System.out.println("Entrada incorrecta");
		}

	}
}