package ejercicio;

import java.util.Collections;

public class Main {
	
	
	public static void main(String[] args) {
				 
		Libro l1 = new Libro("A", "Nico", 2001, "1234");
		Libro l2 = new Libro("C", "Martin", 2010, "5132");
		Libro l3 = new Libro("E", "Juana", 2020, "2525");
		Libro l4 = new Libro("B", "Mauro", 2005, "5354");
		Libro l5 = new Libro("D", "Santi", 2015, "6796");
		
		Libro libro = new Libro();
		
		libro.agregarLibro(l1);
		libro.agregarLibro(l2);
		libro.agregarLibro(l3);
		libro.agregarLibro(l4);
		libro.agregarLibro(l5);
		
		System.out.println("\n");
		libro.mostrarLibros();
		
		System.out.println("\n");
		libro.eliminarLibro("1234");
		
		System.out.println("\n");
		System.out.println("Eliminar libro de ISBN 1234");
		libro.mostrarLibros();
		
		System.out.println("\n");
		libro.buscarLibro("C");
		
		
		Collections.sort(libro.getColeccionLibros(), new TituloComparador());
		
		System.out.println("\n");
		System.out.println("Libros ordenados por titulo:");
		libro.mostrarLibros();
		
		Collections.sort(libro.getColeccionLibros(), new AnioComparador());
		
		System.out.println("\n");
		System.out.println("Libros ordenados por anio:");
		libro.mostrarLibros();

		 
		 
	 }
}