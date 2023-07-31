object StringLength extends App {
  def reLength(len: List[String]): Long = len match {
    case Nil=>0
    case head::tail =>1+reLength(tail)
  }
  reLength(List("bittu", "raju"))
}

