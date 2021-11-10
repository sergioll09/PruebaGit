package Ejercicio_2;
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu nombre:");
		String name = sc.nextLine();

		System.out.println("Introduce tu género:");
		char gender = sc.next().charAt(0);

		System.out.println("Introduce tu edad:");
		int age = 0;
		if(sc.hasNextInt()) {
			age = sc.nextInt();
		} else {
			System.out.println("Entrada incorrecta");
		}
			
		System.out.println("Nombre: " + name);
		System.out.println("Género: " + gender);
		System.out.println("Edad: " + age);

	}
}