package ej2;

public class SistemaDeControlDeVuelo {
	
	public String fabricante;
	
	public int numeroModos;

	public boolean tipoSistema; 
	
	public String tipoSistemaValor;
	
	public String getTipoSistemaValor() {
		return tipoSistemaValor;
	}


	public String getFabricante() {
		return fabricante;
	}


	public int getNumeroModos() {
		return numeroModos;
	}


	public boolean isTipoSistema() {
		return tipoSistema;
	}


	public void setTipoSistema(boolean tipoSistema) {
		this.tipoSistema = tipoSistema;
	}

	
	public SistemaDeControlDeVuelo(String fabricante, int numeroModos) {
		this.fabricante = fabricante;
		this.numeroModos = numeroModos;
		this.tipoSistema = false;
	};
	

	
	void crearSistemaControl() {
		if (tipoSistema) {
			tipoSistemaValor = "Piloto Automatico";
			
		} else {
			tipoSistemaValor = "Manual";
		}
		System.out.println("Fabricante: " + fabricante + "; Numero de Modos: " + numeroModos + "; Modo Actual: " + tipoSistemaValor);;
	}
	
	
	public static void main(String[] args) {
	
	}

}
