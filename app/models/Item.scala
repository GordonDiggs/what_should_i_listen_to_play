package models

case class Item(artist: String, title: String, year: Int,
  label: String, format: String, id: Int) {
  def imageURL(): String = {
    ""
    //val finder = new GoogleImageFinder(searchString)
    //finder.URL
  }

  private def SearchString(): String = {
    s"${artist} ${title} cover"
  }
}
