package test.scala.simulation

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

import test.scala.config.testplanConfig._
import test.scala.requests.requestsamples._

class JPetStoreSimulation extends Simulation {

  private val httpProtocol = http
    .baseUrl(baseUrl)
    .inferHtmlResources()
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/111.0")

  val sc_1 = scenario("sc_1").exec(launch,login,search_fish,logout)
  val sc_2 = scenario("sc_2").exec(launch,login,logout)
  val sc_3 = scenario("sc_3").exec(launch)

  //Reference https://gatling.io/docs/gatling/reference/current/core/injection/

  setUp(
    sc_1.inject(rampUsers(10).during(10)),
    sc_2.inject(rampUsers(5).during(10)),
    sc_3.inject(
      nothingFor(4), // 1
      atOnceUsers(1), // 2
      rampUsers(1).during(5), // 3
      constantUsersPerSec(2).during(5), // 4
      constantUsersPerSec(2).during(5).randomized, // 5
      rampUsersPerSec(1).to(2).during(1.minutes), // 6
      rampUsersPerSec(1).to(2).during(1.minutes).randomized, // 7
      stressPeakUsers(10).during(20)),
  ).protocols(httpProtocol)
}
