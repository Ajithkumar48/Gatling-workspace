package test.scala.scenarios

import io.gatling.core.Predef.scenario
import io.gatling.core.structure.ScenarioBuilder
import test.scala.requests.{getGeocodingRequest, getPostcodesRequest}

import scala.concurrent.duration.DurationInt

object testScenario {
  val getPostcodesScenario: ScenarioBuilder = scenario("Get Postcodes Scenario")
    .exec(getPostcodesRequest.get_postcodes)
    .pause(2000.milliseconds)

  val getGeocodingScenario: ScenarioBuilder = scenario("Get Geocoding Scenario")
    .exec(getGeocodingRequest.get_geocoding)
    .pause(4000.milliseconds)
}