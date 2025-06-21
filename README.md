Espotify 🎵
Tecnólogo en Informática – Maldonado, Uruguay
Curso: Programación de Aplicaciones – 2024

Introducción
Espotify es un sistema de streaming y almacenamiento de música en línea diseñado como proyecto final del curso. Permite a usuarios suscribirse, buscar canciones, artistas y álbumes, reproducir y descargar música en diversos dispositivos. Además, ofrece funciones tipo red social: creación de playlists, recomendaciones personalizadas, rankings y la posibilidad de compartir preferencias con otros usuarios. Artistas y discográficas podrán gestionar su catálogo, mientras que los administradores cuentan con una interfaz dedicada para la gestión global del sistema.

Objetivos del Curso
Uso avanzado de herramientas conceptuales orientadas a objetos para análisis y diseño de software.

Aplicación práctica de una metodología de desarrollo (iterativa e incremental).

Detección y resolución de problemas comunes en proyectos de software.

Introducción y profundización en un lenguaje de programación orientado a objetos (Java).

Arquitectura del Sistema
El diseño propuesto incluye cuatro componentes principales y dos servidores:

Servidor Central

Lógica y datos centrales (catálogo, usuarios, artistas, etc.)

Exposición de servicios mediante Web Services en Java EE.

Interface gráfica de gestión con Swing (solo para administradores).

Servidor Web

Publica la capa web (sitio, JS, CSS, imágenes).

Consume los Web Services del Servidor Central.

Implementado con Servlets y JSP sobre Apache Tomcat.

Cliente Web

Navegador estándar que consume la web y funcionalidades del Servidor Web.

Dispositivo Móvil

App nativa o web móvil que consume funcionalidades del Servidor Central (Web Services).

Proceso de Desarrollo
El desarrollo se realiza en tres iteraciones, seguidas de una cuarta etapa de despliegue (fuera de alcance del curso):

Iteración 1 (5 semanas):

Servidor Central + GUI Swing + persistencia en base de datos.

Enfoque administrativo sin acceso de clientes o artistas.

Iteración 2 (4 semanas):

Desarrollo del Servidor Web con lógica local (JSP + Servlets).

Primera versión de acceso web sin distribución física.

Iteración 3 (3 semanas):

Distribución física real (Web Services entre nodos).

Extensión de funcionalidades web y despliegue en móvil básico.

Tecnologías Utilizadas
Java SE 8

Lambda expressions, Stream API, Date/Time API, interfaces por defecto, Optional, entre otros 
de.wikipedia.org
docs.oracle.com
+2
tomcat.apache.org
+2
blogs.oracle.com
+2
tpointtech.com
+11
geeksforgeeks.org
+11
javaguides.net
+11

Java EE (Servlets, JSP, Web Services)

Implementación de lógica empresarial distribuida.

Apache Tomcat

Servidor de aplicaciones: versión estable 9.x o superior (Java EE 8+) 
tomcat.apache.org
+1
tomcat.apache.org
+1

Swing

Framework de escritorio para la interfaz administrativa.

Persistencia de datos

Base de datos relacional (MySQL, PostgreSQL o similar, a especificar).

Metodología Iterativa e Incremental

Basada en UML, patrones, con ciclos de análisis, diseño, implementación y verificación por iteración.


