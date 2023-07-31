package TailRecursion


import scala.annotation.tailrec

// Creating object
object TailError {
  // Function defined
  def factorial(n: Int): Int = {
    if (n == 1)
      1
    else
      n * factorial(n - 1)  /// val a=factorial(n-1)
                            ///val b=a*n this value is return it is not a tail recursive
  }

  // Main method
  def main(args: Array[String]) {
    println(factorial(5))
  }
}
