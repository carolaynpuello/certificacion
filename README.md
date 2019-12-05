# Automatización Página Kayak

### Descripción y contexto
---
Kayak es un sitio destinado a la compra de vuelos, hoteles y paquetes de viaje a través de Internet. 

### Detalles generales de la implementación

Las tecnologías utilizadas para el desarrollo de las pruebas automatizadas son las siguientes:

Serenity BDD: es una biblioteca de código abierto que pretende hacer realidad la idea de la documentaciÃ³n viva. Ayuda a escribir pruebas de regresión y aceptación automatizadas mÃ¡s limpias y más fáciles de mantener. Serenity también utiliza los resultados de las pruebas para producir informes ilustrados y narrativos que documentan y describen lo que hace la aplicación y cómo funciona. 

Cucumber: es una herramienta que admite el desarrollo guiado por el comportamiento(BDD). Cucumber lee especificaciones ejecutables escritas en texto plano (Gherkin) y valida que el software haga lo que dichas especificaciones dicen. Las especificaciones consisten en mÃºltiples o escenarios de prueba.

Screenplay: es un patrón que permite escribir pruebas de aceptaciÃ³n automatizadas de alta calidad basadas en buenos principios de ingeniería de software, como el Principio de Responsabilidad Ãšnica, el Principio Abierto-Cerrado y el uso efectivo de Capas de Abstracción. Fomenta buenos hábitos de prueba y suites de prueba bien diseÃ±adas que son fáciles de leer, mantener y extender, permitiendo a los equipos escribir pruebas automatizadas más robustas y más confiables con mayor eficacia.

Gradle: es una herramienta de automatización de compilación de código abierto centrada en la flexibilidad y el rendimiento

Java: es un lenguaje de programación de propósito general, concurrente, orientado a objetos, que fue diseñado específicamente para tener tan pocas dependencias de implementación como fuera posible.


### Prácticas de automatización
---
Un proyecto donde se ejemplifica el uso de serenity-screenplay  con cucumber y gradle (hhttps://serenity-bdd.github.io/theserenitybook/latest/serenity-screenplay.html).

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (user_interface) y basicamente se tiene la siguiente estructura a nivel de proyecto de automatización.

+ models: 
    Clases que usan el patrón DTO o relacionadas con el modelo de dominio.

+ tasks: 
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio.

+ interactions: 
    Clases que representan las interacciones directas con la interfaz de usuario.

+ user_interfaces: 
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario.

+ questions: 
    Objectos usados para consultar objetos en la página web.


### Herramientas de automatización utilizadas
---
Se utilizan los IDE Eclipse e IntelliJ para el desarrollo de la automatización. 

### Estrategia de automatización
---
Inicialmente se levantaron los flujos de cada transacción, para conocer el negocio y tener claro qué se debia automatizar.
Una vez claro el alcance se procede con la automatización de las transacciones.

### Requerimientos
---
Por defecto, los tests corren en Chrome, así­ que es necesario tener instalada la última versión del chrome driver y tenerla agregada como una variable en el path del sistema.

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 4.7.

### Para correr el proyecto
---
clean test aggregate es el comando que correrá los tests y generará el reporte en la carpeta /target/site/serenity/
