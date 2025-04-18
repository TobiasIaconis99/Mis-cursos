package dominio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		
		
		//Con esta clase puedo obtener el archivo y verificar 
		//Si exsite 
		File archivo = new File("Personas.txt");
		
		if(archivo.exists()){
			
			System.out.println("El archivo personas existe");
		}
		else {
			System.out.println("No se encontro el archivo");
		}
		
		//Crear un archivo
		
		try {
			FileWriter fileWriter = new FileWriter("Personas.txt", false);
			fileWriter.write("Cambio");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
