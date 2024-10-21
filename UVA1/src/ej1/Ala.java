package ej1;

public class Ala {
	
	public String color, material;
	public Integer envergadura;
	
	
	public String getColor() {
		return color;
	}

	public String getMaterial() {
		return material;
	}

	public Integer getEnvergadura() {
		return envergadura;
	}

	public Ala(Integer envergadura, String color, String material) {
		this.envergadura = envergadura;
		this.color = color;
		this.material = material;
	};
	
	void flap() {
		System.out.println("Envergadura: " + envergadura + "; Color: " + color + "; Material: " + material);;
		System.out.println("Flappeo");
	}

	public static void main(String[] args) {
		
		
	}

}
