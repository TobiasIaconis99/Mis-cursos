Video 21 - Archivos II (FileReader - Filewriter)



1. File reader 
    - Es una clase que sirve para leer archivos
    - Lee caracter por caracter
    - Para leer todos los caracteres de archivo 
    y mostrarlos podria usar un while.



2. File writter
    - Es una clase que sirve para escribir archivos 
    - Escribe caracter a caracter.
    - Tambien se le puede mandar una cadena entera 
    pero su funcionamiento principal es caracter 
    a caracter.
    - Internamente aunque se le mande una palabra 
    funciona caracter por caracter, uno a la vez.



3. Como usar FileWriter 
    - Hay que crear un objeto de la clase FileWriter 
    - Hay que mandarle la ruta del archivo y un segundo parametro 
    que indica como se escribira en el archivo, si agregara 
    un nuevo elemento al final del archivo o se sobreescribira 
    todo el archivo.

    Ejemplo:
    try {
        FileWriter writer = new FileWriter("Personas.txt", false); // sobrescribe
        writer.write("Nuevo contenido");
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }


4. Como funciona FileReader
    - Hay que crear un objeto de tipo FileReader y pasarle
    la ruta del archivo que se va a leer.
    - Una vez que tenemos la ruta usamos el metodo read para leer, 
    este obtiene un caracter. 
    - Si quiere se puede ir guardando los caracteres en una variable 
    o ir mostrandolos a medida que se van leyendo.
    - Se puede usar un while o un for para ir mostrando todos 
    los caracteres del archivo. 
    - El metodo read devuelve un ASCII y luego de castea a char.
    	
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


5. Al fileWriter se le puede mandar un ASCII
o frases enteras 
    - Tengo entendido que se le puede mandar un ascii en
    lugar del caracter que se quiere. 
    - Tambien se le puede mandar frases enteras.


6. Info de los metodos
    - Solo hay que pararse arriba del metodo y 
    te muestra la informacion del mismo.


7. Como ver la ubicacion del archivo 


8. FileReader y Writer trabajan letra por letra     
    - Si, ambos trabajan caracter por caracter. 

9. Como crear un archivo  
    - Con el FileWriter si una ruta no existe, la 
    crea

10. Aunque al write le mande una frase por dentro trabaja de a letras
    - Si, aunque al File Writer le mande una frase, internamente 
    trabaja caracter por caracter 
    - No escribe toda la cadena de una, sino que escribe un 
    caracter a la vez. 
    - Internamente guarda cada elemento en un vector de char[]
    y escribe elemento por elemento.


