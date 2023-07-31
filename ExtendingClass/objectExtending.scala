package ExtendingClass

class Shape(name:String) {
  val shapeName = name
  override def toString = s"I am a $shapeName"
}
class Rectangle(l:Double, b:Double, shapeName:String="Rectangle") extends Shape(shapeName) {
  val length = l
  val breadth = b
  override def toString = s"I am a $shapeName, l=$length, b=$breadth"
}
class Square(s:Double) extends Rectangle(s,s,"Square") {
}
object objectExtending extends App {
  val p = new Rectangle(2,4,"Rectangle")
  println(p)
}