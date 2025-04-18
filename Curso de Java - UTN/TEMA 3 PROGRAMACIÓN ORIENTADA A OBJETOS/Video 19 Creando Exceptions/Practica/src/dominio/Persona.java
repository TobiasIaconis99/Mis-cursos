package dominio;

public class Persona extends MiExepcion{
	
	private int id;
	private String nombre;
	private String DNI;
	
	
	public static void validarDni(String DNI) throws MiExepcion{
	
		 if (DNI == null || !DNI.matches("\\d+")) {
		        throw new MiExepcion();
		  }
		
	}

}
