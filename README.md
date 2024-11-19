# Proyecto de Microservicios con Spring Boot

Este proyecto forma parte de un curso de introducción a los microservicios, donde se construyó una arquitectura basada en microservicios utilizando tecnologías modernas como **Spring Boot**, **Spring Cloud** y herramientas complementarias para la observabilidad, comunicación y resiliencia.

## 📋 Índice

1. [Introducción](#introducción)
2. [Características del Proyecto](#características-del-proyecto)
3. [Tecnologías y Herramientas](#tecnologías-y-herramientas)
4. [Estructura de los Microservicios](#estructura-de-los-microservicios)
5. [Configuración del Entorno](#configuración-del-entorno)
6. [Ejecución del Proyecto](#ejecución-del-proyecto)
7. [Contribuciones](#contribuciones)
8. [Licencia](#licencia)

## 📖 Introducción

Este proyecto demuestra cómo construir una arquitectura basada en microservicios que sea escalable, resiliente y de fácil mantenimiento. Durante su desarrollo, se implementaron conceptos clave como la comunicación entre servicios, la gestión de configuración centralizada, balanceo de carga, tolerancia a fallos y tracing distribuido.

## 🚀 Características del Proyecto

1. **Microservicios Implementados**:
   - **Usuario**: Gestión de usuarios.
   - **Carro**: Gestión de datos relacionados con carros.
   - **Moto**: Gestión de datos relacionados con motos.

2. **Comunicación entre Microservicios**:
   - Uso de **RestTemplate** para llamadas HTTP directas entre servicios.
   - Uso de **Feign Client** para simplificar y optimizar la comunicación.

3. **Configuración Centralizada**:
   - Creación de un servidor de configuración basado en **Git** para administrar las propiedades de los microservicios.

4. **Registro y Descubrimiento de Servicios**:
   - Implementación del servidor **Eureka** para gestionar la instancia de los servicios y facilitar el descubrimiento dinámico.

5. **Gateway**:
   - Configuración de un **API Gateway** para enrutar las solicitudes a los microservicios correspondientes y mejorar la seguridad y control de acceso.

6. **Resiliencia y Tolerancia a Fallos**:
   - Uso de **Resilience4j** para implementar patrones de *Circuit Breaker* y prevenir fallos en cascada.

7. **Observabilidad y Tracing Distribuido**:
   - Integración de **Sleuth** y **Zipkin** para rastrear el flujo de solicitudes entre los microservicios.

## 🛠 Tecnologías y Herramientas

- **Lenguaje**: Java 17
- **Framework**: Spring Boot
- **Spring Cloud**: Eureka, Config Server, Gateway
- **Resilience**: Resilience4j
- **Tracing**: Sleuth y Zipkin
- **HTTP Clients**: RestTemplate, Feign Client
- **Sistema de Control de Versiones**: Git
- **Base de Datos**: *h2database*
- **Gestión de Dependencias**: Maven


## 📂 Estructura de los Microservicios

```plaintext
├── config-server/      # Servidor de configuración centralizado, extrae la informacion de config-data
├── config-data/        # Configuración centralizado de todos los servicios
├── eureka-server/      # Servidor Eureka para descubrimiento de servicios
├── gateway-server/     # API Gateway para enrutar solicitudes
├── usuario-service/    # Microservicio Usuario
├── carro-service/      # Microservicio Carro
├── moto-service/       # Microservicio Moto
```
## ⚙️ Configuración del Entorno

- **JDK 17 instalado.**
- **IDE compatible con Spring Boot (IntelliJ, Eclipse, etc.).**
- **Git instalado para gestionar la configuración.**

## Pasos de Configuración

1. Clona este repositorio:
   
```plaintext
git clone https://github.com/jhimy-java/microservicios-project.git
cd tu_repositorio
```
2. Configura las propiedades en el repositorio remoto usado por el servidor de configuración.
3. Asegúrate de que los servicios estén registrados correctamente en Eureka.
4. (Opcional) Configura Zipkin para observar el tracing.

## ▶️ Ejecución del Proyecto

1. **Arranca primero el Config Server.**
2. **Inicia el Eureka Server.**
3. **Ejecuta los microservicios (Usuario, Carro, Moto).**
4. **Levanta el API Gateway.**
5. **Si es necesario, levanta Zipkin y visualiza el tracing distribuido en http://localhost:9411.**

## 📄 Licencia
   Este proyecto está bajo la licencia MIT. Para más información, consulta el archivo LICENSE
