package method

object TupleStringMultimilcation extends App {
  val m1=(12,23,34,56)
  val mul=m1._1*m1._2*m1._3
  println(mul)
  val stu=new Tuple3(12,"bittu",3)
  println(stu.toString())

}
