package test.scala.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder
import test.scala.config.Configuration.baseUrl

object getGeocodingRequest {

  var get_geocoding: HttpRequestBuilder = http ("Get Geocoding")
    .post(baseUrl + "/postcodes")
    .body(RawFileBody("./src/test/resources/requestBody/GetGeocoding.json")).asJson
    .header("content-type","application/json")
    .check(status is 200)
}





