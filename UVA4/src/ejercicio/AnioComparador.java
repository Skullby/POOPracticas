package ejercicio;

import java.util.Comparator;

public class AnioComparador implements Comparator<Libro> {
	
	@Override
	public int compare(Libro l1, Libro l2) {
		return Integer.compare(l1.getAnioPublicacion(), l2.getAnioPublicacion());
	}


}
