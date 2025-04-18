package dominio;

public class Principal {

	public static void main(String[] args) {
		
		
		int a = 4;
		String nombre = "a";
		String nombre2 = "a";
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		p1.setDni("41.035.034");
		p1.setEdad(11);
		p1.setNombre("Luis Miguel");
		
		
		p2.setDni("41.035.034");
		p2.setEdad(12);
		p2.setNombre("Luis Miguel");
		
		
		System.out.println("Hash code objeto persona: " + p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println("Hash code nombre string: " + nombre.hashCode());
		System.out.println("Hash code nombre2 string: " + nombre2.hashCode());
		

	}

}
