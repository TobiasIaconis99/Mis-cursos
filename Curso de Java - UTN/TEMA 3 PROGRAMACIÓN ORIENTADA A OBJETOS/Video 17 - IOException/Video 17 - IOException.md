Video 17 - IOException



1. IOException
    - Son las excepciones relacionadas a la entrada de
    datos.
    - Ocurren en situaciones como:
        - Lectura o escritura de archivos (texto, imagenes, 
        registros, etc).
        - Modificación de archivos.
        - Comunicación con bases de datos
        u otros dispositivos de entrada/salida.
    - Las exepciones de tipo IO el compilador me obliga a manerjarlas
    si o si con el bloque try/catch y usando la clausula throws, 
    - Las runtime exeption no, ni aunque el programa se detenga, 
    no me obliga a mejarlas.  




2. try/catch
    - Son dos bloques de codigo, usados en el 
    manejo de exepciones
    - Try es bloque en donde si intentara ejecutar
    nuestro codigo que podria generar una exepcion.
    - Catch es el bloque de codigo que se ejecutara
    en caso de que el codigo del bloque try haya tenido 
    un error. 
    - Estos dos bloques en conjunto sirven para evitar 
    que el programa se detenga en caso de haber una 
    exepcion. 



3. Finally 
    - Este es otro bloque de codigo va de la mano
    con try/catch.
    - este codigo siempre se ejecutara no importa si
    haya ocurrido un error o no. 
    - Se utiliza comúnmente para realizar tareas de limpieza,
    como cerrar archivos, liberar recursos o cerrar conexiones 
    a bases de datos.
    - Siempre se ejecuta al final, de ahi su nombre.



4. E.printStackTrace();
    - Muestra informacion mas detallada y precisa sobre 
    la exepcion. 
    - Imprime el tipo de excepción, el mensaje de error 
    y la pila de llamadas (es decir, en qué parte del código ocurrió el error).
    - Es muy útil para identificar y depurar
     errores durante el desarrollo.



5. El metodo bufferedImage read
hace throws IOException
    - Esto me obliga a desarrollar el 
    e.printStackTrace()



7. Las IOExepcion deben ir dentro de un bloque try/catch
    - Si, el compilador obliga a definirle un try/catch
    - Esto es asi porque son exepciones de tipo checked exeption



8. Cheched exeption 
    - Es cuando un codigo te obliga a usar desarrollar una 
    exepcion
    - El compildor sabe que ese codigo podria llegar a 
    generar una exepcion y te obliga a desarrollar la 
    misma. 

9. Que es throws
