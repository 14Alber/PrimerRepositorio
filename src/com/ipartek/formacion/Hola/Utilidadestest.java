package com.ipartek.formacion.Hola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Utilidadestest {

	@Test
	void testSuma() {
		assertEquals("No suma bien", 5 == Utilidades.suma(2, 3));
		assertEquals("Los numeros son negativos", 0 == Utilidades.suma(-2, 3));
		assertEquals("Uno de los numeros es negativo", 0 == Utilidades.suma(-2, -3));
		assertEquals("Uno de los numeros es negativo", 0 == Utilidades.suma(2, -3));
		assertEquals("Uno de los numeros es negativo", 0 == Utilidades.suma(1, 100));
		assertEquals("Uno de los numeros es correcto", 5 == Utilidades.suma(2, 3));

	}

	@Test
	public void testGetNumeroAleatorio() {
		int numero = -1;
		final int NUMERO_MAXIMO = 10;

		// Crear array con todos los campos falsos,

		boolean[] aResultado = new boolean[NUMERO_MAXIMO];

		// luego generaremos los numeros aleatorios y actualizar el array con
		// true

		for (int i = 0; i < 1000; i++) {
			numero = Utilidades.getNumeroAleatorio(NUMERO_MAXIMO);
			aResultado[numero] = true;
			// assertTrue(numero >= 0 && numero <= NUMERO_MAXIMO);
		}

		// finalmente recorrer el array y comprobar que todo este a true
		for (int i = 0; i < aResultado.length; i++) {
			assertTrue(aResultado[i]);
		}
	}

	@Test
	public void testNoFallaNunca() {
		assertTrue(1 < 2);
	}

}
