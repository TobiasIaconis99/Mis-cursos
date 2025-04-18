package dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingDeque;

public class Principal {

	public static void main(String[] args) {
		
		
		Persona p = new Persona(12, "Jorge");
		Persona p1 = new Persona(21, "Jose");
		Persona p2 = new Persona(12, "Pepe");
		Persona p3 = new Persona(12, "Marilu");
		Persona p4 = new Persona(12, "Jazmin");
		Persona p5 = new Persona(12, "Jazmin");
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		LinkedBlockingDeque<Persona> perso = new LinkedBlockingDeque<Persona>();
		
		personas.add(p);
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		personas.add(p5);
		
		
		perso.add(p);
		perso.add(p1);
		perso.add(p2);
		perso.add(p3);
		perso.add(p4);
		perso.add(p5);
		
		
		
		//for (Persona persona : personas) {
		//	System.out.println(persona.toString());
		//}
		
		
		for (Persona persona : perso) {
			System.out.println(persona.toString());
		}
	}

}
