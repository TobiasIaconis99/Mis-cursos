package dominio;

public class MiExepcion  extends Exception{
	
	
	public MiExepcion () {
		
		
	}

	@Override
	public String getMessage() {
		return "Un DNI solo puede contener numeros";
	}
	
	

}
