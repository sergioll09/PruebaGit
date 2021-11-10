package Ejercicio_3;

public class Ejercicio_25 {

	public static void main(String[] args) {
		int par = 0;
		int inpar = 0;
		for (int imp = 1; imp <= 20; imp++) {
			int aleatorios = (int) Math.floor(Math.random() * (50 - 1 + 1) + 1);
			if (aleatorios % 2 == 0) {
				par++;
			} else {
				inpar++;
			}
		}System.out.println("Hay " + par + " pares");
		System.out.println("Hay " + inpar + " inpares");
	}
}
