package ej2;

public class main {
	
	public static void main(String[] args) {
		SistemaDeControlDeVuelo sistema1 = new SistemaDeControlDeVuelo("Aerolineas", 3);
		
		SistemaDeControlDeVuelo sistema2 = new SistemaDeControlDeVuelo("Latam", 5);
		
		sistema1.setTipoSistema(true);
		
		sistema1.crearSistemaControl();
		sistema2.crearSistemaControl();
	}
}
