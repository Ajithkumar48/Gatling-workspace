package test.scala.scenarios

import io.gatling.core.Predef.scenario
import io.gatling.core.structure.ScenarioBuilder
import test.scala.requests.{getPostcodesRequest,getGeocodingRequest}

object testScenario {
  val getPostcodesScenario: ScenarioBuilder = scenario("Get Postcodes Scenario")
    .exec(getPostcodesRequest.get_postcodes)
  val getGeocodingScenario: ScenarioBuilder = scenario("Get Geocoding Scenario")
    .exec(getGeocodingRequest.get_geocoding)
}