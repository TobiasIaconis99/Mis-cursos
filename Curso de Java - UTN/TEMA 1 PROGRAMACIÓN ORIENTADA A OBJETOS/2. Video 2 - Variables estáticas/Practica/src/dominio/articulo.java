package dominio;

public class articulo {
	
	private int id;
	private String nombre;
	private static int cont = 0;
	
	
	public articulo() 
	{
		cont++;
		id = cont;
		nombre = "nombre";
	}
	
	public articulo(String nombre) 
	{
		cont++;
		this.id = cont;
		this.nombre = nombre;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "articulo [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	

}
