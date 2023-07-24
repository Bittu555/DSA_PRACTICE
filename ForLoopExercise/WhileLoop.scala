package ForLoopExercise

object WhileLoop extends App {
  val days=List("mon","tues","wed","fri")
  var x=0;
  while(x<days.size-1){

    val p=days(x)
    print(p+" ")
    x+=1
  }

}
