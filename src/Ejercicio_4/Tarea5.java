package Ejercicio_4;

public class Tarea5 {
	private final char ESPACIO = ' ';

	public static void main(String[] args) {
		Tarea5 tarea5 = new Tarea5();
		tarea5.impares(12);
		tarea5.multiplos(1000);
		tarea5.producto(4, 8);
		tarea5.dividirRestando(15, 2);
		tarea5.mediaAleatorios();
		tarea5.esPerfecto(496);
		tarea5.esPerfecto(871);
		tarea5.esPrimo(33);
		tarea5.esPrimo(89);
		tarea5.imprimirPrimos(100);
		tarea5.generarSerie();
		tarea5.generarSerieCuadrados();
		tarea5.mostrarTrianguloNumeros(8);
	}

	/**
	 * Escribe los impares entre 1 y 100 (con un for). Escribe en cada línea 8
	 * números con una separación de una tabulación entre ellos
	 * 
	 */
	public void impares(int i) {
		for (int x = 1; x <= 100; x++) {
			
				System.out.println(x);
		}

	}

	/**
	 * Escribe los 10 primeros múltiplos de n (con for).
	 * 
	 */
	public void multiplos(int n) {
		for (int x = 1; x < 10; x++) {
			n = (n * n);
		}
		System.out.println(n);
	}

	/**
	 * Calcula y devuelve el producto de a y b mediante sumas Con while
	 *
	 */
	public int producto(int a, int b) {
		int contador = 1;
		int resultado = 0;
		while (contador == b) {
			 resultado = (a + resultado);
		}
		return resultado;
	}

	/**
	 * calcula y visualiza en pantalla el cociente entero y el resto de dividir a
	 * entre b. Se asume que a y b son ambos > 0 y a > b. Si a = 15 y b = 2 entonces
	 * cociente = 7 y resto = 1, se calcula mediante restas sucesivas
	 *
	 */
	public void dividirRestando(int a, int b) {

	}

	/**
	 * Genera aleatorios (con Math.random()) entre 10 y 50 (inclusive). Calcula y
	 * escribe la media de todos ellos formateada a 2 decimales El proceso termina
	 * cuando sale el 50
	 * 
	 * Con while
	 *
	 */
	public void mediaAleatorios() {

	}

	/**
	 * Detecta si un nº es o no perfecto Un nº es perfecto si la suma de sus
	 * divisores excepto él mismo es igual al propio nº Con for
	 * 
	 * Ejemplo - el 6 es perfecto (1 + 2 + 3) 496 es perfecto ( 1 + 2 + 4 + 8 + 16 +
	 * 31 + 62 + 124 + 248)
	 */
	public boolean esPerfecto(int n) {
		return false;
	}

	/**
	 * Detecta si n es un número primo Hazlo con un for. En cuanto detectes que el
	 * número no es primo sal del bucle con un return EL 1 no es un número primo.
	 */
	public boolean esPrimo(int n) {
		return false;
	}

	/**
	 * Escribe los n primeros números primos a partir de 2. Usa el método anterior
	 * esPrimo()
	 * 
	 * Si n = 7 entonces 2 3 5 7 11 13 17
	 * 
	 * Con while
	 */
	public void imprimirPrimos(int n) {

	}

	/**
	 * genera y escribe en pantalla los 15 primeros términos de la serie, 1 2 4 7 11
	 * 16 22 29 .......
	 *
	 */
	public void generarSerie() {

	}

	/**
	 * genera y escribe los 20 primeros términos de la serie indicada. Cada término
	 * es el cuadrado de la posición que ocupa. Por ejemplo, el término 5º es 25
	 * (5*5), el término 7º es 49 (7 * 7). 1 4 9 16 25 36 49 64 81 100 121.... En
	 * cada fila escribe 8 términos.
	 *
	 */
	public void generarSerieCuadrados() {

	}

	/**
	 * Escribe la siguiente figura para el nº de filas indicado como parámetro. Deja
	 * dos espacios en blanco entre cada número. Para n = 8 la figura es:
	 * 
	 * 1 3 3 3 5 5 5 5 5 7 7 7 7 7 7 7 9 9 9 9 9 9 9 9 9 11 11 11 11 11 11 11 11 11
	 * 11 11 13 13 13 13 13 13 13 13 13 13 13 13 13 15 15 15 15 15 15 15 15 15 15 15
	 * 15 15 15 15
	 * 
	 * Haz uso del mÃ©todo escribirEspacios()
	 */
	public void mostrarTrianguloNumeros(int n) {

	}

	/**
	 * escribe n espacios en la misma línea (con for).
	 */
	public void escribirEspacios(int n) {

	}

}
