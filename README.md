# competiciones
Proyecto de la universidad donde se realiza una competicion en diversos circuitos, con distinto pilotos,
coches, escuderias y organizacion.

Lo que se realiza en este proyecto por partes es lo siguiente:
  1. Los circuitos tienen sus propias caracteristicas, para ello utilizamos un patron de diseño decorator,
     asi podremos añadir tantas caracteristicas como queramos.
  2. Los coches se dividen en distintos tipos, coche rapido y coche resistente, para ello realizamos el
     patron de diseño Factory.
  3. Los pilotos estan repatidos po0r piloto novato, piloto experimentado y piloto estrella, y ninguno
     podra ser un piloto asecas.
  4. Por ultimo tenemos las escuderias donde tendremos los distintos coches y pilotos de cada una de ellas
     y la organizacion (esta debe ser unica, por tanto utilizamos el patron de diseño Singleton) donde se
     tendrá que realizar todo lo que se quiera dentro de la competicion.

Con todos los puntos dicho, hay 3 tipos de demostraciones en las que cada una sale reflejado una competicion
completada ( hay ganadores y se corren todos los circuitos), competicion con fin prematuro ( solo uno no es descalificado), y la competicion desierta ( todos fueron descalificados antes de acabar el campeonato).
