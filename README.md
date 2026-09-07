# Desarrollo de un microservicio en Kotlin con Spring Boot y Exposed

En el contexto de una plataforma de préstamos en línea, necesitas desarrollar un microservicio que gestione la información de los préstamos. Este microservicio debe registrar los préstamos con los siguientes atributos: ID del préstamo, monto, tasa de interés, fecha de inicio y fecha de vencimiento. Debe manejar la validación de los datos de entrada, asegurando que el monto sea positivo y las fechas sean válidas. Además, debe ser capaz de manejar escenarios de alta carga, asegurando la idempotencia en la creación de préstamos y la consistencia de los datos almacenados.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | microservicio-springboot-kotlin |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Registro de préstamos

**Objetivo:** Implementar la funcionalidad básica para registrar préstamos con validación de datos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Diseña un modelo de datos para representar un préstamo.
- Implementa la validación de los atributos del préstamo (monto positivo, fechas válidas).
- Asegura que el registro de préstamos sea idempotente.

**Entregable:** Microservicio que registra préstamos con validación de datos y asegura idempotencia.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejar los errores de validación.
- Piensa en cómo garantizar la consistencia de los datos almacenados.

</details>

### Fase 2: Manejo de alta carga

**Objetivo:** Optimizar el microservicio para manejar escenarios de alta carga y asegurar la consistencia de los datos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa mecanismos para manejar la alta carga, como el uso de colas o la distribución de carga.
- Asegura que los datos almacenados sean consistentes en escenarios de alta carga.

**Entregable:** Microservicio optimizado para manejar alta carga y asegurar la consistencia de los datos.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga sobre patrones de diseño para manejar alta carga.
- Considera el uso de tecnologías de mensajería para la distribución de carga.

</details>

### Fase 3: Integración y pruebas

**Objetivo:** Integrar el microservicio con otros componentes del sistema y realizar pruebas exhaustivas.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Integra el microservicio con otros componentes del sistema, como el servicio de autenticación y el servicio de notificación.
- Realiza pruebas unitarias y de integración para asegurar la funcionalidad y la robustez del microservicio.

**Entregable:** Microservicio integrado con otros componentes y pruebas unitarias y de integración realizadas.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga sobre buenas prácticas para la integración de microservicios.
- Considera el uso de herramientas de testing para realizar pruebas exhaustivas.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un microservicio y cómo se integra con otros componentes del sistema?
- **paraQueSirve**: ¿Para qué sirve la validación de datos en un microservicio?
- **comoSeUsa**: ¿Cómo se usa el patrón de diseño para manejar alta carga en un microservicio?
- **erroresComunes**: ¿Cuáles son los errores comunes al desarrollar un microservicio y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la integración de un microservicio con otros componentes del sistema?

## Criterios de Evaluacion

- Implementación correcta del modelo de datos para representar un préstamo.
- Validación adecuada de los atributos del préstamo.
- Garantía de idempotencia en el registro de préstamos.
- Optimización del microservicio para manejar alta carga.
- Aseguramiento de la consistencia de los datos en escenarios de alta carga.
- Integración correcta del microservicio con otros componentes del sistema.
- Realización de pruebas unitarias y de integración exhaustivas.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
