package ej3;

public class MotorDeAvion {
	
	public String marca;
	
	public int fuerza,empuje;
	
	public boolean estado;
	
	public String estadoValor;
	
	public String getMarca() {
		return marca;
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getEmpuje() {
		return empuje;
	}

	public String getEstadoValor() {
		return estadoValor;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public MotorDeAvion(String marca, int fuerza, int empuje) {
		this.marca=marca;
		this.fuerza=fuerza;
		this.empuje=empuje;
		this.estado=false;
	}
	
	void crearMotorDeAvion() {
		if (estado) {
			estadoValor = "Arrancado";
			
		} else {
			estadoValor = "Detenido";
		}
		System.out.println("Marca: " + marca + "; Fuerza (hp): " + fuerza + "; Empuje (libras): " + empuje + " Estado: " + estadoValor);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
