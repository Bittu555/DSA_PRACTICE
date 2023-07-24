object higherOrderFns extends App {
  println("Welcome to the Scala worksheet")
  //> Welcome to the Scala worksheet
  private val double = (i:Int) => i * 2
  //> double : Int => Int = <function1>
  private def higherOrder(x:Int, y:Int=>Int) = y(x)
  //> higherOrder: (x: Int, y: Int => Int)Int
  higherOrder(6, double)
  private val triple = (i:Int) => i * 3
  higherOrder(6, triple)
  //> res0: Int = 12
  //> triple : Int => Int = <function1>
  //> res1: Int = 18
  private def sayHello = (name:String) => {"Hello" + " " + name}
  //> sayHello: => String => String
  private val message = sayHello("Peggy")
  print(message)
  //> message : String = Hello Peggy
  private val y: Int = 5
  //> y : Int = 5
  private val multiplier = (x:Int)=> x * y
  //> multiplier : Int => Int = <function1>
  multiplier(10)
  //> res2: Int = 50
}