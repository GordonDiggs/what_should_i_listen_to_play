package models

case class Item(artist: String, title: String, year: Int,
  label: String, format: String, id: Int) {
  def imageURL(): String = {
    ImageFinder.find(searchString)
  }

  private def searchString(): String = {
    s"${artist} ${title} cover"
  }
}
