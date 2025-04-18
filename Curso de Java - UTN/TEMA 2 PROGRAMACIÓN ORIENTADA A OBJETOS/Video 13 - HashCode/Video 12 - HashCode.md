Video 12 - HashCode


1. Que es el hashcode y como funciona?
    - Es un metodo que devuelve el numero de un objeto, 
    este numero vendria a ser como un id.
    - Es un numero unico o casi unico, que se 
    genera a partir del contenio de una variable.
    - Puede aplicarse a objeto.
    



2. Para que sirve el hashcode
    - Sirve para identificar una variable u objeto 
    de forma rápida, ya que el hashcode actúa como 
    un identificador basado en su contenido. 
    - Se utiliza principalmente en estructuras como
    HashMap, HashSet o Hashtable, donde permite buscar, 
    insertar o eliminar elementos de manera eficiente.



3. Con que tipos de datos puedo usar el hashcode 
    - Se puede usar con objetos.
    - No se puede usar con datos primitivos con int, char,
    estos no tienen metodos.
    - Se puede usar con String porque es un objeto, y los 
    objetos si tienen metodos.




4. Que significa un HashCode negativo 
    - No significa nada, hay valores que del hashcode
    que pueden ser negativos.




5. Como se calcula un hashcode 
    - Por medio de un calculo matematico. 
    - Cada clase puede tener su propia logica para
    calcualar un hashcode.
    - Sin importar la lógica que se use, lo importante 
    es que si tengo dos objetos con la misma información, 
    ambos deben devolver el mismo hashCode.



6. ¿Por que una variable de tipo String incorpora el hashcode?
    - Porque String es una clase, no un tipo primitivo.
    - Al ser una clase, hereda el método hashCode()
    de la clase Object.
    - Además, String sobrescribe ese método (@Override) para
    que su hashCode se base en el contenido del texto y funcione 
    bien en estructuras como HashMap o HashSet.



7. ¿Que pasa si quiero mostrar el hashcode de un objeto pero no lo tengo 
sobrescrito?
    - Este va a usar el hashcode que viene por defecto de 
    la clase objett.
    - Este se calcula a partir de la direccion de memoria
    - Como cada objeto tiene una dirección de memoria 
    distinta, aunque dos objetos tengan la misma 
    información, tendrán hashCodes diferentes.