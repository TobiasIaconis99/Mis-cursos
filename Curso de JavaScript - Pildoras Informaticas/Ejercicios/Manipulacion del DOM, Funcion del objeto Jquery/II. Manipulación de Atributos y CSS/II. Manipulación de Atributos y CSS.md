Ejercicio 2: Manipulación de Atributos y CSS
Objetivo: Usar .attr(), .removeAttr(), .css(), .addClass(), .removeClass(), .toggleClass()

📌 Tareas a realizar:

1. Cambia el atributo src de una imagen al hacer clic en un botón.

2. Elimina el atributo disabled de un botón deshabilitado.

3. Modifica el color de fondo de un <div>.

4. Agrega una clase CSS a un elemento.

5. Elimina una clase CSS de un elemento.

6. Alterna una clase CSS al hacer clic en un botón.




<img id="imagen" src="imagen1.jpg" alt="Imagen">
<button id="cambiarSrc">Cambiar Imagen</button>

<button id="botonDeshabilitado" disabled>Botón Deshabilitado</button>
<button id="habilitarBoton">Habilitar Botón</button>

<div id="caja" style="width:100px; height:100px; background-color:gray;"></div>
<button id="cambiarColor">Cambiar Color</button>

<p id="textoEstilizado">Texto con estilo</p>
<button id="agregarClase">Agregar Clase</button>
<button id="removerClase">Remover Clase</button>
<button id="alternarClase">Alternar Clase</button>

<style>
    .resaltado {
        color: red;
        font-weight: bold;
    }
</style>

<script>
    $(document).ready(function () {
        // Implementa las funciones aquí
    });
</script>