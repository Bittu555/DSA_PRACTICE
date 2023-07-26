package Collection

object OptionCollection {
  def main(args: Array[String]): Unit = {
    def fraction(numer: Double, denom: Double): Option[Double] = {
      if (denom == 0)
        None
      else
        Option(numer / denom)
    }
    val piOption = fraction(22,9999)
    println(piOption)
  }
}
