package dominio;

public class Principal {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		Persona p1 = new Persona();
		
		p.setId(0);
		p.setNombre("Jorge");
		p.setDNI("41.970.558");
		
		p1.setId(0);
		p1.setNombre("Jorge");
		p1.setDNI("41.970.558");
		
		
		//Esto compara las direcciones de memoria, no el contenido
		//if(p == p1) {
		//	System.out.println("Son iguales");
		//}
		//else {
		//	System.out.println("No son iguales");
		//}
		
		
		//Aca si se compara el contenido de las variables
		System.out.println(p.equals(p1));
		
		
	}

}
