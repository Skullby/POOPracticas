package ejercicio;

public class Main {

	public static void main(String[] args) {
		
        Pantalla pantallaCompartida = new Pantalla(55, "1080p");

        TV tv1 = new TV("Samsung", "Series 9", 2020, 'O', pantallaCompartida, true);
        TV tv2 = new TV("LG", "Model X", 2021, 'L', pantallaCompartida, false);

        System.out.println("Detalles iniciales:");
        System.out.println(tv1.obtenerDetalles());
        System.out.println(tv2.obtenerDetalles());

        pantallaCompartida.setTamaño(65);
        pantallaCompartida.setResolucion("4K");

        System.out.println("\nDetalles después de modificar la pantalla:");
        System.out.println(tv1.obtenerDetalles());
        System.out.println(tv2.obtenerDetalles());
        
        tv1.encender();
        System.out.println("\nDespués de encender el televisor:");
        System.out.println(tv1.obtenerDetalles());
        System.out.println(tv2.obtenerDetalles());
        

	}

}
