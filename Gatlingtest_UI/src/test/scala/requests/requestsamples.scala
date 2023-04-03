package test.scala.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

import test.scala.config.headerConfig._

object requestsamples {

  val launch =
    exec(
      http("Launch")
        .get("/catalog/")
        .headers(headers_0)
    )
      .pause(5)

  val logindetails = csv("logindetails.csv").circular

  val login =
    exec(
      http("Click_SignIn")
        .get("/account/signonForm")
        .headers(headers_9)
    )
      .pause(5)
      // Click Login
      .feed(logindetails) // Parameterization for login credentials
      .exec(
        http("Click_Login")
          .post("/account/signon")
          .headers(headers_10)
          .formParam("referer", "")
          .formParam("username", "#{username}")
          .formParam("password", "#{password}")
      )
      .pause(5)

  val search_fish =
    exec(
      http("Click_Fish")
        .get("/catalog/categories/FISH")
        .check(
          css("a:contains('#{product}')", "href").saveAs("productUrl"))
        .headers(headers_9)
    )
      .pause(5)
      // Click Angelfish
      .exec(
        http("Click_AngelFish")
          .get("#{productUrl}")
          .headers(headers_9)
      )
      .pause(5)

  val logout =
    exec(
      http("ClickSignout")
        .get("/account/signoff")
        .headers(headers_9)
    )
      .pause(5)

}