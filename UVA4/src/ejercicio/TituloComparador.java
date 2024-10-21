package ejercicio;

import java.util.Comparator;

public class TituloComparador implements Comparator<Libro> {
	
	@Override
	public int compare(Libro l1, Libro l2) {
		return l1.getTitulo().compareTo(l2.getTitulo());
	}

}
