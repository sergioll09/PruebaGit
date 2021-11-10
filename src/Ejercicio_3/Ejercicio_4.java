package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe un número:");
		int numero1 = sc.nextInt();
		
		System.out.println("Escribe otro número:");
		int numero2 = sc.nextInt();
		
		if (numero2 >= numero1) {
			
			int contador = numero1;
			while (contador <= numero2) {
				System.out.println(contador);
				contador++;
			}
		}else { System.out.println("No es posible");
		}
			
		
	}
	
	
}
