package dominio;

import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		
		//Metodo fileReader 
		//Lee letra por letra de mi archivo 
		try {
			//Obtengo la ruta y la guardo en mi variable de tipo FileReader 
			FileReader reader = new FileReader("Personas.txt");
			int c = reader.read();
			while(c != -1) {
				char letra = (char) c;
				System.out.println(letra);
				c = reader.read();
			}
			reader.close();
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

}
