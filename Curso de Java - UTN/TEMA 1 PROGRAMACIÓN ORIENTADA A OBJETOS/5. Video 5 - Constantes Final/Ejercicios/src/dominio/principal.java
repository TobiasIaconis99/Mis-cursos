package dominio;

public class principal {

	public static void main(String[] args) {
		
		articuloGimnasio articuloGimnasio = new articuloGimnasio("Mancuerna", 1);
		
		System.out.println(articuloGimnasio.toString() + articuloGimnasio.obtenerGramosPeso() + "gramos");

	}

}
