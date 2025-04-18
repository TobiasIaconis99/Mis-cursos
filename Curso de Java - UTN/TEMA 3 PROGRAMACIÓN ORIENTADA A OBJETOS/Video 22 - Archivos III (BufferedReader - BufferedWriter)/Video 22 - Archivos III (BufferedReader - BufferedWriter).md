Video 22 - Archivos III (BufferedReader - BufferedWriter)



1. Buffered reader y writer 
    - Se crearon para acelearar la lectura 
    y la escritura 
    - Es asi porque los FileWriter y FileReader 
    son lentos en comparacion, ya que funcionan
    con un carater a la vez. 

2. Buffer que es
    - Es como una memoria intermedia 
    - Trabajan con lineas enteras y no caracter 
    por caracter 

3. Objeto de tipo Buffer 
    - Esta el objeto Buffer reader y 
    buffer writer 
    - Sirven para leer o escribir en lineas 
    en lugar de caracter por caracter.


4. Como leer con buffer
    - Primero se instancia un objeto de tipo 
    FileReader.
    - Luego se instacia un objeto BufferReader 
    y se le pasa como parametro el objeto 
    FileReader.
    try{
        FileReader reader = new FileReader("Personas.txt");
        BufferedReader bufferRead = new BufferedReader(reader);
        String linea = "";
            while(linea != null){
                linea = bufferRead.readLine();
            }
        reader.close();

    }
    catch(Exception e){

    }

5. Como usar buffer writer 


6. Por que tengo que cerrar el buffer y el file 