package method

object FunctionSyntax extends App {
  def compareIntegers(value1: Int, value2: Int): Int = if (value1 == value2) 0 else if (value1 > value2) 1 else -1

  def compareInV2(Value1: Int, Value2: Int): Int = {
    if (Value1 == Value2) 0 else if (Value1 > Value2) 1 else -1
  }
    println(compareIntegers(2, 3));
    println(compareInV2(6, 8))

}

