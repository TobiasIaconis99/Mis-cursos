Video 10 - Equals


1. Que pasa si uso == para preguntarme 
si dos objetos son iguales
	- No funcionaria, el == funciona con variables 
	primitivas.
	- Tengo que usar el metodo equals para esto.
	- El == entre dos objetos compara sus direcciones de 
	memoria. 


2. Que es el metodo equals
	- El metodo Equals() es un metodo que compara
	el contenido de dos objetos del mismo tipo y 
	retorna true, si ambos son iguales 


3. Como hacer para que el metodo equal()
no compare direcciones de memoria de 
los objetos. 
	- Sobreescribiendo el metodo Equals() que 
	viene por defecto. 


4. Como funciona esto

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(DNI, other.DNI) && Objects.equals(Nombre, other.Nombre) && id == other.id;
	}


		if (this == obj)
		return true;



5. El metodo equals por defecto compara direcciones
de memoria. 
	- Sí, el método Equals() por defecto compara 
	si dos objetos son la misma instancia en memoria 
	(misma referencia). Para que compare el contenido, 
	es necesario sobreescribirlo.



6. Como hace para saber si el objeto que se le manda
es de la misma clase. 
	- Dentro del metodo Equals() se valida que los objetos
	que se comparan sean de la misma clase.

