# ABOUT ME

## Perfil interactivo

- Una red social quiere dar la posibilidad a sus usuarios de crear un perfil interactivo dónde
cada usuario pueda compartir su historia, gustos y curiosidades de una forma más dinámica.

- La primera tarea que nos piden és crear una app usando la consola en Java dónde dada la info
de un perfil, la muestre de forma organizada en categorías:

    - My Story.
    - Favorites.
    - Fun Facts.

- Creamos una clase Perfil con las siguientes características:
  
    - name: nombre del perfil.
    - story: historia personal del perfil.
    - hobbies: hobbies del perfil (3).
    - foods: comidas favoritas (3).
    - funFacts: datos curiosos (3).

Aunque estas variables podrian ser finales (según nos indica intelliJ), no vamos a cambiarlas para así
poder modificarals en caso necesario en el futuro.

## Menú (clase Main)

- Creamos un menú para que interactue el usuario, nos mantendremos en el menú mientras el usuario no
seleccione la opción 4. Mientras no lo haga le mostraremos el siguiente menú:

  - [1] Story (se muestra al usuario la historia del perfil y se regresa al menú)
  - [2] Favorites (se muestra al usuario los hobbies y foods del perfil y se regresa al menú)
  - [3] Fun Fact (se muestra al usuario uno de los fun facts, escogido al azar, y se regresa al menú)
  - [4] Salir (se termina el programa)
