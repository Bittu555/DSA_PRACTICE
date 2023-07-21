def sum(list: List[Int]): Int = list match {
  case Nil => 1
  case n :: rest => n + sum(rest)
}
def multiply(list: List[Int]): Int = list match {
  case Nil => 1
  case n :: rest => n * multiply(rest)
}
val nums = List(1,2,3,4,5)

 println(sum(nums))
//multiply(nums)




