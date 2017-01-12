package com.ipartek.formacion.Hola.pojo;

/**
 * 
 * Clase publica (@code Libro) para representar un libro
 *
 */
public class Libro {
	// Definir atributos
	/**
	 * int numeroPaginas numero de paginas que contiene el libro
	 */
	public int numeroPaginas;
	/**
	 * String nombre del libro
	 */
	public String nombre;
	/**
	 * String nombre del autor
	 */
	public String autor;

	// metodos o funciones
	/*
	 * metodo para visualizar los atributos de los libros
	 * 
	 */
	public void describete() {
		System.out.println("Descripcion: " + this.nombre);
		System.out.println("Autor: " + this.autor);
		System.out.println(this.numeroPaginas + " paginas");
		System.out.println("-----------------------");
	}

	// metodo para sumar una pagina a cada libro
	/**
	 * aumentamos el numero de paginas
	 * 
	 * @param numPaginas
	 *            int numero paginas nuevas escritas
	 */
	public void escribir(int numPaginas) {
		this.numeroPaginas += numPaginas;
		// this.numeroPaginas = this.numeroPaginas + 1;
		// System.out.println("Se ha añadido una pagina");
		System.out.println("Se ha añadido " + numPaginas + " paginas");
	}

}
