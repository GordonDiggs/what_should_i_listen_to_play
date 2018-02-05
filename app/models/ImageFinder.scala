package models

import scalaj.http._
import play.api.libs.json._

object ImageFinder {
  val BASE_URL = "https://api.cognitive.microsoft.com/bing/v7.0/images/search"

  def find(term: String): String = {
    val response: HttpResponse[String] = 
      Http(BASE_URL)
        .param("q", term)
        .header("Ocp-Apim-Subscription-Key", )
        .asString
  
  }
}
