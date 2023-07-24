package ForLoopExercise

object ForLoopYield extends App {
val l=List(1,2,3)
val t=List(1,2,3)
  val crossProduct=for {
    x <- l;
    y <- t
  } yield (x,y)
  println(crossProduct)
  val d=for{
    i<-1 to 2
    j<-1 to 2
  }println(s"i=$i, j=$j")

  val arr1=List("bittu","rahul","ramesh","bimlesah")
  val upper=for(e<-arr1) yield e.startsWith("b")
  //for(p<-upper) print(p+" ")
  print(upper)
}
