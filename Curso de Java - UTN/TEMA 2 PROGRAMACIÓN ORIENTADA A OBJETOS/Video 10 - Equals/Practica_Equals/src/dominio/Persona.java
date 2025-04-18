package dominio;

import java.util.Objects;

public class Persona {
	
	private int id;
	private String Nombre;
	private String DNI;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", Nombre=" + Nombre + ", DNI=" + DNI + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(DNI, Nombre, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(DNI, other.DNI) && Objects.equals(Nombre, other.Nombre) && id == other.id;
	}
	
	
	

}
