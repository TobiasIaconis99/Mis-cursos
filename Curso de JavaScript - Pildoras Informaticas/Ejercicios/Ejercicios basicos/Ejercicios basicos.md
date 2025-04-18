Ejercicios Básicos (Manipulación del DOM)
1. Cambiar el contenido de un elemento
    - Al hacer clic en un botón, cambia el texto de un párrafo. --ok


2. Manipulación de estilos
  - Cambia dinámicamente el color de fondo y el tamaño de fuente de un div al hacer clic en botones diferentes.


3. Mostrar/Ocultar elementos con animaciones

Crea botones para alternar la visibilidad de un div con efectos fadeIn(), fadeOut(), slideUp(), slideDown().
Alternar entre clases CSS

Usa .toggleClass() para cambiar la apariencia de un div con cada clic.
Modificar atributos de elementos

Crea un botón que cambie la imagen de un <img> dinámicamente.
Deshabilitar y habilitar botones o inputs

Al marcar un checkbox, un input de texto debe deshabilitarse o habilitarse.
Copiar contenido de un input a otro automáticamente

Al escribir en un input, su contenido debe reflejarse en otro input en tiempo real.




<button id="mostrarAlerta">Mostrar Alerta</button>

<p id="textoHover">Pasa el mouse sobre mí</p>

<div id="panel" style="width:100px; height:100px; background-color:blue;"></div>
<button id="ocultarPanel">Ocultar</button>
<button id="mostrarPanel">Mostrar</button>

<button id="deslizarArriba">Deslizar Arriba</button>
<button id="deslizarAbajo">Deslizar Abajo</button>

<div id="cuadro" style="width:50px; height:50px; background-color:red; position:absolute;"></div>
<button id="moverDerecha">Mover a la Derecha</button>

<script>
    $(document).ready(function () {
        // Implementa las funciones aquí
    });
</script>




