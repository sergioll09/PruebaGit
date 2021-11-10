package Ejercicio_4;

public class Tarea6 {

	/**
	 * Método main. NO MODIFICAR.
	 */
	public static void main(String[] args) {
		Tarea6 tarea6 = new Tarea6();
		System.out.println(tarea6.maximo(2, 6, 8));
		System.out.println(tarea6.maximo(8, 6, 2));
		System.out.println(tarea6.maximo(8, 2, 6));
		System.out.println(tarea6.maximo(-2, 6, -8));

		System.out.println(tarea6.minimo(2, 6, 8));
		System.out.println(tarea6.minimo(8, 6, 2));
		System.out.println(tarea6.minimo(8, 2, 6));
		System.out.println(tarea6.minimo(-2, 6, -8));

		System.out.println(tarea6.sonIguales(2, 6, 8));
		System.out.println(tarea6.sonIguales(8, 8, -8));
		System.out.println(tarea6.sonIguales(8, 8, 8));

		System.out.println(tarea6.cuantosPares(2, 6, 8));
		System.out.println(tarea6.cuantosPares(8, 5, 1));
		System.out.println(tarea6.cuantosPares(11, 3, 7));
		System.out.println(tarea6.cuantosPares(-2, 6, -8));

		System.out.println(tarea6.cuantosAcabanEn(2, 6, 8, 6));
		System.out.println(tarea6.cuantosAcabanEn(34, 54, 104, 4));
		System.out.println(tarea6.cuantosAcabanEn(11, 3, 7, 1));
		System.out.println(tarea6.cuantosAcabanEn(-2, 6, -22, 2));

		tarea6.ordenar(2, 6, 8, "ASC");
		tarea6.ordenar(34, 54, 104, "DESC");
		tarea6.ordenar(11, 3, 7, "ASC");
		tarea6.ordenar(-2, 6, -22, "DESC");
	}

	/**
	 * Recibe tres números y retorna el máximo.
	 * 
	 * @param a primer número
	 * @param b segundo número
	 * @param c tercer número
	 * 
	 */
	public int maximo(int a, int b, int c) {

		if (a > b) {
			if (a > b) {
				return a;
			}
		}
		if (b > c) {
			if (b > a) {
				return b;
			}
		}
		if (c > a) {
			if (c > b) {
				return c;
			}
		}
		return 1;
	}

	/**
	 * Recibe tres números y retorna el mínimo.
	 * 
	 * @param a primer número
	 * @param b segundo número
	 * @param c tercer número
	 * 
	 */
	public int minimo(int a, int b, int c) {
		if (a < b) {
			if (a < c) {
				return a;
			}
		}
		if (b < c) {
			if (b < a) {
				return b;
			}
		}
		if (c < a) {
			if (c < b) {
				return c;
			}
		}
		return 1;
	}

	/**
	 * Recibe tres números y retorna el true si son iguales. False en caso
	 * contrario.
	 * 
	 * @param a primer número
	 * @param b segundo número
	 * @param c tercer número
	 * 
	 */
	public boolean sonIguales(int a, int b, int c) {
		if (a == b) {
			if (a == c) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	/**
	 * Recibe tres números y retorna el número de ellos que son pares. Es decir, 0,
	 * 1, 2 o 3.
	 * 
	 * @param a primer número
	 * @param b segundo número
	 * @param c tercer número
	 * 
	 */
	public int cuantosPares(int a, int b, int c) {
		int contador = 0;
		if ((a % 2) == 0) {
			contador++;
			if ((b % 2) == 0) {
				contador++;
				if ((c % 2) == 0) {
					contador++;
				}
			}
		}
		return contador;
	}

	/**
	 * Recibe tres números y retorna el número de ellos que son terminan en el 4
	 * número que recibe como parámetro. Es decir, 0, 1, 2 o 3.
	 * 
	 * @param a           primer número
	 * @param b           segundo número
	 * @param c           tercer número
	 * @param terminacion si a, b o c terminan en este número, se cuentan como
	 *                    resultado correcto
	 */
	public int cuantosAcabanEn(int a, int b, int c, int terminacion) {
		int contador = 0;
		if ((a % 10) == terminacion) {
			contador++;
		}
		if ((b % 10) == terminacion) {
			contador++;
		}
		if ((c % 10) == terminacion) {

		}
		return terminacion;
	}

	/**
	 * Recibe tres números y los imprime en orden.
	 * 
	 * @param a       primer número
	 * @param b       segundo número
	 * @param c       tercer número
	 * @param sentido puede ser "ASC" o "DESC". Si es "ASC", la ordenación será de
	 *                menor a mayor, es decir, 1, 2, 3.... Si es "DESC", 3, 2, 1...
	 */
	public void ordenar(int a, int b, int c, String sentido) {
		if (a > b) {
			if (b > c) {
				if (sentido == "ASC") {
					System.out.println(c + b + a);
				} else {
					System.out.println(a + b + c);
				}
			} else {
				if (sentido == "ASC") {
					System.out.println(b + a + c);
				} else {
					System.out.println(c + a + b);
				}
			}
		} else {
			if (b > c) {
				if (sentido == "ASC") {
					System.out.println(a + b + c);
				} else {
					System.out.println(c + b + a);
				}
			} else {
				if (sentido == "ASC") {
					System.out.println(a + b + c);
				} else {
					System.out.println(c + b + a);
				}
			}
		}
	}
}