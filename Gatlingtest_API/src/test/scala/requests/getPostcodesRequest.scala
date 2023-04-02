package test.scala.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder
import test.scala.config.Configuration.baseUrl

object getPostcodesRequest {

  var get_postcodes: HttpRequestBuilder = http ("Get Postcode")
    .post(baseUrl + "/postcodes")
    .body(RawFileBody("./src/test/resources/requestBody/GetPostcode.json")).asJson
    .header("content-type","application/json")
    .check(status is 200)
}





