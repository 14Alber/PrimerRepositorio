package com.ipartek.formacion.Hola;

import com.ipartek.formacion.Hola.pojo.Libro;

/**
 * Clase para realizar un 'Hello World'
 * 
 * @author Curso
 *
 */
public class Hola {
	/**
	 * metodo 'main' para ejecutar la clase
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		// esto es un comentario de linea
		/*
		 * comentario de bloque, permite más de una linea
		 * 
		 * 
		 */
		// Operedor ternario
		// asignar un valor auna funcion de una 'condicion'
		// (condicion)? true : false;
		int edad = (3 > 10) ? 18 : 34;
		System.out.print("edad" + edad);

		// vamos a declarar variables
		int iEntero;
		boolean bBoleana = false;

		if (!bBoleana) {
			System.out.println("Es Verdadero");

		} else {
			System.out.println("Es Falso");

		}

		float fNumeroCuenta = 10.23f;
		float fNumeroCuenta2 = (float) 10.23;
		char caracter = 's';
		String cadena = "dobles";

		// Vamos a estanciar un objeto de la clase Libro

		Libro libroJava = new Libro();
		libroJava.numeroPaginas = 320;
		libroJava.nombre = "Java 7";
		libroJava.autor = "Thomas Jeferson";
		libroJava.describete();
		// for (int i = 0; i < 10; i++) {
		libroJava.escribir(10);
		// }

		Libro libroPHP = new Libro();
		libroPHP.numeroPaginas = 420;
		libroPHP.nombre = "PHP";
		libroPHP.autor = "Jessica Orton";
		libroPHP.describete();
		// for (int i = 0; i < 10; i++) {
		libroJava.escribir(10);
		// }

		Libro libroHTML = new Libro();
		libroHTML.numeroPaginas = 510;
		libroHTML.nombre = "HTML";
		libroHTML.autor = "John Morrison";
		libroHTML.describete();
		// for (int i = 0; i < 10; i++) {
		libroJava.escribir(10);
		// }

	}

}
