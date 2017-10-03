package com.techmonad.akkahttp.utils

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import com.techmonad.akkahttp.actors.UserRegistryActor.ActionPerformed
import com.techmonad.akkahttp.actors.{User, Users}
import spray.json.DefaultJsonProtocol

trait JsonSupport extends SprayJsonSupport {
  // import the default encoders for primitive types (Int, String, Lists etc)
  import DefaultJsonProtocol._

  implicit val userJsonFormat = jsonFormat3(User)
  implicit val usersJsonFormat = jsonFormat1(Users)

  implicit val actionPerformedJsonFormat = jsonFormat1(ActionPerformed)
}
