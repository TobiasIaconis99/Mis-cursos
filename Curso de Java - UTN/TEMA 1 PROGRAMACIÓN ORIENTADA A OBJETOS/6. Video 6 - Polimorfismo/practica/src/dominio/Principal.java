package dominio;

public class Principal {

	public static void main(String[] args) {
		
		
		//Animal animal = new Animal();
		Animal animal2 = new Gato("pepe", "gato");
		
		Gato gato = new Gato("Africa", "Mau egipcio");
		System.out.println(gato.toString());
		//System.out.println(animal.toString());
		System.out.println(animal2.toString());

	}

}
