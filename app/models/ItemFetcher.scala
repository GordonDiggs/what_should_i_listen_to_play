package models

import scalaj.http._
import play.api.libs.json._

object ItemFetcher {
  val URL = "https://rayons.info/items/random.json"

  def random(): Item = {
    val response: HttpResponse[String] = Http(URL).asString

    val obj = Json.parse(response.body)
    implicit val modelFormat = Json.format[Item]
    Json.fromJson[Item](obj).get
  }
}
