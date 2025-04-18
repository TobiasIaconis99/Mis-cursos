Video 11 - Collections - List


1. Que es una colleccion.
    - Es una estructura que permite agrupar varias elementos
    ella. 
    - A la vez, es un interfaz. 
    - De esta interfaz deriaban otras interfaces
    que heredan de collection. 
    - Deriban las interfaces list y set, 
    que a su vez estan tienen su clases.



2. Para que sirve una colleccion. 
    - Sirve para agrupar elementos del mismo
    tipo en una sola estructura, lo que permite
    almacenarlos, recorrerlos, ordenarlos, modificarlos
    y acceder a ellos fácilmente.


3. Cuales son los distintos tipos 
colecciones.
    - List 
    - Set 
    - Queue
    - Sorted set 
    - Map
    - Sorted Map



4. Colecciones de la interfaz list 
    - Array List 
    - Linked list



5. Como funciona el arrayList
    - Lo mas importante de todo, es que admiten elementos duplicados
    en la lista.
    - Es una clase que implementa la interfaz list.
    - Permite agrupar elementos de un mismo tipo. 
    - Al almacenarse en la memoria, estos se almacenan
    de forma contigua, como un array.
    - Es rápida para acceder (lectura), ya que se 
    puede ir directamente a una posición por índice.
    - Puede ser lenta para insertar o eliminar elementos en el medio de la lista, porque se deben mover los elementos siguientes.
    - Si se supera la capacidad interna, se reasigna un nuevo array más grande, lo cual puede afectar el rendimiento al escribir o agregar muchos elementos.
    - Es rápida para agregar o eliminar elementos al final de la lista.




8. Linked list
    - Lo mas importante es que se adminte elementos duplicados
    dentro de la lista.
    - Es un tipo de colleccion e implementa 
    la interfaz list. 
    - Cada elemento (nodo) contiene el dato y una referencia al siguiente nodo (y también al anterior, si es una lista doblemente enlazada).
    - Cada elemento tiene un referencia del siguiente. 
    - Es lento para leer, porque cada elemento esta 
    separado en la memoria.
    - Es rapido para agregar ya que agrega en cualquier parte
    de la memoria.
    - Es rapido para eliminar.



9. Diferencia entre linked list y array list. 
    - Principalmente es que en uno se pueden almacenar
    elementos duplicados y en el otro no. 
    - En un linked list es rapido agregar elementos,
    y en el arraylist no. 
    - En el array list es rapido leer los elementos,
    y en el linked list no.
    - En el array list es lento eliminar un elemento, 
    y en el linked list no. 




10. Eliminar un elemento de una linked list. 
    - La eliminación es rápida, especialmente si ya se tiene una referencia directa al nodo a  eliminar.
    - Al eliminar un elemento, el nodo anterior se enlaza directamente con el siguiente nodo, actualizando sus referencias.
    - No es necesario mover los demás elementos como en un ArrayList, lo que mejora el rendimiento al eliminar.



11. Leer un elemento de un linked list.
    - La lectura es lenta ya que cada elemento de la
    coleccion es disperso por la memoria.
    - Para llegar a un elemento en una posición específica, es necesario recorrer la lista nodo por nodo desde el principio (o desde el final en listas doblemente enlazadas).



12. Agregar un elemento de un linked list.
    - Este es rapido, ya que lo asigna en cualquier
    lugar de la memoria. 



13. Lista doblemente enlazada. 
    - Es una lista en la que cada nodo tiene uanreferencia al 
    nodo anterior y al siguiente. 
    - Esto permite recorrer la lista en ambos sentidos 
    (hacia adelante y hacia atrás).



14. Concecuencias de elegir mal el tipo de lista
para guardar datos.
    - Si yo quiero que en mi lista se guarden elementos repetidos,
    y uso un threeset, no se van a guardar al estar repetidos. 
    - Si no quiero que se guarden, y uso un arraylist estos 
    siempre se van a agregar a la lista.
    - Si elijo ArrayList y necesito insertar muchos
    elementos en el medio o al principio, el rendimiento 
    puede bajar, porque se tienen que mover todos los elementos 
    siguientes.
    - Si uso una LinkedList y necesito acceder mucho por 
    índice, va a ser más lenta, porque necesita recorrer 
    los nodos uno a uno.



15. Interfaz collection 
    - Es una interfaz que permite alcemanar elementos 
    agrupados.
    - De estas deriban mas interfaces y de esas interfaces
    dertiban clases que permiten almacenar los datos
    de forma agrupada.



17. ¿Que es un Nodo?   
    - Es cada elemento en memoria de la lista. 