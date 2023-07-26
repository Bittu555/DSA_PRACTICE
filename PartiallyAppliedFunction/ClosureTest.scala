package PartiallyAppliedFunction

object ClosureTest extends App {

  def calculateProductprice(discount:Double,productPrice:Double):Double=(1-discount/100)*productPrice

  val discountApplied=calculateProductprice(30,_:Double)

  println(discountApplied.toString())
  println(discountApplied(10))
}
