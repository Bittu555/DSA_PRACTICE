object FunctionTest  {
  private val x = List.range(1, 10)
  private val evens = x.filter((i: Int) => i % 2 == 0)
  private val odd=x.filter(_%2==1)
  //val evens = x.filter(_ % 2 == 0) //Syntactic sugar way of writing
  println(evens)
  print(odd)
}