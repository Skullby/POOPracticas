package ej3;

public class main {

	public static void main(String[] args) {
		 MotorDeAvion motor1 = new MotorDeAvion("Rolls-Royce", 75000, 80000);
	     MotorDeAvion motor2 = new MotorDeAvion("General Electric", 90000, 95000);
	     MotorDeAvion motor3 = new MotorDeAvion("Pratt & Whitney", 85000, 90000);
	     
	     
	     motor1.setEstado(true);
	     motor3.setEstado(true);
	     
	     motor1.crearMotorDeAvion();
	     motor2.crearMotorDeAvion();
	     motor3.crearMotorDeAvion();
	}

}
