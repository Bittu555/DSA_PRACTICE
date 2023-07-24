package method


  object FunctionSyntax1 extends App {
    // a method that returns a tuple
 def tupple={
   ("hii","i am " ,24, "old")
 }
    var x=tupple
    println(x._1+" "+ x._2 +" ")

    def a=(20,12,34,456,55)
    var p=a
    println(p._1)

    val l=(1,2,3,(4,5,6))

    print(l._4._3)

}
