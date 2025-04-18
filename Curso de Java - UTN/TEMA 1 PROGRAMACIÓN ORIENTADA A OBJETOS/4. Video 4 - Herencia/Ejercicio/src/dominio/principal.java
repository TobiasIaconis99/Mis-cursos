package dominio;

public class principal {

	public static void main(String[] args) {
		
		ArticuloGimnasio artGimnasio1 = new ArticuloGimnasio("Mancuerna", 2);
		ArticuloGimnasio artGimnasio2 = new ArticuloGimnasio();
		
		System.out.println(artGimnasio1.toString());
		System.out.println(artGimnasio2.toString());
		
		artGimnasio1.setNombre("hola");
		
		
		

		

	}

}
