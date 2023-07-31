package Objects

object Main extends App {
  def syHi(): Unit = {
    println("hii")
  }

}
object Main1 extends App {

    println("hii")


}
////////////////////////////////////
object CashRegister {
  def open { println("opened") }
  def close { println("closed") }
}
object Main2 extends App {
  CashRegister.open
  CashRegister.close
}

class Apple{
  def sayHello(): Unit = {
    println("say hello")
  }
}
object Apple{
  def sayHi(): Unit = {
    println("hii")
  }
}
object testCompanion extends App{
  var a:Apple=new Apple()
  a.sayHello()
  Apple.sayHi()
}