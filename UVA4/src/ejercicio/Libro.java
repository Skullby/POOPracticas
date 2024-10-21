package ejercicio;

import java.util.ArrayList;
import java.util.Iterator;

public class Libro implements Comparable<Libro> {
	
	private String titulo;
	private String autor;
	private int anioPublicacion;
	private String isbn;
	private ArrayList<Libro> coleccionLibros;
	
	public Libro() {
		coleccionLibros = new ArrayList<>();
    }

	
	public ArrayList<Libro> getColeccionLibros() {
		return coleccionLibros;
	}


	public void setColeccionLibros(ArrayList<Libro> coleccionLibros) {
		this.coleccionLibros = coleccionLibros;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}


	public int getAnioPublicacion() {
		return anioPublicacion;
	}


	public String getIsbn() {
		return isbn;
	}

	Libro(String titulo, String autor, int anioPublicacion, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.anioPublicacion = anioPublicacion;
		this.isbn = isbn;
		
	};
	
	public void agregarLibro(Libro libro) {
		coleccionLibros.add(libro);
		System.out.println("Libro agregado: " + libro);
	}
	
	
	public void eliminarLibro(String isbn) {
		Iterator<Libro> iterador = coleccionLibros.iterator();
		boolean encontrado = false;
		
		while (iterador.hasNext()) {
			Libro libro = iterador.next();
			if (libro.getIsbn().equals(isbn)) {
				iterador.remove();
				System.out.println("Libro eliminado: " + libro);
				encontrado = true;
				break;
			}
		}
		
		if (!encontrado) {
			System.out.println("Libro no encontrado por ISBN: " + isbn);
		}
		
	}
	
	public void buscarLibro(String titulo) {
		boolean encontrado = false;
    
		for (Libro libro : coleccionLibros) {
			if (libro.getTitulo().equalsIgnoreCase(titulo)) {
				System.out.println("Libro encontrado: " + libro);
				encontrado = true;
				break;
			}
	        }

	        if (!encontrado) {
	            System.out.println("No se encontro el libro con titulo: " + titulo);
	        }
	}
	
    public void mostrarLibros() {
        for (Libro libro : coleccionLibros) {
            System.out.println(libro);
        }
    }
	
	@Override
	public String toString() {
		return "Libro [Titulo=" + titulo + ", Autor=" + autor + ", Anio=" + anioPublicacion + ", ISBN=" + isbn + "]";
	}
	
	@Override
	public int compareTo(Libro otroLibro) {
		return this.isbn.compareTo(otroLibro.getIsbn());
	}



	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
