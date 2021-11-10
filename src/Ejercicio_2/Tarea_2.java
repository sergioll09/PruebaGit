package Ejercicio_2;
public class Tarea_2 {

	public static void main(String[] args) {
		char letra = 'd';
		int numero1 = 3;
		int numero2 = 6;
		switch (letra) {
		case 's':
		case 'S':
			System.out.println("Suma= " + (numero1 + numero2));
		case 'r':
		case 'R':
			System.out.println("Resta= " + (numero1 - numero2));
		case 'm':
		case 'M':
			System.out.println("Multiplicación= " + (numero1 * numero2));
		case 'd':
		case 'D':
			System.out.println("Division= " + (numero1 / numero2));
			break;
		}
	}
}