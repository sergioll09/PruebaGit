package Ejercicio_3;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args){
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Escribe una letra:");
			char letra = sc.next().charAt(0);
					
			
			System.out.println("Nombre: "+ letra);
			
			if (letra == 'y' || letra == 'Y') {
				System.out.println("Afirmativo");
			}else if  (letra == 'n' || letra == 'N') {
				System.out.println("Negativo");
			}else {
				System.out.println("Entrada incorrecta");
			}
		}
}