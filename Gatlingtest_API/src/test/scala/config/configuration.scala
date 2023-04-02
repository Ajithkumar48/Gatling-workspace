package test.scala.config

import com.typesafe.config._

//Set Configuration Values for Project
object Configuration {
  val baseUrl: String = "http://api.postcodes.io"
  val users: Int = Integer.getInteger( "Users", 10).toInt
  val rampup: Int = Integer.getInteger("rampup",10).toInt
  val throughput: Int = Integer.getInteger("throughput", 10).toInt
}