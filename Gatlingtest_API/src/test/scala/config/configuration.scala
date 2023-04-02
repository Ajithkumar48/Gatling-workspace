package test.scala.config

import com.typesafe.config._

//Set Configuration Values for Project
object Configuration {
  val baseUrl: String = "http://api.postcodes.io"
  val users: Int = Integer.getInteger( "users", 1).toInt
  val rampup: Int = Integer.getInteger("rampup",1).toInt
  val throughput: Int = Integer.getInteger("throughput", 1).toInt
}