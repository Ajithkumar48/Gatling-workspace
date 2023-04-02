package test.scala.simulation

import test.scala.scenarios.testScenario
import test.scala.config.Configuration._
import io.gatling.core.Predef._

import scala.concurrent.duration._
class MutipleRequestSimulation extends Simulation {

  private val getPostcodesRampExec = testScenario.getPostcodesScenario
    .inject(rampUsers(users) during (rampup seconds))

  private  val getGeocodingRampExec = testScenario.getGeocodingScenario
    .inject(rampUsers(users) during (rampup seconds))

  setUp(getPostcodesRampExec,getGeocodingRampExec)
    .assertions(global.responseTime.max.lt(5000))
}