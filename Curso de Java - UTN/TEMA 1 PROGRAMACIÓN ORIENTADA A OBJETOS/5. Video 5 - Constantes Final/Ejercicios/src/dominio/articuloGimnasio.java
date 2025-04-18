package dominio;

public class articuloGimnasio extends articulo {
	
	private int peso;
	private static final int gramos = 1000;
		
	public articuloGimnasio(){
		
		
	}
	

	public articuloGimnasio(String nombre, int peso){
		
		super(nombre);
		this.peso = peso;
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int obtenerGramosPeso() {
		
		return this.peso * gramos;
	}
	
	
	@Override
	public String toString() {
		return "ArticuloGimnasio: " + super.toString() + " [peso=" + peso + "]";
	}

}
