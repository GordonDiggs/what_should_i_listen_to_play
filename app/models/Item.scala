package models

case class Item(artist: String, title: String, year: Int,
  label: String, format: String, id: Int) {
  def imageURL(): String = {
    val finder = ImageFinder.find(searchString)
  }

  private def SearchString(): String = {
    s"${artist} ${title} cover"
  }
}
