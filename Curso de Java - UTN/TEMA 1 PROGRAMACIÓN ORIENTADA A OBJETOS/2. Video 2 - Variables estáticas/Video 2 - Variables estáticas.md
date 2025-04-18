Video 2 - Variables estáticas


1. ¿Como hacer un objeto con id autoincrementable?
    - Crear un atributo en la clase que sea static
    - En los constructores, iNcrementar ++ dicho atributo
    - asignar ese atriburo al id

    public articulo() 
	{
		cont++;
		id = cont;
		nombre = "nombre";
	}
	
	public articulo(String nombre) 
	{
		cont++;
		this.id = cont;
		this.nombre = nombre;
		
	}


2. ¿Que es una variable que a nivel de clase?
    - Es cuando una variable se guarda siempre en la clase 
    y se comparte ese valor con cada instancia de un objeto de 
    esa clase



3. ¿Como se crea una variable a nivel del clase?
    - dentro de la clase ponemos "static", asi:
    private static int cont = 0;

    - static significa que la variable pertenece a la clase, y no 
    a los objetos provenientes de la misma, hace que la variable 
    se comparta en todas las instancias del objeto y no a la clase.


4. ¿Que es una variable static?
    - Es una variable a nivel de clase o estatica, esta mantiene 
    siempre su contenido en la clase, y se comparte por cada instancia
    de un objeto en dicha clase



5. ¿Cuando usar una variable de clase?
    - Cuando necesitemos que el contenido de la misma se mantenga 
    sea compartido en todas las instancias de los objetos, en lugar de 
    tener una instancia en cada copia


6. ¿Por que si yo quiero hacer un id autoincremetable, tengo que hacer que 
el atributo sea de clase y no del objeto?
    - Lo que va a pasar es que el valor no va estar compartido por cada objeto
    