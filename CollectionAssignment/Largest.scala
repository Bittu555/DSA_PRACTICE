package CollectionAssignment

object Largest {
  def main(args: Array[String]): Unit = {
    var arr=Array(3,5,6,7,8,9)
    var large=largestElement(arr);
    println(large)

  }
  def largestElement(ints: Array[Int]): Int = {
    ints.foldLeft(0)((acc,curr)=>if(curr>acc) curr else acc)
  }

}
