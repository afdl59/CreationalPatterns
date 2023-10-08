# Enunciado actividad 1: Patrones creacionales

Se desea incorporar a un juego una facilidad para crear nuevos personajes que se añaden al conjunto de personajes predefinidos. En el juego, todos los personajes serán instancias de un pequeño conjunto de clases tales como Héroe, Villano.... Cada clase tiene una serie de atributos como nombre, peso, inteligencia, etc. y según sus valores, una instancia de la clase representa a un personaje u otro. Diseña una solución basada en patrones que permita al usuario crear nuevos personajes y seleccionar para cada sesión del juego personajes de una colección de personajes creados. Entregable: UML explicado + código
Conocer y aplicar una herramienta para la implementación de sistemas multiagentes.

## Contexto de la entrega

En esta actividad decidimos implementar los patrones de diseño Prototype y Factory para simular la creación de personajes en un videojuego. Justificamos nuestra desición de usar estos patrones ya que nos brindan la funcionalidad necesaria para poder crear personajes de diferentes tipos y atributos (al final estos personajes comparten las mismas caracteristicas), por lo que de manera secilla podemos delegar la resposabilidad de su creación. Por otro lado es muy común ver el mismo personaje repetido a lo largo de un nivel de un juego, para hacer de  forma más simple la generacion de personajes iguales, Prototype nos permite clonar a partir de un objeto ya existente. En conclusión concideramos que estos dos patrones se complementan adecuadamente para atender la actividad a resolver.

## Para correr el programa, ejecutar desde la carpeta src:
```
javac TestCreationalPatterns.java
java TestCreationalPatterns
```

## Equipo

* Alejandro Figari De Leonardo
* Olivia Araceli Morales Quezada
