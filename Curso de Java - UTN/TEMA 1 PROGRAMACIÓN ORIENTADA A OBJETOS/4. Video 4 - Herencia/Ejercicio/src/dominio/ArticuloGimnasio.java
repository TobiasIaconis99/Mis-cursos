package dominio;

public class ArticuloGimnasio extends articulo {
	
	private int peso;

	public ArticuloGimnasio(){
		
		super();
	}
	
	public ArticuloGimnasio(String nombre ,int peso) {
		
		super(nombre);
		this.peso = peso;
	}
	
	public float getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		
		return "ArticuloGimnasio: " +  super.toString() + " [peso=" + peso + "]";
	}
	
	
	
	

}
