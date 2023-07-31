package Abstrtact_Class


abstract class Shape(name: String) {
  val shapeName = name
  override def toString = s"I am a $shapeName"
  def getArea: Double //getArea is the abstract method which has Double as return type
}
class Rectangle(l: Double, b: Double, shapeName: String = "Rectangle") extends Shape(shapeName) {
  val length = l
  val breadth = b
  override def toString = s"I am a $shapeName, l=$length, b=$breadth"
  def getArea = l * b
}
class Square(s: Double, shapeName: String = "Square") extends Shape(shapeName) {
  override def toString = s"I am a $shapeName, s=$s"
  override def getArea = s * s
}
class AreaCalculator[T](s: T) {
  val shape: T = s
  override def toString = shape.toString
}
object AbstractTest extends App {
  val s = new Square(5)
  val r = new Rectangle(5, 20)
  val a=new AreaCalculator[Square](s)
  println(a)
  println(s)
  println(r)
}
abstract class Animal {
  val greeting = { println("Animal"); "Hello" }
}
class Dog extends Animal {
  override val greeting = { println("Dog"); "Woof" }
}
object Test extends App {
  new Dog
}