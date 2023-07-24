package FunctionalProgramming

object FunctionInsideFunction extends App {

  var sum = (x: Int, y: Int) => x + y
    val multiply = (x: Int, y: Int) => x * y

    def executeAndPrint(f: (Int, Int) => Int, x: Int, y: Int) {
      val result = f(x, y)
      println(result)
    }

    executeAndPrint(sum, 2, 9) // prints 11
    executeAndPrint(multiply, 3, 9) // prints 27

//  def isEven(x:Int):Boolean=x%2==0
//  val b=isEven(3)
//  print(b)

  def containList(x:List[Int]):Boolean=x.exists(_%2==0)
  println("oddd "+containList(List(1,2,3,5)))
  println("even "+containList(List(12,2,4)))

  var arr=List(1,2,7,7)
  def addspecial(x:List[Int]): Int = {
    x.map(a=>if(a==7) 14 else a ).sum
  }
  print(addspecial(arr))
//  var t=1
//private var sum1=0
//  for(p<-arr){
//    if(p==7) {
//      sum1=sum1+p
//      t=1
//    }else sum1=sum1+p
//  }
//  if(t==1) println(sum1) else println(sum1)
  //var arr.sum
//  println(sum1)
  // println(sum1)

}
