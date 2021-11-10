package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 1;
		int numeroActual = 1;
		do {
			System.out.println("**********************");
			System.out.println("Numero actual = " + numeroActual);
			System.out.println("**********************");
			System.out.println("1.-Solicitar número");
			System.out.println("2.-Factorial");
			System.out.println("3.-Primo");
			System.out.println("4.-Contar cifras");
			System.out.println("5.-Capicúa");
			System.out.println("6.-Salir");
			numero = sc.nextInt();
			if (numero == 1) {

				System.out.println("Escribe el número actual: ");
				numeroActual = sc.nextInt();
			}

			if (numero == 2) {
				int factorial = 1;
				for (int contador = 2; contador <= numeroActual; contador++) {
					factorial = (factorial * contador);
				}
				System.out.println(factorial);
			}

			if (numero == 3) {
				boolean primo = true;
				int contador = 2;
				while (contador < numeroActual) {
					if ((numeroActual % contador) == 0) {
						primo = false;
					}
					contador++;
				}

				if (primo == true) {
					System.out.println("El numero es Primo");
				} else {
					System.out.println("El numero no es Primo");
				}
			}

			if (numero == 4) {
				int cifras = 1;
				int cifra = 0;
				cifras = numeroActual;
				while (cifras != 0) {
					cifras = (cifras / 10);
					cifra++;
				}
				System.out.println("El número tiene " + cifra + " cifras");
			}

			if (numero == 5) {
				String numeroCapicua = String.valueOf(numeroActual);
				if (numeroCapicua.charAt(0) == (numeroCapicua.charAt(numeroCapicua.length()-1)))
					System.out.println("Es Capicua");
			}

		} while (numero < 6);
	}
}