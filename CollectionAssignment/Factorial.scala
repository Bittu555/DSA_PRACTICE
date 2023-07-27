package CollectionAssignment

object Factorial {
  def main(args: Array[String]): Unit = {
    var arr=6
    var result=factorialNumber(arr);
    println(result)
  }
  def factorialNumber(n:Int): Int = {
    (1 to n).foldLeft(1)((acc,curr)=>acc*curr)

  }
}
