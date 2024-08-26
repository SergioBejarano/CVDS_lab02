# CVDS Lab02
## LA HERRAMIENTA MAVEN

  ### **¿Cuál es su mayor utilidad?**
  La mayor utilidad de Maven es automatizar y simplificar el proceso de construcción de proyectos Java, 
  estandarizar las configuraciones de construcción y administrar las dependencias de manera eficiente. 

  ### **Fases**
  - **validate:** valida que el proyecto es correcto y que toda la información necesaria está disponible.
  - **compile:** compila el código fuente del proyecto.
  - **test:** prueba el código fuente compilado utilizando un marco de pruebas unitarias adecuado.
  - **package:** toma el código compilado y lo empaqueta en su formato distribuible.
  - **integration-test:** procesa y despliega el paquete, en un entorno donde se puedan ejecutar pruebas de integración.
  - **verify:** ejecuta cualquier verificación para asegurar que el paquete es válido y cumple con los criterios de calidad.
  - **install:** instala el paquete en el repositorio local para ser utilizado como una dependencia en otros proyectos localmente.
  - **deploy:** se realiza en un entorno de integración o de liberación.

  ### **Ciclo de vida de la construcción**
  - **default:** Maneja la implementación del proyecto. Incluye fases como *compile*, *test*, *package*, *install*, y *deploy*.
  - **clean:** Maneja la limpieza del proyecto eliminando archivos generados en compilaciones anteriores. Incluye la fase *clean*.
  - **site**: Maneja la generación de documentación del proyecto. Incluye fases como *site* y *site-deploy*.  

  ### **¿Para qué sirven los plugins?**
  Los plugins de Maven son componentes importantes que permiten realizar tareas específicas durante las fases del ciclo de 
  vida de la construcción. Estos complementos mejoran la funcionalidad de Maven y realizan tareas como:

  - Compilar código *(maven-compiler-plugin)*.
  - Ejecutar pruebas *(maven-surefire-plugin)*.
  - Generar JARs o WARs *(maven-jar-plugin, maven-war-plugin)*.
  - Documentar el proyecto *(maven-site-plugin)*.
  - Gestionar dependencias *(maven-dependency-plugin)*.

  ### **¿Qué es y para qué sirve el repositorio central de Maven?**
  El repositorio central de Maven es un gran repositorio público que contiene una gran cantidad de librerías y dependencias 
  que pueden ser necesarias para los proyectos Java. Su principal función es proporcionar un punto de acceso común para 
  las bibliotecas y componentes necesarios, lo que facilita la gestión de dependencias sin que los desarrolladores necesiten 
  incluir manualmente los archivos JAR en sus proyectos.

## CREAR UN PROYECTO CON MAVEN
- ***Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes).***

    Se usa el comando:
    ```sh
    mvn archetype:generate
    ```
    Lo que genera un proyecto de manera interactiva, por lo que será necesario especificar datos como:
    - Id del grupo.
    - Id del artefacto.
    - Paquete(s).
    - Arquetipo y su version.
  

- ***Busque cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype".***

    Se usó el comando anteriormente mencionado y se usaron los parámetros especificados para la creación del proyecto.

    [Proyecto Maven](https://drive.google.com/uc?export=view&id=1JtM6DZRGB5-e_Y_W5GW6JyZOMgKMDAhQ)


- ***Estructura del proyecto:***
  
  Se cambió al directorio  `Patterns` y se ejecutó el comando `tree` para ver el conjunto de archivos y directorios creados 
  por el comando `mvn`. 
  
  [Estructura](https://drive.google.com/uc?export=view&id=1UXObgTffRdKbguzA9ooxthTxAzLeMhVr)

## COMPILAR Y EJECUTAR
- ***Busque cuál es el objetivo del parámetro "package" y qué otros parámetros se podrían enviar al comando "mvn".***
    
  El objetivo principal del parámetro "package" es tomar el código fuente compilado y empaquetarlo en un formato distribuible, 
  como un archivo JAR, WAR o EAR, entre otros, que sean adecuados para la distribución del proyecto. 
  Algunos de los otros formatos que se pueden enviar al comando "mvn" son:
    - validate
    - compile
    - test
    - integration-test
    - verify
    - install
    - deploy
    - clean
    - site
    - dependency
    - compile
    - install
    - versions


- ***Busque cómo ejecutar desde línea de comandos, un proyecto maven y verifique la salida cuando se ejecuta con la clase 
App.java como parámetro en "mainClass".***

  Se puede ejecutar desde la linea de comandos con:
  ```sh
  java -cp target/Patterns-1.0-SNAPSHOT.jar edu.eci.cvds.patterns.archetype.App
  ```
  Después de ejecutar este comando se muestra la siguiente salida:

  [HelloWorld](https://drive.google.com/uc?export=view&id=15wJkWuStISJJj2dH8tKRjfH2g5umS02R)


- ***Realice el cambio en la clase App.java para crear un saludo personalizado, basado en los parámetros de entrada a la 
aplicación.Utilizar la primera posición del parámetro que llega al método "main" para realizar el saludo personalizado,
en caso que no sea posible, se debe mantener el saludo como se encuentra actualmente:***

  [SaludoPersonalizado](https://drive.google.com/uc?export=view&id=1QiW_ACw__wRRDBLHmERxP6rchhMgqB1G)


- ***Buscar cómo enviar parámetros.***
  
  Es posible enviar parámetros agregándolos al final de la línea de ejecución, estando estos separados por un espacio:
  Se puede ejecutar desde la linea de comandos con:

  ```sh
  java -cp target/Patterns-1.0-SNAPSHOT.jar edu.eci.cvds.patterns.archetype.App param1 param2
  ```
  

- ***Ejecutar nuevamente la clase desde línea de comandos y verificar la salida: Hello World!***

  [SaludoPostCambio](https://drive.google.com/uc?export=view&id=19ioiibvTgNZ66CKTmLvjFboFVuwhGdzK)


- ***Ejecutar la clase desde línea de comandos enviando su nombre como parámetro y verificar la salida. 
  Ej: Hello Pepito!***

  [PruebaNombre](https://drive.google.com/uc?export=view&id=1qVZeKAmbLxot57QBuve1HiLUzoYCaVMh)


- ***Ejecutar la clase con su nombre y apellido como parámetro. ¿Qué sucedió?***

  [PruebaApellido](https://drive.google.com/uc?export=view&id=1tIgSZoZMTXbLnGU7419mPjMYETdnVppM)

  Como se evidencia en la imagen lo que sucedió fue que solo imprimió el nombre y no el apellido.
  

- ***Verifique cómo enviar los parámetros de forma "compuesta" para que el saludo se realice con nombre y apellido.***
  
  Para enviar los parámetros de forma "compuesta" hay que escribir cada uno dentro de comillas, por ejemplo: 
  "Sergio Bejarano" y no Sergio Bejarano.

  ```sh
  java -cp target/Patterns-1.0-SNAPSHOT.jar edu.eci.cvds.patterns.archetype.App "param1 param2"
  ```


- ***Ejecutar nuevamente y verificar la salida en consola. Ej: Hello Pepito Perez!*** 

  [PruebaCompuesto](https://drive.google.com/uc?export=view&id=1uy5RtfPCJt4m-Gq9v0_uCOUQWEfItHjg)

## GITIGNORE
### ¿Para qué sirve gitigonre?

Los proyectos que utilizan Git como sistema de control de versiones utilizan el archivo .gitignore para determinar qué 
archivos o directorios Git debe ignorar. Por lo tanto, los archivos y carpetas que se encuentren en la extensión 
.gitignore no se rastrearán ni incluirán en los commits del repositorio.


### ¿Cómo se esa gitignore?

Hay que crear un archivo .gitignore en la raíz del repositorio o en cualquier subdirectorio. En el se agregan los 
nombres de los archivos y directorios que se desea evitar. Por ejemplo:

- Para ignorar todos los archivos terminados en ".class" sería:
 ```sh
*.class 
 ```

- Para ignorar un directorio específico:
 ```sh
/build/ 
 ```





