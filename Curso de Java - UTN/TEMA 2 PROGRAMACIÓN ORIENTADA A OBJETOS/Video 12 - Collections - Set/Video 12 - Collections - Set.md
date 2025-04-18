Video 12 - Collections - Set



1. Que es una colleccion de tipo set 
    - Es una estructura de datos, que 
    permite almacenar datos de forma agrupada.
    - Permite agregar elementos de manera indefinida 
    (hasta donde lo permita la memoria).
    - No admite elementos duplicados. 
    Cada elemento debe ser único.
    - No se maneja con índices, a 
    diferencia de listas como ArrayList.


2. Como funcionan las listas de tipo set
    - No admiten elementos repetidos
    - No tienen indices
    - Pueden llegar a tener un orden 
    dependiendo de que lista de tipo 
    set se use:
        - HashSet no garantiza orden.
        - LinkedHashSet mantiene el orden de inserción.
        - TreeSet ordena los elementos automáticamente.
        según su orden natural o un comparador.




3. Cuales son las colleccione de tipo set -- ver bien esto
    - Hashset:
        - No garantiza ningún orden en los elementos.
        - Es rápido para operaciones como agregar,
         eliminar y buscar.
    - LinkedHashSet: 
        - Mantiene el orden en que los elementos
        fueron insertados.
        - Tiene un rendimiento un poco menor que HashSet, 
        pero más predecible por el orden.
    - TreeSet: 
        - Ordena los elementos automáticamente 
        (por orden natural o usando un comparador).
        - Es más lento que los otros dos, 
        ya que debe mantener el orden todo el tiempo.




4. Set es una interfaz?
    - Si, set es una interfaz, que hereda de la interfaz 
    collection. 
    - Define el comportamiento de colecciones que no
     permiten elementos duplicados.
    - De la interfaz set derivan varias clases como:
        - HashSet
        - LinkedHashSet
        - TreeSet



5. No puedo crear instancias de tipo interfaz 
    - No, no esta permitido.
    - Si, se puede crear una variable de referencia.
    de una interfaz y asignarle un objeto de una clase.
    - Es polimorfismo con interfaces.



6. Hash set --ver bien esto
    - Es rapido.
    - Sin orden.
    - No se puede acceder aleatoriamente.
    - No hay datos duplicados.

7. Como hace para saber el hastset cuando un elemento 
esta repetido 



8. Tabla hash que es? -- ver esto bien 
    - Es una tabla que forma parte de las 
    estructuras de datos de tipo set como:
        - HashSet, HashMap y Hashtable.
    - En esta tabla se van agrupando todos los 
    elementos de las listas hash por medio de 
    su hashcode().
    - Cada elemento se ordena en una fila (bucked)
    dependiendo de su hashcode.
    - Si dos elementos tienen un hashcode 
    cercano, estos se ubican en una misma
    fila y se usa el metodo equals() para 
    saber cual valor va primero en esa fila.
    - Esta tabla se usa para que en las 
    listas de tipo hash, no admitan elementos repetidos.
    - Sirven para buscar, eliminar y agregar elementos 
    mas rapido.
    - A diferencia de una ArrayList que recorre todos los elementos para buscar uno, las estructuras basadas en tabla hash acceden directamente al bucket correspondiente, lo que mejora el rendimiento.




9. La clase que voy a usar en la lista
tiene que tener definido en metodo 
hashCode() y Equals()
    - Si se trabaja con una lista de 
    tipo hash, si, tiene que tenerlo 
    definido.
    - Estos métodos permiten:
        - Detectar elementos duplicados.
        - Ubicar elementos correctamente. 
        en la tabla hash.
    - Si no se definen, a la hora de usar. 
    listas de tipo hash pueden tener 
    comportamientos inesperados:
        - Pueden agregarse elementos repetidos.
        - No se podria eliminar o encontrar un 
        elemento que este dentro de la coleccion.


10. Three Set 
    - Tiene un orden. 
    - No admite repetidos.



11. Diferencia entre Tree set y hash set 
    - El treeset es una estructura de datos 
    que implementa lnterfaz set
    - El treeset por defecto al implementar
    set, no admite elementos repetidos
    - El treeset ordena los elementos de la lista
    bajo algun criterio.
    - El treeset no usa una tabla hash, maneja una 
    estructura interna de arbol. 
    - El hash set usa la tabla hash
    - El hash set no ordena los elementos.


12. Compare to que es?
    - Es un metodo que permite 

13. Maneja elementos no repetidos y sin indices


14. Si puedo crear intancias de las clses, como
hash set por ejemplo


15. Como se ubican elementos dentro de la 
tabla hashset, usa equals()?


16. Las clases con las que trabaje deben tener definido el 
metodo equals() y hashcode()


17. ¿Por que el equals de la profe es diferente al que se 
me crea a mi?


18. ¿Nodo en un tree set que es?


19. ¿Cuando uso treeset y hashset?


20. Que es un bucket en una lista hashset?
