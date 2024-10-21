package ej4;

import ej3.MotorDeAvion;
import ej2.SistemaDeControlDeVuelo;
import ej1.Ala;

public class main {

	public static void main(String[] args) {
		MotorDeAvion motor = new MotorDeAvion("Rolls-Royce", 75000, 80000);
	    SistemaDeControlDeVuelo sistemaDeControlDeVuelo = new SistemaDeControlDeVuelo("Aerolineas", 3);
	    Ala ala1 = new Ala(50,"Blanco","Aluminio");
	    Ala ala2 = new Ala(50,"Blanco","Aluminio");
	    Ala[] alas = {ala1, ala2};

	    Avion avion = new Avion(300, "Boeing", "737", motor , sistemaDeControlDeVuelo, alas);
	    
	    avion.setSistemaDeEntretenimiento(true);
	    
	    avion.crearAvion();

	}

}
