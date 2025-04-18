package dominio;

public abstract class Animal {

	private String nombre;	
	
	public Animal() {		
		this.nombre = "Sin nombre";
	}
	
	public Animal(String nombre) {			
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Es un animal y su nombre es: " + nombre;
	}
	
	public abstract String comportamiento();
		
	
	
}
