# Espotify 🎵

**Tecnólogo en Informática – Maldonado, Uruguay**  
**Curso: Programación de Aplicaciones – 2024**

---

## 🧩 Introducción

Espotify es una plataforma de streaming y almacenamiento de música en línea. Permite a los usuarios suscribirse, buscar canciones, artistas y álbumes, reproducir y descargar música en múltiples dispositivos. Además, incluye funciones de red social: creación de playlists, recomendaciones adaptadas, rankings y opciones para compartir gustos con otros usuarios. Artistas y discográficas pueden gestionar su catálogo, y los administradores cuentan con una interfaz gráfica exclusiva para la gestión del sistema.

---

## 🎯 Objetivos del Proyecto

- Explorar herramientas conceptuales orientadas a objetos para el análisis y diseño de software.
- Aplicar una metodología de desarrollo iterativa e incremental.
- Identificar y solucionar problemas comunes en sistemas de software.
- Dominar un lenguaje de programación orientado a objetos: **Java**.

---

## 🌐 Arquitectura del Sistema

1. **Servidor Central**  
   - Almacena la lógica del negocio y los datos (usuarios, catálogo, artistas).  
   - Expone Web Services (Java EE) para conexión con otros componentes.  
   - Interfaz gráfica de administración con **Swing** (solo administradores).

2. **Servidor Web**  
   - Sirve páginas web y recursos estáticos (HTML, CSS, JS).  
   - Consume Web Services del Servidor Central.  
   - Implementado con **Servlets** y **JSP** sobre **Apache Tomcat**.

3. **Cliente Web**  
   - Navegador estándar que interactúa con el Servidor Web.

4. **Dispositivo Móvil**  
   - App nativa o web móvil que consume funcionalidades vía Web Services.

---

## 🔄 Proceso de Desarrollo

El proyecto se divide en tres iteraciones (más una cuarta fuera de alcance del curso):

- **Tarea 1 (5 semanas):**  
  - Desarrollo del Servidor Central con interfaz **Swing** y base de datos local.  
  - Enfoque administrativo sin accesos de clientes o artistas.

- **Tarea 2 (4 semanas):**  
  - Desarrollo del Servidor Web (Servlets + JSP).  
  - Funcionalidades web sin distribución física.

- **Tarea 3 (3 semanas):**  
  - Implementación de Web Services y despliegue físico distribuido.  
  - Extensión de funcionalidades web y desarrollo móvil básico.

---

## 🛠 Tecnologías Utilizadas

- **Java SE 8**:  
  - Lambda, Stream API, Date/Time API, Optional, default & static methods en interfaces :contentReference[oaicite:1]{index=1}

- **Java EE**:  
  - **Web Services**, **Servlets** y **JSP** para lógica distribuida :contentReference[oaicite:2]{index=2}

- **Apache Tomcat (v9+)**:  
  - Implementa Servlet 4.0 y JSP 2.3 para ejecución en servidor web :contentReference[oaicite:3]{index=3}

- **Swing**:  
  - Framework Java para interfaz gráfica de administración.

- **Base de datos relacional** (MySQL/PostgreSQL).

- **Metodología iterativa e incremental**:  
  - Ciclos de análisis, diseño, implementación y verificación.

---

## 📁 Estructura del Repositorio

