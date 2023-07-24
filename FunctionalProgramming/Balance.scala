package FunctionalProgramming

import scala.util.control.Breaks.break

object Balance extends App {
//  val arr = List(1, 2, 3);
//  val total = arr.sum
//  var rest = 0
//  for (i <- 0 to arr.length - 1) {
//    rest += total - arr(i)
//
//    if(arr(i)==total-arr) print(true)
//  }


//    if(rest==total-rest) print(true)
//    else print(false);

//    if (arr(i) == total - arr(i)) {
//      print(true)
//    }
//    else if (arr(i) + arr(i+1) == total - arr(i) - arr(i + 1)){
//      print(true)
//    }
  val str="helleh"
  val str2 =str.reverse
  //if(str==str2) print("pallindrome") else print(false)

  val even1=(x:Int)=>x%2==0
  val odd1=(p:Int)=>p%2!=0
  val filtervalue=(predicate:Int=>Boolean, xt:List[Int])=> for( x<-xt; if predicate(x)) yield x
val u=filtervalue(odd1,List(1,2,3,4,5))
  println(u)


    println("Welcome to the Scala worksheet")
    //> Welcome to the Scala worksheet
    val double = (i: Int) => i * 2

    //> double : Int => Int = <function1>
    def higherOrder(x: Int, y: Int => Int) = y(x)
    //> higherOrder: (x: Int, y: Int => Int)Int
    higherOrder(6, double)
    val triple = (i: Int) => i * 3
    higherOrder(6, triple)

    //> res0: Int = 12
    //> triple : Int => Int = <function1>
    //> res1: Int = 18
    def sayHello = (name: String) => {
      "Hello" + " " + name
    }

    //> sayHello: => String => String
    var message = sayHello("Peggy")
    //> message : String = Hello Peggy
    var y = 5
    //> y : Int = 5
    val multiplier = (x: Int) => x * y
    //> multiplier : Int => Int = <function1>
    println(multiplier(10))
    //> res2: Int = 50



}
