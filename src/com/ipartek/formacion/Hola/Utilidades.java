package com.ipartek.formacion.Hola;

/**
 * Clase (@code utilidades) con metodos estticos y comunes <br>
 * Por ejemplo: generar numeros aleatorios, validaciones, etc
 * 
 * @author Curso
 *
 */
public class Utilidades {

	/**
	 * generar numero (@code int) aleatorio desde 0 hasta <b>maximovalor</b>
	 * 
	 * @param maximovalor
	 *            numero aleatorio maximo que puede generar.
	 * @return numero entero aleatorio
	 */
	static public int getNumeroAleatorio(int maximovalor) {
		return (int) (Math.random() * maximovalor);
	}

	/**
	 * Metodo para sumar dos numeros positivos. <br>
	 * 
	 * @param num1
	 *            entero a sumar
	 * @param num2
	 *            entero a sumar
	 * @return la suma de los dos parametros, pero <br>
	 *         Si cualquiera de los dos es negativo return 0 <br>
	 *         Si la suma es superior a 100, return 0
	 */

	static public int suma(int num1, int num2) {
		int resultado = -1;
		if (num1 < 0 || num2 < 0 || (num1 + num2 > 100)) {
			resultado = 0;
		} else {
			resultado = num1 + num2;

		}
		return resultado;
	}

}
