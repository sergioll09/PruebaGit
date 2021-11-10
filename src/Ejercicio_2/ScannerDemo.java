package Ejercicio_2;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args){
		
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce tu nombre:");
			String name = sc.nextLine();
					
			System.out.println("Introduce tu género:");
			char gender = sc.next().charAt(0);
					
			System.out.println("Introduce tu edad:");
			int age = sc.nextInt();
			
			System.out.println("Nombre: "+ name);
			System.out.println("Género: "+ gender);
			System.out.println("Edad: "+ age);
			
		}
}