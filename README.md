# play-scala-base

> Part of the **Code Solutions Java Modernization Framework** product line. Starting point for maintaining, evolving, and modernizing legacy systems using Play Framework (Scala).

Minimal, functional Play Framework (Scala) base project.

## Why this base

- **Clean, modern Play Scala setup** (Play 3, Scala 2.13/3 compatible patterns).
- **Ready to extend** for the stacks we work with: integration with Kafka, Akka, Elasticsearch, legacy DBs, REST APIs, etc.
- **Perfect for**:
  - Modernizing old Play/Java EE/JSF applications (e.g., Panvel e-commerce style).
  - Building scalable backends with event-driven architecture.
  - Adding LLM agents on top of legacy services.

## Quick start

**Prerequisites:** Java + sbt.

```bash
# Run the example
sbt run

# Open in browser
# http://localhost:9000
```

## Run the tests

```bash
sbt test
```

## Extend for real use

- Add your domain models and routes
- Wire to Kafka consumer for event ingestion
- Add Akka Typed actors for stateful processing
- Connect to legacy DBs (Anorm, Slick)
- Add AI agent layer (LangChain4j, MCP)

## Tech stack

- Scala 2.13 / 3 compatible
- Play Framework 3
- sbt build tool
- ScalaTest (unit tests)

> **Português?** Veja [`README.pt-BR.md`](./README.pt-BR.md).

## See also

- **Related base**: [akka-scala-base](https://github.com/ivamartins/akka-scala-base)
- **Product line**: [Java Modernization Framework](https://ivamartins.github.io/code-solutions-site/#produtos)
- **Code Solutions on LinkedIn**: [linkedin.com/company/code-solutions-it](https://www.linkedin.com/company/code-solutions-it/)
- **All Code Solutions open source**: [github.com/ivamartins](https://github.com/ivamartins)

## License

MIT — see `LICENSE`.
