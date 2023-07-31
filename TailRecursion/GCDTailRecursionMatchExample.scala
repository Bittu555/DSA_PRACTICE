package TailRecursion

import scala.annotation.tailrec

object GCDTailRecursionMatchExample {
  def gcd(a: Int, b: Int): Int = {
    @tailrec
    def gcdHelper(x: Int, y: Int): Int = y match {
      case 0 => x
      case _ => gcdHelper(y, x % y)
    }

    val (num1, num2) = if (a >= b) (a, b) else (b, a) // Ensure num1 >= num2
    gcdHelper(num1, num2)
  }

  def main(args: Array[String]): Unit = {
    val a = 48
    val b = 18
    val result = gcd(a, b)
    println(s"The GCD of $a and $b is: $result")
  }
}
