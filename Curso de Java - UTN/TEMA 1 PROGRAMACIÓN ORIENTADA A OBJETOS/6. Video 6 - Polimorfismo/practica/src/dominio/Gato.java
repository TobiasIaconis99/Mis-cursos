package dominio;

public class Gato extends Animal {
	
	private String raza;
	
	public Gato() {
		super();
		this.raza = "Sin raza";
	}
	
	public Gato(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
		
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "Es un gato y su nombre es: " + getNombre() + " y su raza es: " + raza;
	}

	@Override
	public String comportamiento() {
		// TODO Auto-generated method stub
		return "Miau";
	}
	
	
	
	
	
}
