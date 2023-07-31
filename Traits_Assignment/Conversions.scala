package Traits_Assignment


object Conversions {
  def inchestoFeet(inches: Double): Double = inches / 12.0

  def milestoKms(miles: Double): Double = miles * 1.60934

  def poundsToKilos(pounds: Double): Double = pounds * 0.453592
}

class MeasurementConverter {
  def convertMeasurements(): Unit = {
    val inches = 36.0
    val miles = 5.0
    val pounds = 150.0

    val feet = Conversions.inchestoFeet(inches)
    val kilometers = Conversions.milestoKms(miles)
    val kilograms = Conversions.poundsToKilos(pounds)

    println(s"$inches inches is equal to $feet feet.")
    println(s"$miles miles is equal to $kilometers kilometers.")
    println(s"$pounds pounds is equal to $kilograms kilograms.")
  }
}

object Main1 {
  def main(args: Array[String]): Unit = {
    val converter = new MeasurementConverter()
    converter.convertMeasurements()
  }
}
