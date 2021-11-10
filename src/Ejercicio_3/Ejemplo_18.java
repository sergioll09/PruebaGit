package Ejercicio_3;

public class Ejemplo_18 {

	public static void main(String[] args) {

		int inpar = 1;
		int contador = 1;
		int multiplicar = 1;
		int multiplos = 1;
		int par = 1;
		int aleatorios = 1;
		int siete = 1;
		while (contador == 100) {
			aleatorios = (int) Math.floor(Math.random() * (100 - 0 + 1) + 0);
			if (aleatorios == 0) {
				if ((aleatorios % 2) == 0) {
					par = multiplicar * aleatorios;
				} else {
					inpar = (inpar + aleatorios);
				}
				if (((aleatorios % 3) == 0) && ((aleatorios % 6) == 0)) {
					multiplos++;
				}
				if ((aleatorios % 10) ==7) {
					siete++;
				}
					
			}
			contador++;
		}
		System.out.println(par);
		System.out.println(inpar);
		System.out.println(multiplos);
		System.out.println(siete);
	}

}
