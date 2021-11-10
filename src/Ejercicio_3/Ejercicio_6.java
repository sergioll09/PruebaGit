package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe un número:");
		int numero1 = 0;
		if (sc.hasNextInt()) {
			numero1 = sc.nextInt();
		}
		else {
			System.out.println("Numero incorrecto");
		}
		
		System.out.println("Escribe otro número:");
		int numero2 = 0;
		if (sc.hasNextInt()) {
			numero2 = sc.nextInt();
		}
		else {
			System.out.println("Numero incorrecto");
		}
			if (numero2 >= numero1) {
				int contador = numero1;
				int numeroInteraciones = 1;
				while (contador <= numero2) {
					System.out.print(contador + "\t");
					
					if (numeroInteraciones % 3 == 0);
					System.out.println();
					
					contador++;
				}
				
			}else {
				System.out.println("Orden incorrecto");
			}
		
		
		//while ((numero1 >=0) && (numero2 >= 0)){
		//	while (numero2 > numero1) {
		//		System.out.println(numero2);
			}
}
