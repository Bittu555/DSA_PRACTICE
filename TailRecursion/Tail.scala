package TailRecursion



// Scala program of GCD using recursion

import scala.annotation.tailrec

// Creating object
object Tail {
  // Function defined
  def GCD(n: Int, m: Int): Int = {
    // tail recursion function defined
     def gcd(x: Int, y: Int): Int = {
      if (y == 0) x
      else gcd(y, x % y)
    }

    gcd(n, m)
  }

  // Main method
  def main(args: Array[String]) {
    println(GCD(12, 18))
  }
}

