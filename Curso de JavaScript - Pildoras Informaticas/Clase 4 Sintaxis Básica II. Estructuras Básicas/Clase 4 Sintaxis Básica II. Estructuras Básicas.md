Clase 4 Sintaxis Básica II. Estructuras Básicas


1. ¿Que es una sentencia? Para que sirve? Son obligatorias en JS?
- Una sentencia es una instruccion js, casi siempre termian ;

    1. a Para que sirve el ;?
    - Sirve para indicar el fin una instruccion (sentencia)
    1. b Es obligatorio?
    - No, no lo es en JS, pero es recomendable ponerla para saber cuando termina una instruccion y evitar errores inesperados
    - Javascrip inserta automaticamente el ; (ASI)



2. ¿Que es una funcion predefinida?
    - Una funcion predefinida es una funcion que ya viene con el lenguaje
    JS y que se puede usar son parte de la API estandar de js, por ejemplo: math.random(); parse.int()

    2. a. ¿Que es una API?



3. ¿Que son los tipos de datos?
    - Los tipos de datos son los diferentes tipos del valor de un dato, por ejemplo,
    la palabra "hola", es un dato de tipo texto, el numero 2 es un dato de tipo numero 
    - Algunos de los tipos de dato son string, bool, int, float, number, null, undefined, simbol


4. Es lo mismo usar "" y ''?
    - En js no hay diferencia entre usar uno u otro pero si tenemos un texto que tiene "" se puede hacer algo asi 'hola "mundo"'



5. ¿Que es texto concatenado?
    - Es unir una cadena con otra, que se hace el signo + o ´texto ${variable}´ 



6. ¿Que es una variable?
    - Una variable es un espacio en la memoria en donde es 
    puede almcenar un dato de un tipo 



7. ¿Que es una memoria volatil?
    - Una memoria volatil es una memoria que almacena los datos de forma temporal 
    como la ram por ejemplo, cuando a esta ya no se la mas energia pierde la informacion 



8. Es mejor usar VAR o LET al declarar una variable?
    - Es mejor usar let por tiene un scope de funcion, de bloque, 
    en cambio var tiene un scope global


8. a - Las variables declaradas en vAR tienen hoisting, se elevan (que es)


9. Reglas a la hora de darle nombre a una variable 
    - empezar con $
    - son case sensitive 
    - no deben ser palabras reservadas 
    - es recomendable que sean descriptivos


10. ¿Que es una palabra reservada?
    - Son palabras que son reservadas del lenguaje y no se puedar usar como nombre de variable 
    yo por ejemplo no puedo declarar una variable con el nombre let o var 



11. Declarar varias variables en una misma linea
    - let puntos, jugadores, ganador o 
      let puntos = 0, jugadores = 5, ganador = "Jugador 1";
    Es recomendable hacer esto cuando son variables relacionadas quizas 
