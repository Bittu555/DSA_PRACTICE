package InnerClass


class Add {
  class Addtwonumbers {
    var a = 12;
    var b = 31;
    var c = a + b;
  }
}
object Innerclass {
  def main(args:Array[String]) {
    val a1 = new Add
    val a2 = new Add
    val b1 = new a1.Addtwonumbers
    val b2 = new a2.Addtwonumbers
    b1.a = 30;
    b1.b = 45;
    b2.a = 55;
    b2.b = 24;
    println(s"b1.a = ${b1.a}")
    println(s"b1.b = ${b1.b}")
    println(s"b2.b = ${b2.b}")
    println(s"Result = ${b2.c}")
  }
}