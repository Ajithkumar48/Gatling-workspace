package test.scala.simulation

import test.scala.scenarios.GetPostcodesScenario
import test.scala.config.Configuration._
import io.gatling.core.Predef._

import scala.concurrent.duration._
class getPostcodesSimulation extends Simulation {
  private val getPostcodesRampExec = GetPostcodesScenario.getPostcodesScenario
    .inject(rampUsers(users) during (rampup seconds))

  setUp(getPostcodesRampExec)
    .assertions(global.responseTime.max.lt(5000))
}