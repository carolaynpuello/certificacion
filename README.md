# Automatización Página Choucair

### Descripción y contexto
---
Choucair es una compañía colombiana pionera en software testing creada en 1999 con proyección internacional, la cual ofrece servicios relacionados con pruebas de software para disminuir los riesgos de su operación.

### Detalles generales de la implementación

Las tecnologías utilizadas para el desarrollo de las pruebas automatizadas son las siguientes:

Serenity BDD: es una biblioteca de código abierto que pretende hacer realidad la idea de la documentación viva. Ayuda a escribir pruebas de regresión y aceptación automatizadas más limpias y más fáciles de mantener. Serenity también utiliza los resultados de las pruebas para producir informes ilustrados y narrativos que documentan y describen lo que hace la aplicación y cómo funciona. 

Cucumber: es una herramienta que admite el desarrollo guiado por el comportamiento(BDD). Cucumber lee especificaciones ejecutables escritas en texto plano (Gherkin) y valida que el software haga lo que dichas especificaciones dicen. Las especificaciones consisten en múltiples escenarios de prueba.

Page Object Model: El page object model es un patrón de diseño de objetos, donde las páginas web se representan como clases y los diversos elementos de la página se definen como variables en la clase. Todas las interacciones de usuario posibles se pueden implementar como métodos en la clase.


Gradle: es una herramienta de automatización de compilación de código abierto centrada en la flexibilidad y el rendimiento

Java: es un lenguaje de programaciÃ³n de propósito general, concurrente, orientado a objetos, que fue diseñado específicamente para tener tan pocas dependencias de implementación como fuera posible.


### Prácticas de automatización
---

Los tests en el proyecto de automatización contienen la siguiente estructura, basada en el Page Object Model:
 
+ user_interfaces: 
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario.

+ features: 
    Archivos escritos en lenguaje Gherkin y tienen plasmados los casos de prueba.

+ steps: 
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio.

+ steps definitions: 
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio.


### Herramientas de automatización utilizadas
---
Se utiliza el IDE Eclipse para el desarrollo de la utomatización. 

### Estrategia de automatización
---
Inicialmente se levantaron los flujos de cada transacción, para conocer el negocio y tener claro qué se debia automatizar.
Una vez claro el alcance se procede con la automatización de las transacciones.

### Requerimientos
---
Por defecto, los tests corren en Chrome, así que es necesario tener instalada la versión 78 del chrome driver y tenerla agregada como una variable en el path del sistema.

Para correr el proyecto se necesita JDK 1.8 y Gradle preferiblemente con la versión 4.7.

### Para correr el proyecto
---
clean test aggregate es el comando que correrá los tests y generará el reporte en la carpeta /target/site/serenity/
