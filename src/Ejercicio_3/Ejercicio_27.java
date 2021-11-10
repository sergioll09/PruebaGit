package Ejercicio_3;

public class Ejercicio_27 {
	public static void main(String[] args) {

		float maximo = 0;
		float media = 0;
		float minimo = 10;
		int notaMax = 0;
		int notaMin = 0;
		for (int contador = 1; contador <= 30; contador++) {
			float aleatorio = (float) Math.floor(Math.random() * (10 - 1 + 1) + 1);
			System.out.println(aleatorio);
			media = (aleatorio + media);
			if (aleatorio > maximo) {
				maximo = aleatorio;
			} else if (aleatorio < minimo) {
				minimo = aleatorio;
			} else if (aleatorio == 1) {
				notaMin++;
			} else if (aleatorio == 10) {
				notaMax++;
			}
		}
		System.out.println("La media de las notas es: " + (media / 30));
		System.out.println("La nota más alta es: " + maximo);
		System.out.println("La nota más baja es: " + minimo);
		System.out.println("La nota más alta a salido " + notaMax + " veces");
		System.out.println("La nota más baja a salido " + notaMin + " veces");
	}
}
