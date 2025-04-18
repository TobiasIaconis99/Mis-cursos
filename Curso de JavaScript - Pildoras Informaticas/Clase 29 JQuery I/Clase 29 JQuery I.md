Clase 29 JQuery I

1. ¿Que es jquery? y para que sirve?
    - Jquery es una libreria de js, es de las mas conocidas y usadas
    - Esta proporciona funciones predefinidas que facilitan la manipulacion del DOM y el manejo de eventos
    - Facilita o brida la comunicacion al backend y que ofrece funciones como $Ajax 
    para poder hacerlo. 
    - Brinda animacioes sin tener que usar CSS
    - Agiliza el desarrollo, ya que proporciona funciones predefinidas que hacen muchas tareas



2. Razones para usar Jquery antes que codigo js comun 
    - Se agiliza el desarrollo al no tener que codear todo de cero 
    - Al usar funciones ya testeadas y optimizadas, se reduce la posibilidad de errores al programar manualmente.
    - jQuery maneja automáticamente las diferencias entre navegadores, asegurando que el código funcione correctamente en la mayoría de ellos.
        Ejemplo de compatibilidad:
        Si necesitas agregar un evento click en JavaScript puro, tendrías que preocuparte por compatibilidades:

        document.getElementById("miBoton").addEventListener("click", function() {
            alert("¡Hola!");
        });

        - tengo entendido que esto hoy en dia es casi ixexistete ya que los navegadores modernos, soportan codigo js comun



3. Que otras librerias de js existen ademas de jquery
    - Prototype
    - Mootools 
    - Dojo
    - Yahoo User Interface
    - Axios 🔗 → Realiza peticiones HTTP de forma sencilla (alternativa a fetch).
    - D3.js 📊 → Para visualización de datos y gráficos avanzados.
    - Chart.js 📈 → Para crear gráficos interactivos más fácilmente.
    - Three.js 🎮 → Para gráficos en 3D con WebGL.
    - Anime.js 🎬 → Para animaciones avanzadas en la web.



4. Como es que funciona el linkear un cdn, como es que tengo acceso a todo por medio de un link
    - Al linkear un cdn de js por ejemplo con la etiqueta script src="" estamos cargando un archivo js desde un servidor externo al proyecto
    - Accedemos a todas las funciones y codigo js que tenga ese archivo sin tener que descargarlo
    - Archivo local:
        - Ventaja: Funciona sin conexión a internet.
        - Desventaja: Puede aumentar el tamaño del proyecto y no aprovechar la caché de otros sitios web.
    - Por CDN (Content delivery network):
        - Ventajas:
            Carga más rápida gracias a servidores optimizados.
            Puede estar en la caché del navegador si ya se ha cargado desde otro sitio.
        - Desventajas:
             Dependemos de que el servidor CDN esté disponible. Si falla, el código no funcionará.
             Para eso lo mejor es 


        Conclusión: Usar un CDN mejora la velocidad y optimización del sitio, 
        pero es recomendable incluir un fallback local por si el servidor externo deja de funcionar.

        - Fallback: 
        Es cuando usamos un cdn para incluir un archivo al proyecto y 
        como respaldo a que este falle usamos el uno local descargado 

        <script>
            if (typeof jQuery == 'undefined') {
                document.write('<script src="js/jquery-3.6.0.min.js"><\/script>');
            }
        </script>


    - si el archivo este en la carpeta del proyecto accedemos a el directamente
    - Si esta en un servidor accedemos al el mediante el link cdn, accedemos al archivo que esta en el servidor 
    la desventaja de esto es que dependemos del servidor, y si este no funciona, el codigo no funcionara

5. Caracteristicas de jquery 
    - Soporta multiples navegadores 
    - Es codigo que esta ampliamente testeado 
    - Facilita el desarrollo al no tener que codear en muchas cosas que ofrece 
    - Es muy ligera para el proyecto 100kb aprox 
    - Css friendly 
    - Gran comunidad de soporte 
    - Numerosos plugin que realizan las tareas mas frecuentes
    - Integración fácil con CSS 
        Permite modificar estilos y clases CSS con métodos como .css(), .addClass() y .removeClass().
        Se puede seleccionar elementos usando selectores CSS avanzados.


6. Libreria ampliamente testeada
    - Ha sido probada por una gran comunidad de desarrolladores
    - El código está muy depurado y optimizado
    - Las actualizaciones y parches son frecuentes


7. Gran comunidad de soporte 


8. Como agregar una libreria jquery al projecto 
    - Tienes 2 formas:
    - Por CDN
    - Por un archivo local 


9. Es recomendable que simpre el codigo js, este despues del css 
    - Es recomendable que el codigo css este en el head y el codigo js antes del </body>
    - Esto es asi porque asi se renderiza la pagina primero
    - Si se póne el codigo js primero puede realintizar el renderizado al ejecutarse este primero 
    - Los estilos deben cargar primero, esto es para que cuando se renderizen las etiquetas se les aplique el css
    de inmediato a cada una 
    - Evitar bloqueos en la renderizacion 


10. usar codigo js con un script en el head, pero con un $document.ready()
    - Probar el fadein para el body

11. Ver el jquery por dentro 



