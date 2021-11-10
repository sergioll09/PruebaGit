package Ejercicio_4;

public class Tarea4 {

	/**
	 * Punto de entrada de la ejecución.
	 */
	public static void main(String[] args) {
		Tarea4 ej = new Tarea4();
		ej.printDescripcion(54, "Ramiro");
		ej.printDescripcionOtraVersion(17, "Jonathan");
		ej.printDescripcion(12, "Marco");

		System.out.println(ej.esPositivoPar(3));
		System.out.println(ej.esPositivoPar(34));

		System.out.println(ej.metodoMisterioV1(34));
		System.out.println(ej.metodoMisterioV2(-34));
		System.out.println(ej.metodoMisterioV3(-4));

		System.out.println(ej.demoSwitch(4));

		ej.repartirCaramelos(5, 3);
		ej.repartirCaramelos(1, 3);
		ej.repartirCaramelos(5, 5);

		System.out.println(ej.obtenerValorAbsoluto(54));
		System.out.println(ej.obtenerValorAbsoluto(-754));

		ej.mostrarNumeroEnLetra(45);
		ej.mostrarNumeroEnLetra(450);

		System.out.println(ej.esImparUltimaCifra(683));
		System.out.println(ej.esImparUltimaCifra(872));
		System.out.println(ej.esImparUltimaCifra(333333330));

		ej.hacerFct('p', true);
		ej.hacerFct('P', false);
		ej.hacerFct('s', true);
		ej.hacerFct('S', false);

		ej.mostrarNumero(43);
		ej.mostrarNumero(-68);
		ej.mostrarNumero(-57);

		ej.demoSwitch2("Lunes");
		ej.demoSwitch2("Domingo");

		System.out.println(ej.esVocalV1('a'));
		System.out.println(ej.esVocalV1('I'));
		System.out.println(ej.esVocalV1('J'));

		System.out.println(ej.calcularDiasMes(2, 2004));
		System.out.println(ej.calcularDiasMes(2, 2006));
		System.out.println(ej.calcularDiasMes(8, 2000));
		System.out.println(ej.calcularDiasMes(9, 2001));

		ej.detectarTipoLetra('a');
		ej.detectarTipoLetra('*');
		ej.detectarTipoLetra('O');
		ej.detectarTipoLetra('p');
		ej.detectarTipoLetra('W');
		ej.detectarTipoLetra('@');
	}

	/**
	 * 
	 * if con else completo (if anidado)
	 * 
	 * 
	 */
	public void printDescripcion(int edad, String nombre) {

		if (edad < 13) {
			System.out.println(nombre + " es un niño");
		} else {
			if (edad < 18) {
				System.out.println(nombre + " es un adolescente ");
			} else {
				System.out.println(nombre + "es un adulto");
			}
		}

	}

	/**
	 * if anidado, if ... else if
	 */
	public void printDescripcionOtraVersion(int edad, String nombre) {

		if (edad < 13)
			System.out.println(nombre + " es un niño");
		else if (edad < 18)
			System.out.println(nombre + " es un adolescente ");
		else
			System.out.println(nombre + " es un adulto");
	}

	/**
	 * 
	 */
	public boolean esPositivoPar(int numero) {
		if ((numero > 0) && (numero % 2 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 */
	public boolean metodoMisterioV1(int valor) {
		if (valor >= 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Uso de una variable local para devolver el valor después con return
	 */
	public boolean metodoMisterioV2(int valor) {
		boolean resultado = false;

		if (valor >= 0) {
			resultado = true;
		}

		return resultado;
	}

	/**
	 * El método anterior con expresión booleana
	 */
	public boolean metodoMisterioV3(int valor) {

		return (valor >= 0);
	}

	/**
	 * Demo de la sentencia switch
	 */
	public String demoSwitch(int dia) {
		String nombreDia;
		switch (dia) {
		case 1:
			nombreDia = "Lunes";
			break;
		case 2:
			nombreDia = "Martes";
			break;
		case 3:
			nombreDia = "Miércoles";
			break;
		case 4:
			nombreDia = "Jueves";
			break;
		case 5:
			nombreDia = "Viernes";
			break;
		case 6:
			nombreDia = "Sábado";
			break;
		case 7:
			nombreDia = "Domingo";
			break;
		default:
			nombreDia = "Incorrecto";
			break;
		}
		return nombreDia;
	}

	/**
	 * Mostrar uno de estos tres mensaje: " xxxx personas sin caramelos" " cada
	 * persona con un caramelo" " xxxx personas con más de un caramelo"
	 */
	public void repartirCaramelos(int personas, int caramelos) {
		if (personas < caramelos) {
			System.out.println((caramelos - personas) + " personas sin caramelos");
		} else if (personas == caramelos) {
			System.out.println(personas + " personas con un solo caramelo");
		} else {
			System.out.println((personas - caramelos) + " personas con más de un caramelo");
		}
	}

	/**
	 * Calcula y devuelve el valor absoluto de numero
	 *
	 */
	public int obtenerValorAbsoluto(int numero) {

		if (numero < 0) {
			return (-numero);
		} else {
			return numero;
		}
	}

	/**
	 * Muestra como letra el valor de numero Para practicar if ... elseif ....
	 * Comprobar que el número está dentro del rango de los códigos que contienen
	 * letras.
	 */
	public void mostrarNumeroEnLetra(int numero) {
		if (numero < 65) {
			System.out.println("No se puede convertir");
		} else if (numero <= 90) {
			System.out.println((char) numero);
		} else if (numero < 97) {
			System.out.println("No se puede convertir");
		} else if (numero > 122) {
			System.out.println((char) numero);
		}
	}

	/**
	 * Devuelve true si es impar la última cifra de numero
	 *
	 */
	public boolean esImparUltimaCifra(int numero) {
		if (numero % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Escribir "El alumno hará la FCT" si es del curso segundo 'S' / 's' y ha
	 * aprobado todo En cualquier caso mostrar el mensjae "Final de este método"
	 */
	public void hacerFct(char curso, boolean haAprobado) {
		if ((curso == 'S' || curso == 's') && (haAprobado == true)) {
			System.out.println("El alumno hara la FCT");
		}
		System.out.println("Final de este método");
	}

	/**
	 * Si numero es positivo se decrementa su valor, se multiplica por 2 y se
	 * escribe Si es negativo se incrementa, se divide entre 2 y se escribe también
	 *
	 */
	public void mostrarNumero(int numero) {
		if (numero <= 0) {
			numero = ((numero - 1) * 2);
		} else {
			numero = ((numero + 1) / 2);
		}
	}

	/**
	 * Demo de la sentencia switch Escribe día laborable/ No laborable
	 */
	public void demoSwitch2(String dia) {
		String nombreDia = "";
		switch (dia) {
		case "Lunes":
			nombreDia = "Día laborable";
			break;
		case "Martes":
			nombreDia = "Día laborable";
			break;
		case "Miercoles":
			nombreDia = "Día laborable";
			break;
		case "Jueves":
			nombreDia = "Día laborable";
			break;
		case "Viernes":
			nombreDia = "Dia laborable";
			break;
		case "Sábado":
			nombreDia = "Dia no laborable";
			break;
		case "Domingo":
			nombreDia = "Dia no laborable";
			break;
		}
		System.out.println(nombreDia);
	}

	/**
	 * Demo de la sentencia switch devuelve true si es vocal / false en otro caso
	 */
	public boolean esVocalV1(char letra) {
		
		switch (letra) {
		case 'a':
			return true;
		case 'A':
			return true;
		case 'e':
			return true;
		case 'E':
			return true;
		case 'i':
			return true;
		case 'I':
			return true;
		case 'o':
			return true;
		case 'O':
			return true;
		case 'u':
			return true;
		case 'U':
		}	
			return false;
	
	}
	/**
	 * Calcula y devuelve los días del mes indicado Para el mes febrero habrá que
	 * tener en cueta si año es o no bisiesto (múltiplo de 4) Si el mes es
	 * incorrecto devolver -1
	 * 
	 *
	 */
	public int calcularDiasMes(int mes, int anio) {

		return 0;
	}

	/**
	 * si no es una letra mensaje error si letra vocal mayúscula escribir vocal
	 * mayúscula si letra vocal minúscula escribir minúscula escribir consonante en
	 * otro caso
	 */
	public void detectarTipoLetra(char letra) {

	}

}
