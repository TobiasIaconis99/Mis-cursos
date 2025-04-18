package dominio;

public class articulo {
	
	private int id;
	private String nombre;
	
	
	public articulo() 
	{
		id = 0;
		nombre = "nombre";
	}
	
	public articulo(int id, String nombre) 
	{
		this.id = id;
		this.nombre = nombre;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id >= 0) {
			this.id = id;			
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//@Override
	public String toString() {
		return "articulo [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	

}
