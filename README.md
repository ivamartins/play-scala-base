# play-scala-base

Base funcional mínima em Play Framework (Scala).

**Este é um framework inicial para manutenção, evolução e modernização de sistemas legados usando Play Framework.**

**Português (resumo):**
Demonstra setup limpo e moderno de Play Scala. Pronto para estender com Kafka, Akka, Elasticsearch, DBs legados, APIs REST, agentes IA. Perfeito para modernizar apps antigos Play/Java EE/JSF (ex. estilo e-commerce Panvel), backends escaláveis com arquitetura event-driven, e adicionar agentes LLM sobre serviços legados.

**English:**

Minimal, functional Play Framework (Scala) base project.

This is a **starting framework** for maintenance, evolution, and modernization of legacy systems using Play Framework.

## Why this as base?
- Demonstrates a clean, modern Play Scala setup (Play 3, Scala 2.13/3 compatible patterns).
- Ready to extend for the stacks we work with: integration with Kafka, Akka, Elasticsearch, legacy DBs, REST APIs, etc.
- Perfect for:
  - Modernizing old Play/Java EE/JSF applications (e.g., Panvel e-commerce style).
  - Building scalable backends with event-driven architecture.
  - Adding AI/LLM agents on top of legacy services.

## Quick Start / Como rodar a aplicação

**Pré-requisitos:** Java 11+ e sbt (Scala Build Tool).

**Passo a passo (funcional):**

1. Clone o repositório e entre na pasta.
2. Rode:

```bash
sbt run
```

3. Acesse no navegador: http://localhost:9000

**O que você vê:**
- Página inicial com template Twirl.
- Controller básico.
- Endpoint de demonstração de "legacy orders": http://localhost:9000/legacy-orders (retorna JSON).

**English:**

**Prerequisites:** Java 11+ and sbt.

**Step by step (out of the box):**

1. Clone and `cd` into the folder.
2. Run:

```bash
sbt run
```

3. Open in browser: http://localhost:9000

**What you get:**
- Home page with Twirl template.
- Basic controller.
- Legacy orders demo: http://localhost:9000/legacy-orders (JSON response).

## Running the tests

**Português:**

```bash
sbt test
```

Ou, para limpar e rodar do zero:

```bash
sbt clean test
```

Os testes usam ScalaTest + Play (incluem controller direto, injeção e rotas). Todos os testes básicos passam sem serviços externos.

**English:**

```bash
sbt test
```

Or clean + run:

```bash
sbt clean test
```

Tests use ScalaTest + Play (direct controller, injected, and route tests). Basic unit tests pass without any external services (H2 in-memory + evolutions are handled automatically).

## Extend it (examples tying to our services)

### 1. Add database (for legacy data migration)
```scala
// In build.sbt
libraryDependencies += "com.h2database" % "h2" % "2.2.224"

// conf/application.conf
db.default.driver=org.h2.Driver
db.default.url="jdbc:h2:mem:play"
```

Add models, DAOs, evolutions for "legacy orders" or customer data.

### 2. Add Kafka / event-driven (for Sicredi-style architectures)
Add Alpakka Kafka or Play's WS + Kafka client.
Example endpoint that publishes events from "legacy" actions.

### 3. Integrate AI agents (for modern automations)
Call external agents (like the whatsapp-grok-bot pattern) or embed simple LLM calls.
Use for enriching legacy data, smart queries, workflow automation.

### 4. Akka / async (for high-volume systems)
Play has built-in Akka. Add actors for background jobs, clustering simulation.

### 5. Elasticsearch (search/observability)
Add elastic4s or Java client for indexing legacy entities.

### 6. Quarkus/Spring migration notes
This Play base can serve as "before" or "parallel" in modernization projects. See comments in code for migration patterns to Quarkus/Spring Boot + Kafka.

## Run in production
- `sbt dist` → zip for servers.
- Docker: add Dockerfile (example below).
- With Akka clustering for scale.

## Docker (make it deployable)
See Dockerfile in this repo (or add one).

## Relation to Code Solutions
This is one of the functional base projects used to demonstrate and deliver:
- Manutenção e modernização de sistemas legados (Java, Play Framework...)
- Backends escaláveis, arquiteturas event-driven
- Integração de agentes de IA

See full services and cases: https://ivamartins.github.io/code-solutions-site/

LinkedIn Company: https://www.linkedin.com/company/code-solutions-it/

## Next steps for your project
1. Clone this.
2. Rename organization/package.
3. Add your legacy models/endpoints.
4. Extend with the tech from the stack (Kafka, Flink, Akka, ES, AI agents).
5. Deploy and evolve.

This base is intentionally small so you can evolve it into real production systems while keeping the modernization path clear.

