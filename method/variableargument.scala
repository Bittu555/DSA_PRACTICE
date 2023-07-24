package method

object variableargument extends App {
  def printAll(string: String*): Unit = {
    string.foreach(print)
  }

  printAll()
  printAll("foo")
  printAll(" bittu ", "rahul ")
  printAll("bittu ", "rahul ", "ramesh ")

  var fruits = List("apple", "banan", "cherry")
  printAll(fruits: _*)

  var myList1 = Array.range(10, 20, 2)
  for (a <- myList1) println(a)

  private def check(num: Int): Unit = {
    for (n <- Range(2, num)) {
      print(n)
    }

  }

  var x = Range(2, 8)
  for (n<-x) println(n)
 check(3)
}




