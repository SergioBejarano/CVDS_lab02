# CVDS_lab02

## LA HERRAMIENTA MAVEN

La herramienta [Apache Maven](https://maven.apache.org/what-is-maven.html) se usa para gestionar y manejar proyectos de software. La base de maven para un proyecto es el concepto de un modelo de objeto de proyecto (POM), Maven puede gestionar la compilación, los informes y la documentación de un proyecto a partir de este modelo, que se concreta en el archivo `pom.xml`.

### ¿Cuál es su mayor utilidad?

Maven proporciona un modelo coherente para la configuración del proyecto, la gestión de dependencias, y la automatización de tareas comunes como la compilación, la prueba y la generación de informes. Esto permite a los desarrolladores centrarse en el código en lugar de preocuparse por los detalles específicos del proceso de construcción.

### Fases de maven

- **validate**: Valida que el proyecto esté correctamente configurado.
- **compile**: Compila el código fuente del proyecto.
- **test**: Ejecuta las pruebas unitarias.
- **package**: Empaqueta el código compilado en un archivo distribuible, como un JAR.
- **verify**: Realiza verificaciones adicionales, como comprobaciones de calidad.
- **install**: Instala el paquete en el repositorio local para su uso en otros proyectos.
- **deploy**: Copia el paquete a un repositorio remoto para compartirlo con otros desarrolladores.

### Ciclo de vida de la construcción

El ciclo de vida de construcción en Maven se refiere a la secuencia de fases a través de las cuales Maven pasa para construir un proyecto. Cada fase está asociada con una serie de tareas específicas que se deben realizar. El ciclo de vida de construcción incluye tres ciclos principales:

- **default**: Maneja el proceso de construcción del proyecto.
- **clean**: Maneja la limpieza de los archivos generados por la construcción anterior.
- **site**: Maneja la generación de documentación del sitio.

### ¿Para qué sirven los plugins?

### ¿Qué es y para qué sirve el repositorio central de maven?
