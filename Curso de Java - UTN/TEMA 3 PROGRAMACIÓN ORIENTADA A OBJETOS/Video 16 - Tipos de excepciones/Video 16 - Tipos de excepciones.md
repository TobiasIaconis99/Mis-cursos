Video 16 - Tipos de excepciones


1. Tipos de excepciones 
    - Son clases: En java las exepciones de son clases que se 
    usan para el manejo de errores para el manejo de los errores.
    - Throwable: Todas estas clases heredan de la clase Throwable que se divide 
    en dos clases principales. 
        - Error: representa errores graves del sistema (como problemas 
        de hardware o del entorno de ejecución). No se pueden manejar fácilmente ni se recomienda hacerlo.
        - Exception: Errores en tiempo de ejecucion, estos si pueden ser controlados
        dentro de esta clase existen:
            - IOException: Errores de entrada y salida de datos, como leer o esbribir 
            archivos o leer datos de una base de datos.
            - RuntimeException: Son los errores comunes en tiempo de ejecucion.


2. Objetos de cada clase de error
    - 

3. Manejar una excepcion.
    - Manejar una exepcion, capturar el error de ejecucion 
    especifico y hacer que el programa tome una determinada 
    accion frente a ese error.
    - Esto se logra mediante los bloques try/catch y finally opcionalmente. 
    - Si no manejo la exepcion al presentarse ese error,
    el programa deja de ejecutarse y muestra un mensaje de error. 



4. Ejemplo de IOExcepcion y RunTimeExepction 
    - Las IOExepcion son exepciones relacionadas a:
        - Son excepciones relacionadas con la entrada y salida de datos,
        es decir, errores al leer o escribir archivos, 
        o al comunicarse con una base de datos.
    - Las RunTimeExepcion son los errores comunes como la 
    aritmetical exepcion, FormatExepcion, etc. 



5. Excepcion es una clase
    - Todas las exepciones son hijas de la clase Throwable 
        Object
          └── Throwable
                 ├── Error                ← Errores graves que no se deben manejar
                 └── Exception            ← Errores que sí se pueden manejar
                     ├── IOException     ← Entrada/salida de archivos, bases de datos, etc.
                     └── RuntimeException← Errores comunes en tiempo de ejecución