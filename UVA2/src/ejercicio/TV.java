package ejercicio;

public class TV {
	
	private String marca;
    private String modelo;
    private int añoFabricacion;
    private char tipo; 
    private Pantalla pantalla;
    private boolean esSmart;
    private boolean encendido;


    // Constructor
    public TV(String marca, String modelo, int añoFabricacion, char tipo, Pantalla pantalla, boolean esSmart) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.tipo = tipo;
        this.pantalla = pantalla;
        this.esSmart = esSmart;
        this.encendido = false;
    }
    
    public void encender() {
        this.encendido = true;
    }
    
    public void apagar() {
        this.encendido = false;
    }
    
    public String obtenerEstado() {
        return this.encendido ? "encendido" : "apagado";
    }

    public String obtenerDetalles() {
        String[] tiposTV = {"Plasma", "LCD", "OLED"};
        String tipoTV = "";

        if (tipo == 'P') {
            tipoTV = tiposTV[0]; // Plasma
        } else if (tipo == 'L') {
            tipoTV = tiposTV[1]; // LCD
        } else if (tipo == 'O') {
            tipoTV = tiposTV[2]; // OLED
        }

        String smartText = esSmart ? "Smart" : "No Smart";
        return marca + " " + modelo + " -- " + pantalla.getTamaño() + " pulgadas -- " + pantalla.getResolucion() + " -- " + smartText + " -- Tipo: " + tipoTV + " -- Estado: " + obtenerEstado();
    }

    // Getters y Setters
    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
