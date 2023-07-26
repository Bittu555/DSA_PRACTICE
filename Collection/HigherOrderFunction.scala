package Collection

object HigherOrderFunction {
  def main(args: Array[String]): Unit = {
    val number=List(1,2,3,4,5,6)
  val p=  number.map((i:Int)=>i*2)
    println(p)

    def times3(i:Int):Int=i*3
    println(number.map(times3))

    def even(int: Int):Boolean=int%2==0
    println(number.filter(even))

    println(number.partition(_%2==0)) // divide the list into two part
    println(number.find((i:Int)=>i>5)) //
    println(number.drop(2))// drop first 2 element



  }
}
