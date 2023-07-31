package Traits

trait Book {
  val id : Int
  val name : String
  val isbn : Long
  val price : Double
  //Concrete variable
  val category = "Uncategorized"
  //Concrete implementation
  def getTaxOnPrice : Double = {
    (price * 14)/100
  }
}

///////////////2nd question
abstract class Product{
  val prodID:Int
  val skuID:Int
}

class ScienceBook extends Product with Book{
  override val id: Int = 123
  override val name: String = "bittu"
  override val isbn: Long = 9783499605550l
  override val price: Double = 9.09
  override val category: String = "Science book"

  override def getTaxOnPrice: Double = {

    (price*10)/100
  }

  override val prodID: Int = 200000123
  override val skuID: Int = 1231
}


object MainTrait extends App{
  val sb=new ScienceBook
  println(sb.getTaxOnPrice)
}

