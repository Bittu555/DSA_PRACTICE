package FunctionalProgramming

object Object extends App {
  var p = (x: Int) => x + 1;
  print(p(1))

  def test1 = (str: String) => str + str

  test1("hello")

  def add(i: Int, j: Int) = i + j

  add(1, 2)

  def getRectangleArea(length: Double, breadth: Double): Double = {
    length * breadth
  }

  val area = getRectangleArea(5, 8)
  val perimeterOfSquare = 20.0
  (getRectangleArea _).tupled(
    {
      val side = perimeterOfSquare / 4
      (side, side)
    })
}


