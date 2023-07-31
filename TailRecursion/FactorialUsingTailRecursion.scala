package TailRecursion

import scala.annotation.tailrec

object FactorialUsingTailRecursion {
  def factorial(n: Int): Int = {
    @tailrec
    def factorialHelper(num: Int, acc: Int): Int = num match {
      case 0 => acc
      case _ => factorialHelper(num - 1, acc * num)
    }

    factorialHelper(n, 1)
  }

  def main(args: Array[String]): Unit = {
    val n = 5
    val result = factorial(n)
    println(s"The factorial of $n is: $result")
  }
}


