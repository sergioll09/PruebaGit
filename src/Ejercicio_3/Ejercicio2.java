package Ejercicio_3;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un n�mero:");
		int numero1 = sc.nextInt();

		System.out.println("Escribe otro n�mero:");
		int numero2 = sc.nextInt();

		System.out.println("Escribe una letra:");
		char letra = sc.next().charAt(0);

		System.out.println("Nombre: " + letra);

		if (letra == 's' || letra == 'S') {
			System.out.println("La suma es: " + (numero1 + numero2));
		} else if (letra == 'r' || letra == 'R') {
			System.out.println("La resta es: " + (numero1 - numero2));
		} else if (letra == 'm' || letra == 'M') {
			System.out.println("La multiplicaci�n es: " + (numero1 * numero2));
		} else if (letra == 'd' || letra == 'D') {
			System.out.println("La divisi�n es: " + (numero1 / numero2));
		}
	}
}