Video 20 - Archivos I



1. Que es un archivo
    - Un es medio de almacenamiento 
    - Pueden almacenar numeros, letras, caracteres, simbolos que 
    representan entidades.    
    - Se hay dos tipos de archivos, los binarios y 
    los que de caracteres
    - Los de caracteres (o texto) contienen informacion 
    legible para los humanos como archivos .txt o .csv o .html
    - Los binarios: Almacenan datos en formato 
    binario. 
    - Se usan en imagenes, videos, programas ejecutables


2. Diferentes tipos de archivos 
    - Los archivos binarios: Son archivos que tienen formato 
    binario 0 y 1, y son usados en sistemas de bajo nivel 
    - Los archivos de caracteres: Son archivos que tienen 
    informacion en lenguaje humano, con letras, numeros, 
    simbolos, etc.




3. Diferentes formas de guardar informacion 
dentro de un archivo 
    - Se puede guadar informacion un 
    archivo de forma binaria o en caracteres.
    - La de caracteres es mas comun ya que es mas facil de 
    leer y editar por personas. 
    - La binaria se usa para sistemas de 
    bajo nivel, como sistemas operativos o drivers. 
    porque permite mayor control o efeciencia en el manejo de 
    datos.  


4. Flujo de bytes
    

5. Flujo de caracteres


6. Clases para manipular un flujo de bytes
    - En java se puede usar la clase File
    y sus metodos.


7. Clases para modificar un flujo de caracteres
    - En archivos binarios:
        - inputStream 
        - OutputStream 
    - Archivos de caracteres:
        - FileReader 
        - FileWriter 
        - BufferedReader 
        - BufferedWriter 


8. Cuando usar archivo con flujo de bytes y cuando 
uno con flujo de caracteres
    - Uno para sistemas de bajo nivel 
    - Y otro para aplicaciones de alto nivel 


9. Metodo para comprobar si mi archivo existe 
    - Exist() creando un objeto de tipo 
    File. 

    import java.io.File;

    File archivo = new File("ruta/del/archivo.txt");

    if (archivo.exists()) {
        System.out.println("El archivo existe.");
    } else {
        System.out.println("El archivo no existe.");
    }


10. Ruta relativa y absoluta 
    - Ruta absoluta: Es la ruta 
    especifica donde se encuentra el archivo c/archivos de programa/Personas.txt.
    - Ruta relativa: Es la ruta del archivo pero sin especificar las carpetas 
    en especififo /../Personas.txt.
    - Las rutas relativas son útiles en proyectos compartidos, ya que funcionan en diferentes computadoras sin necesidad de tener la misma estructura de carpetas en el disco.


11. Como crear un archivo 
    - Usando un objeto de la clase FileWriters de tipo file Writter(ruta, true) 
    - Usando el metodo write 
    - Usando el metodo close para cerrar el archivo


12. Podemos hacer nuestro propio metodo 


13. Que tipo de sistemas son de bajo nivel 


14. Que sistemas usan archivos binarios


15. Por que se usa un archivo binario?


16. Se usan en imagenes  


17. Clases para manipular archivos
    - File: Sirve para obtener la ruta de un archivo 
    y preguntarme si existe, en principio
    - Verificar si es un archivo o un directorio.
    - File Writer:
        - Sirve paga escribir en un archivo
        - La sintaxis seria:
            try {
                FileWriter fileWriter = new FileWriter("Personas.txt", false);
                fileWriter.write("Cambio");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        - Con un parametro le indico la ruta del archivo y 
        con el otro le digo si agregara texto o lo pisara.
        y escribira nuevo 
    - File Reader:

18. ¿Por que tengo que cerrar un archivo?