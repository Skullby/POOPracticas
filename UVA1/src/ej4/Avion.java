package ej4;

import ej3.MotorDeAvion;
import ej2.SistemaDeControlDeVuelo;
import ej1.Ala;

public class Avion {
	private int numeroDeAsientos;
	private boolean sistemaDeEntretenimiento;
	private String sistemaDeEntretenimientoValor;
	private String marca, modelo;
	private MotorDeAvion motor;
	private SistemaDeControlDeVuelo sistemaDeControlDeVuelo;
	private Ala[] alas;
	
	
	public boolean isSistemaDeEntretenimiento() {
		return sistemaDeEntretenimiento;
	}

	public void setSistemaDeEntretenimiento(boolean sistemaDeEntretenimiento) {
		this.sistemaDeEntretenimiento = sistemaDeEntretenimiento;
	}
	
	
	public Avion(int numeroDeAsientos, String marca, String modelo, MotorDeAvion motor, SistemaDeControlDeVuelo sistemaDeControlDeVuelo, Ala[] alas) {
		this.numeroDeAsientos = numeroDeAsientos;
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
		this.sistemaDeControlDeVuelo = sistemaDeControlDeVuelo;
		this.alas = alas;
		this.sistemaDeEntretenimiento = false;
		
	}
	
	void crearAvion() {
		if (sistemaDeEntretenimiento) {
			sistemaDeEntretenimientoValor = "Si";
			
		} else {
			sistemaDeEntretenimientoValor = "No";
		}
		
		System.out.println("Marca del Avion: " + marca);
	    System.out.println("Modelo del Avion: " + modelo);
	    System.out.println("Número de Asientos: " + numeroDeAsientos);
	    System.out.println("Motor del Avion: [" + "Marca: " + motor.getMarca() +"; Fuerza (hp): " + motor.getFuerza() + "; Empuje (libras): " + motor.getEmpuje() + " ]");
	    System.out.println("Sistema de Control de Vuelo: [" + "Fabricante: " + sistemaDeControlDeVuelo.getFabricante() + "; Numero de Modos: " + sistemaDeControlDeVuelo.getNumeroModos() + " ]");
	    System.out.println("Tiene Sistema de Entretenimiento: " + sistemaDeEntretenimientoValor);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
