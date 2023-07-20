object PatternMatching extends App {
//  def matchAgainst(i: Int) = i match {
//    case 1 | 3 | 5 => println("odd")
//    case 2 | 4 | 6 => println("even")
////    case 3 => println("Three")
////    case 4 => println("Four")
//    case _ => println("Not in Range 1 to 4")
//  }
//
//  matchAgainst(6)

  def sum(list: List[Int]): Int = list match {
    case Nil => 1
    case n :: rest => n+sum(rest)
  }
  var nums=List(1,2,3,4)
  println(sum(nums))

}

