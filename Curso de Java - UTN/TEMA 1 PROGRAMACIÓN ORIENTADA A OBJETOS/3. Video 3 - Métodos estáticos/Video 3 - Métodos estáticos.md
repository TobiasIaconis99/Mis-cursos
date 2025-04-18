Video 3 - Métodos estáticos


1. ¿Qué es un método estático?
	- Un método estático es similar a un atributo estático.
	- Pertenece a la clase y no a un objeto en particular.
	- Se puede llamar sin necesidad de instanciar un objeto.


2. Como crear un metodo estatico?
	- En el metodo dentro de la una clase
	public static int devolverProximoId(){
		return cont + 1;
	}


3. Cuando usar un metodo estatico?
	- Cuando queremos llamar a una función (método) sin depender de una instancia de la clase.
	- Se invoca directamente desde la clase.


4. Como crear un array
	// Se declara una variable de direccion de tipo array y se le apunta a un objeto de tipo array de 5 elementos
	// Hasta aca solo reservamos espacio en la memoria, cada elemento tiene null
	- articulo [] art = new articulo[5]; 
	// Aqui le asignamos un objeto de tipo articulo al primer elemento del vector 
	- art[0] = new articulo(1, "cola")

5. Como funciona esto
	- Se crea un array de tipo articulo de 5 elementos;
	- A cada elemento del vector se le asigna un objeto de tipo articulo
		articulo [] vArt = new articulo[5];
			vArt[0] = new articulo("Coca");
			vArt[1] = new articulo("Papas");
			vArt[2] = new articulo("Alfajores");
			vArt[3] = new articulo("Gomitas");
			vArt[4] = new articulo("Caramelos");