package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 *
 * This is a **functional base** for Play Framework modernization projects.
 * - Demonstrates modern Play Scala setup.
 * - Includes example of "legacy" data model (see conf/evolutions and comments).
 * - Ready to extend with Kafka, Akka, Elasticsearch, AI agent calls, DB (H2/Postgres), etc.
 *
 * Use as starting point for:
 * - Maintaining/evolving legacy Play/Java EE systems (e.g. old e-commerce backends).
 * - Adding event-driven layers (Kafka/Flink patterns).
 * - Layering AI agents on top of legacy services.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  /**
   * Demo endpoint: "Legacy orders" from old system.
   * In real modernization: replace with DB query (Anorm/Slick), call to legacy via WS, or enrich with AI agent.
   * Ties to services: modern REST over legacy data, event publishing, agent integration.
   */
  def legacyOrders() = Action {
    // Mock "legacy" data (replace with real DB or legacy API call)
    val orders = Seq(
      Json.obj("id" -> 1, "customerId" -> "CUST001", "amount" -> 1250.50, "status" -> "PENDING", "source" -> "legacy-play-old"),
      Json.obj("id" -> 2, "customerId" -> "CUST002", "amount" -> 89.99, "status" -> "COMPLETED", "source" -> "legacy-play-old")
    )
    Ok(Json.obj("orders" -> orders, "note" -> "This simulates data from a legacy Play/Java system. Extend with real DB, Kafka events, or AI enrichment."))
  }
}
