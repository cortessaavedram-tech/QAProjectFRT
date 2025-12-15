# QAProjectFRT
QA Selenium Project about the Free Range Testers page
# 🚀 QA Automation Project: Selenium + Cucumber + Qase TestOps

Este proyecto es un framework de automatización de pruebas de interfaz de usuario (UI) diseñado para validar la navegación y funcionalidades de la plataforma **Free Range Testers**. 

Implementa un enfoque de **Behavior Driven Development (BDD)** y reporta automáticamente los resultados a la plataforma de gestión de pruebas **Qase**.

---

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java 21
* **Gestor de Dependencias:** Gradle
* **Framework de Pruebas:** JUnit 5 & Cucumber 7
* **Automatización de Navegador:** Selenium WebDriver 4
* **Patrón de Diseño:** Page Object Model (POM)
* **Reportes de Test:** Qase TestOps & Cucumber Reports

---

## 📋 Características del Proyecto

- **Integración con Qase:** Los resultados de las pruebas se sincronizan en tiempo real con Qase mediante el uso de `QaseEventListener` y `@QaseId`.
- **Estrategia BDD:** Los escenarios están escritos en lenguaje Gherkin, facilitando la colaboración entre equipos técnicos y de negocio.
- **Page Object Model:** Estructura modular para mantener el código de los elementos de la UI separado de la lógica de los tests, mejorando la mantenibilidad.
- **Configuración Multi-Entorno:** Capacidad de activar/desactivar reportes externos mediante propiedades del sistema.

---

## 🚀 Cómo ejecutar las pruebas

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/cortessaavedram-tech/QAProjectFRT.git](https://github.com/cortessaavedram-tech/QAProjectFRT.git)
