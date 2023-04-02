package test.scala.scenarios

import io.gatling.core.Predef.scenario
import io.gatling.core.structure.ScenarioBuilder
import test.scala.requests.getPostcodesRequest

object GetPostcodesScenario {
  val getPostcodesScenario: ScenarioBuilder = scenario("Get Postcodes Scenario")
    .exec(getPostcodesRequest.get_postcodes)
}