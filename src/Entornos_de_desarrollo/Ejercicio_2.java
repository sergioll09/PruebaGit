package Entornos_de_desarrollo;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int walter = 0;
		int white = 0;

		System.out.println("Introduzca el primer n�mero >");
		if (sc.hasNextInt()) {
			walter = sc.nextInt();
			System.out.println("Introduzca el segundo n�mero >");
			if (sc.hasNextInt()) {
				white = sc.nextInt();
				if (walter >= white) {
					int meth = walter;
					int jessy = 2;
					while (meth <= white) {
						System.out.print(white + "\t");
						if (walter == 4) {
							jessy += 2;
						}
						if ((jessy % 2) != 0) {
							System.out.println();
						}
						jessy--;
						meth++;
					}
				} else {
					System.out.println("El segundo n�mero debe ser mayor que el primero");
				}
			} else {
				System.out.println("Error. Debes introducir un n�mero entero");
			}
		} else {
			System.out.println("Error. Debes introducir un n�mero entero");
		}
	}
}
