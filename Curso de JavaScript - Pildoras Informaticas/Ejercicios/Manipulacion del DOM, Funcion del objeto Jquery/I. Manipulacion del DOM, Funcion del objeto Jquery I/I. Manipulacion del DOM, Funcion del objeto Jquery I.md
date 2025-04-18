Ejercicio 1: Manipulación del DOM
Objetivo: Usar métodos como .text(), .html(), .val(), .append(), .prepend(), .after(), .before(), .remove(), .empty()

📌 Tareas a realizar:

1. Al hacer clic en un botón, cambia el texto de un <p>.

2. Modifica el contenido de un <div> con .html().

3. Captura el valor de un <input> y muéstralo en una alerta.

4. Agrega un nuevo elemento <li> al final de una lista <ul>.

5. Agrega un nuevo <li> al inicio de la lista.

6. Inserta un botón después del <ul>.

7. Inserta un mensaje antes del <ul>.

8. Vacía el contenido de un <div>.

9. Elimina un elemento de la página.


<p id="parrafo">Texto original</p>
<div id="contenido">Este es un div con contenido</div>
<input type="text" id="entrada" placeholder="Escribe algo">
<ul id="lista">
    <li>Elemento 1</li>
    <li>Elemento 2</li>
</ul>
<button id="cambiarTexto">Cambiar Texto</button>
<button id="modificarHTML">Modificar HTML</button>
<button id="obtenerValor">Obtener Valor</button>
<button id="agregarFinal">Agregar al Final</button>
<button id="agregarInicio">Agregar al Inicio</button>
<button id="agregarDespues">Agregar Después</button>
<button id="agregarAntes">Agregar Antes</button>
<button id="vaciarDiv">Vaciar Div</button>
<button id="eliminarElemento">Eliminar Elemento</button>

<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<script>
    $(document).ready(function () {
        // Implementa las funciones aquí
    });
</script>