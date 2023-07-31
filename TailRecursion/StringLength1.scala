package TailRecursion

import scala.annotation.tailrec

object StringLength1 extends App {
  def reLength(len: List[String]): Long = len match {
    case Nil => 0
    case head :: tail => 1 + reLength(tail)
  }

  def reLength1(len:List[String]):Long=len match{
    case Nil=>0
    case head::tail=> {
      var acc=reLength(tail)
      acc+1
    }
  }
  @tailrec
  def reLength2(len:List[String],acc:Long):Long=len match {
    case Nil => 0
    case head::tail=>reLength2(tail,acc+1)
  }

  println("simple recur "+reLength(List("bittu", "raju")))
  println("simple recur "+ reLength1(List("bittu", "raju")))
  println("tail rec recur "+ reLength2(List("bittu", "raju"),1))

}
