Video 13 - Iterator


1. Iterator.
    - Un iterator es un objeto que permite 
    recorrer cualquier tipo de lista. 
    - Se usa para recorrer elementos uno a uno en 
    una lista y eliminarlos durante el recorrido
    de forma segura. 
    - Funciona con cualquier coleccion que implemente la 
    interfaz collection.
    - Tiene tres metodos principales
        - hasNext(): indica si hay más elementos por recorrer.
        - next(): devuelve el siguiente elemento.
        - remove(): elimina el último elemento devuelto por next().




2. List iterator.
    - Es un iterator, solo que este funciona con listas
    que implementen la interfaz list.
    - tiene distintos metodos que el iterator. 
    - A diferencia del Iterator básico, el ListIterator
    permite recorrer la lista en ambos
    sentidos: hacia adelante y hacia atrás.
    - También permite agregar, reemplazar o
    eliminar elementos durante la iteración.
    - Elementos adicionales:
        - hasPrevious(): indica si hay un elemento anterior.
        - previous(): retorna el elemento anterior.
        - add(E e): agrega un elemento en la posición actual.
        - set(E e): reemplaza el último elemento devuelto por next() o previous().
        - nextIndex() / previousIndex(): devuelven los índices relativos del iterador.



3. Diferecias de un foreach y un iterator.
    - Ambos sirven para recorrer listas
    - El iterator es mas para recorrer una lista 
    elemento a elemento, con la posibilidad de 
    quitar algun elemento en medio del recorrido.
    - El foreach es solo para recorrer la lista. 


4. Diferencia de iterator y list iterator.
    - 

5. Metodo hasnext()
    - Es un metodo del iterator y sirve para 
    saber si la lista tiene otro elemento 
    para leer. 


6. Metodo next()
    - obtiene el elemento actual de lista que se 
    esta recorriendo. 


7. Lista.iterator() esto como funciona
    - como que mi lista puedo devolver un 
    iterator?

8. Metodo remove()


9. Cuando usar un iterator
    - Se usa cuando necesitás recorrer una colección 
    y eliminar elementos mientras la recorrés, 
    sin causar errores como ConcurrentModificationException.
    - Es ideal para colecciones donde no hay
    acceso por índice, como los Set.
    - Te da más control que un for-each, permitiéndote 
    trabajar con cada elemento individualmente y decidir 
    si lo eliminás o no.

    

10. Como usar un iterator
    - Este se usa con while y su metodo hasnext()
    hasta que ya no tenga mas elementos



