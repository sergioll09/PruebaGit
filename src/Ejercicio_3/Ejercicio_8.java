package Ejercicio_3;

public class Ejercicio_8 {

	public static void main(String[] args) {
		int contador = 0;
		int numero = 0;
		int doce = 0;
		while (contador <= 30) {
			numero = (int) (Math.random() * 100) + 1;
			if (numero != 99) {
				contador++;
			} else {
				contador = 31;
			}
			if (numero == 12) {
				doce++;
			}
		}
		System.out.println("El doce ha salido " + doce + " veces");
	}

}
