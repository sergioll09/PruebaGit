package Ejemplos_metodos;

public class Metodos {

	public static void main(String[] args) {

		int a = 2;
		int b = 10;

		// System.out.println(suma(a, b));

		int c = 6;
		double d = 4;

		// System.out.println(resta(c, d));
		// System.out.println(resta(b, a) + resta(a, b));
		//System.out.println(potencia(a, b));
		System.out.println(factorial(2));
	}

	public static int suma(int a, int b) {
		return a + b;
	}

	public static double resta(int a, double b) {
		return a - b;
	}

	public static double multiplica(int a, double b) {
		return (a * b);
	}

	public static double dividir(int a, double b) {
		return (a / b);
	}

	public static double potencia(int a, int b) {
		int resultado = 1;
		for (int i = 0; i < b; i++)
			resultado = (resultado * a);
		return resultado;
	}
	public static int factorial(int a) {
		int resultado = 1;
		for (int i = 0; i < a; i++) {
			resultado = (resultado + a);
			return resultado;
		}
		return resultado;
	}
}
