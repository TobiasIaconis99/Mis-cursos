Video 8 - Interfaces



1. ¿Que es una interfaz?
    - Una interfaz es como una clase, la misma 
    contiene metodos abstactos.
    - Permite implementar dichos metodos en las clases
    necesarias, sin necesidad de herencia.
    - ¿En que momento usarlas?
        - Cuando quiero definir un compartamiento en comun,
        sin necesidad de heredar de una clase base
    - No puede tener atributos. 


2. Que es implementar
    - Cuando queremos que uno o varias clases adquieran 
    ciertos metodos en comun, sin necesidad de herencia 
    - Es una forma de comportamiento compartido, sin herencia. 


3. Como implementar una interfaz en java
    - public class Pajaro implements ICantar{
      }
    - Esto luego obliga a desarrolar los metodos abstractos en
    la clase que los implemente por la interfaz.


4. Diferencia entre heredar e implementar
    - Ambos son bastante parecidos, pero la herencia es 
    cuando yo tengo varias clases y creo uno con atributos 
    y metodos en comun que quiero que tenga cada una, 
    por medio de la herencia puedo hacer que las clases 
    hijas adquiran esos atributos y metodos.
    - La interfaz es bastante parecido, yo creo una interfaz
    y le pongo atributos y metodos, los cuales van adquirir
    las clases por medio de la implementacion, se usa cuando 
    yo quiero que algunas clases adquieran ciertos, metodos 
    en concreto. 
    - La interfaz obliga a definir el comportamiento de los
    metodos dentro de la clase. 



5. ¿Que metodos tiene una interfaz y como es la
sinxtaxis?
    - Los metodos de las interfaces siempre son
    abstractos y de tipo public por defecto
    - La sintaxis es:
    cantar(); o
    public abstract cantar();


6. Como declarar variables en una interfaz?
    int edad = 100;
    equivale a 
    public static final int EDAD_MAXIMA = 100;



7. No hace falta poner public final static en un atributo
    - No, no hace falta, lo tiene por defecto, pero
    funciona igualmente si uno se lo agrega. 



8. Se puede instanciar un objeto de una interfaz?
    - Si, se puede intanciar un objeto de una interfaz



9. Con interfaces puedo hacer una especie de polimorfismo
    - Sí, cuando una clase implementa una interfaz, se puede usar una referencia del tipo de la interfaz para apuntar a un objeto de la clase que la implementa.
    - Esto es una forma de polimorfismo, porque se puede usar una misma referencia (de la interfaz) para manejar diferentes tipos de objetos.

    public interface Animal {
        void hacerSonido();
    }

    public class Perro implements Animal {
        public void hacerSonido() {
            System.out.println("Guau!");
        }
    }

    public class Gato implements Animal {
        public void hacerSonido() {
            System.out.println("Miau!");
        }
    }

    // Polimorfismo:
    Animal miAnimal = new Perro();
    miAnimal.hacerSonido(); // Imprime "Guau!"




10. Cuando usar una interfaz
    - Cuando quiero definir un conjunto de métodos 
    que deben ser implementados por ciertas clases, 
    permitiendo así que compartan un comportamiento 
    común sin necesidad de herencia.



11. Puedo implementar mas de una interfaz en la misma clase?
    - Sí, una clase puede implementar múltiples interfaces al mismo tiempo, lo cual permite que herede comportamientos de distintas fuentes sin las limitaciones de la herencia múltiple de clases.
    - Public class Profesor implements Persona, enseñar
    {}



12. Las interfaces por defecto son abtractos
    - Las interfaces no, pero sus metodos si 



13. Y los atributos por defecto son publicos, costantes y estaticos. 
    - Si, a la hora de declarar un metodo en una interfaz no hace
    falta poner:
    public static final int edad;
    sino:
    int edad;



14. No se pueden declara objetos de interfaces 
    - No, no se puede instanciar directamente una interfaz porque es abstracta por naturaleza.
    Sin embargo, sí se puede declarar una variable de tipo interfaz y asignarle un objeto de una clase que la implemente.
    - Como es abstracto no se puede instaciar.


15. Puedo guardar un objeto de una clase dentro de una interfaz, 
siempre que la clase del objeto implemente dicha interfaz 
    - Sí, siempre que la clase implemente esa interfaz.
Podés crear una variable de referencia de tipo interfaz y asignarle un objeto de una clase que implemente dicha interfaz. Esto permite trabajar con polimorfismo.
    - Puedo polimorfismo con esto.