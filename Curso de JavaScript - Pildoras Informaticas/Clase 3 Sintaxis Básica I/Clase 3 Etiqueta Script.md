Sintaxis Básica I Ubicacion del codigo



1. ¿Que es el script?
Es una etiqueta te permite escribir codigo js en ella, tambien sirve para poner links 
a archivos externos con extension js




2. Diferentes lugares para ubicar el script 
 -En el head:
    Es util cuando queremos que se ejecuten algunos procesos js antes de renderizar la pagina
    es decir el contenido HTML  

    desvenja: primero se ejecuta el contenido js, haciendo que sea un poco mas lento el 
    renderizado de la pagina 
 -En el body
    
 -Debajo del body 
    es util cuando queremos que se renderize la pagina por completo y despues queremos ejecutar 
    el contenido js 

 ¿Cual es el mejor lugar?
 El mejor lugar es debajo del body o antes de su etiqueta de cierre.
 ¿Por que? 
 porque asi se renderiza primero el codigo html y no se queda en pausa


 


3. ¿En que afecta colocarlo en un lugar o en otro?
    Dependiendo de la situaion lo mejor es colocarlo en 
    un lugar o en el otro.
    Si por ejemplo queremos que el codigo js se ejecute antes de renderizar 
    la pagina, o si queres queremos que primero se renderizen algunos 
    elementos y despues ejecutar el codigo js, o si bien preferimos que 
    primero se renderize la pagina entera y despues queremos que se ejecute el 
    codigo js, dependiendo del lugar donde lo ubiques puedo afectar el 
    rendimiento de la pagina. Depende la necesidad del momento 

3. a-Que es async y defer


4. Que es el alert()
- Es una funcion que ya viene con js, sirve para mostrar un cartel de alerta con un mensaje personalizado.
- Es una ventana emergente, no un modal, y ademas detiene la ejecucion del programa hasta que el usuario interactua con el 
- No se puede personalizar su diseño ni agregar botones en el

ejemplo:
alert("¡Esto es una alerta!");
console.log("Este mensaje no se mostrará hasta que cierres la alerta.");



5. El navegador lee las lineas de arriba a abajo
Si, el navegador lee en lineas de arriba hacia abajo, y va interpretando el codigo 
HTML, CSS Y JS de arriba hacia abajo y con eso crea el DOM 


6. El codigo js se ejecuta diferente en cada navegador (me falta esto)

algun ejemplo


7. Que es una ventana modal
- Es una ventana emergente que aparece sobre la pagina
o contenido principal diseñada con Css 


8. ¿Que significa que por ejemplo el alert() detiene el flujo de ejecucion?
- Significa que cuando usamos un alert() la ejecutcion del codigo se detiene ahi 
hasta que el usuario interactur con la ventana, y es ahi cuando sigue el flujo de 
ejecucion 



9. ¿Que es renderizar?
- Renderizar quiere decir dibujar, es el proceso por el cual se interprete el codigo html, css y js 
  y se dibuja

10. ¿Por que las imagenes grandes tardan mas en renderizarse? (Me falta esto)


11. console.log() es una alternativa a alert()?
- Porque con un alert() podemos mostrar un contenido por pantalla


12. ¿Que es el intellysence? y para que sirve?
- El intellysence es cuando un entorno de desarrollo te sugiere codigo, cuando escribes 
- La ventaja de esto es que se puede codear mas rapido 
- Y al sugerirte codigo se evitan errores


13. Se puede poner contenido <script><script> dentro de una etiqueta HTML 
<h1><script>document.write("hola mundo");<script><h1>
- Si, pero no es para nada recomendable 


14. Como incluir en archivo js externo
- Usando la etiquta <script src="ruta/archivo.js"></script>


15. ventajas de tener codigo js en un archivo externo y no en cada pagina 
- La primera es que es que el codigo queda limpio y tengo tanto codigo js 
en un solo archivo.
- La segunda es que solo escribo un codigo una vez y lo puedo reutilizar en las
paginas que necesite, asi me evito escribir el mismo codigo 20 veces o mucho mas 
- Es mas facil de hacerle mantenimiento porque solo cambio una vez en ese archivo
- Mejor rendimiento, reduce el tiempo de carga en los navegadores


1. Etiqueta de tipo script 
- Esta etiqueta sirve para poner codigo js en ella, o para agregar archivos externos js 

2. Dierentes lenguajes de tipo script, cuales son?
- Es todo aquel codigo que se interpreta linea por linea y no se compila 
- Algunos son JS, python:


3. Ya no se usa type="JavaScript" por que?
- Se usaba para especificar que el contenido de la etiqueta <script></script> era js o si 
era de otro lenguaje de script
- Hoy en en dia no se porque el navegdor asume que estamos usando js, pero si usamos otro 
lenguaje de scrip hay que especificarlo


4. ES6 Y modulos que son? (me falta esto)


5. Document.write(), que es y por que se usa? (me falta esto)




