package Ejercicio_3;

public class Ejercicio_19 {
	public static void main(String[] args) {
		int aleatorios = 1;
		while (aleatorios != 5) {
			aleatorios = (int) Math.floor(Math.random() * (30 - 1 + 1) + 1);
			System.out.println(aleatorios);
		}
	}
}