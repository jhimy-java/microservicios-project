##Proyecto de Microservicios con Spring Boot
Este proyecto forma parte de un curso de introducción a los microservicios, donde se construyó una arquitectura basada en microservicios utilizando tecnologías modernas como Spring Boot, Spring Cloud y herramientas complementarias para la observabilidad, comunicación y resiliencia.

📋 Índice
Introducción
Características del Proyecto
Tecnologías y Herramientas
Estructura de los Microservicios
Configuración del Entorno
Ejecución del Proyecto
Contribuciones
Licencia
📖 Introducción
Este proyecto demuestra cómo construir una arquitectura basada en microservicios que sea escalable, resiliente y de fácil mantenimiento. Durante su desarrollo, se implementaron conceptos clave como la comunicación entre servicios, la gestión de configuración centralizada, balanceo de carga, tolerancia a fallos y tracing distribuido.

🚀 Características del Proyecto
Microservicios Implementados:

Usuario: Gestión de usuarios.
Carro: Gestión de datos relacionados con carros.
Moto: Gestión de datos relacionados con motos.
Comunicación entre Microservicios:

Uso de RestTemplate para llamadas HTTP directas entre servicios.
Uso de Feign Client para simplificar y optimizar la comunicación.
Configuración Centralizada:

Creación de un servidor de configuración basado en Git para administrar las propiedades de los microservicios.
Registro y Descubrimiento de Servicios:

Implementación del servidor Eureka para gestionar la instancia de los servicios y facilitar el descubrimiento dinámico.
Gateway:

Configuración de un API Gateway para enrutar las solicitudes a los microservicios correspondientes y mejorar la seguridad y control de acceso.
Resiliencia y Tolerancia a Fallos:

Uso de Resilience4j para implementar patrones de Circuit Breaker y prevenir fallos en cascada.
Observabilidad y Tracing Distribuido:

Integración de Sleuth y Zipkin para rastrear el flujo de solicitudes entre los microservicios.
🛠 Tecnologías y Herramientas
Lenguaje: Java 17
Framework: Spring Boot
Spring Cloud: Eureka, Config Server, Gateway
Resilience: Resilience4j
Tracing: Sleuth y Zipkin
HTTP Clients: RestTemplate, Feign Client
Sistema de Control de Versiones: Git
Base de Datos: (Si aplica, especificar cuál)
Gestión de Dependencias: Maven o Gradle
Contenedores: (Opcional, mencionar Docker si se usó)
📂 Estructura de los Microservicios
├── config-server/      # Servidor de configuración centralizado
├── eureka-server/      # Servidor Eureka para descubrimiento de servicios
├── gateway/            # API Gateway para enrutar solicitudes
├── user-service/       # Microservicio Usuario
├── car-service/        # Microservicio Carro
├── bike-service/       # Microservicio Moto
⚙️ Configuración del Entorno
Prerrequisitos
JDK 17 instalado.
IDE compatible con Spring Boot (IntelliJ, Eclipse, etc.).
Git instalado para gestionar la configuración.
Opcional: Docker, si se utilizaron contenedores.
Pasos de Configuración
Clona este repositorio:
git clone https://github.com/tu_usuario/tu_repositorio.git
cd tu_repositorio
Configura las propiedades en el repositorio remoto usado por el servidor de configuración.
Asegúrate de que los servicios estén registrados correctamente en Eureka.
(Opcional) Configura Zipkin para observar el tracing.
▶️ Ejecución del Proyecto
Arranca primero el Config Server.
Inicia el Eureka Server.
Ejecuta los microservicios (Usuario, Carro, Moto).
Levanta el API Gateway.
Si es necesario, levanta Zipkin y visualiza el tracing distribuido en http://localhost:9411.
🤝 Contribuciones
¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto, crea un fork del repositorio y envía un pull request con tus cambios.

📄 Licencia
Este proyecto está bajo la licencia MIT. Para más información, consulta el archivo LICENSE.
