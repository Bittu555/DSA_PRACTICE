package Assignment

object HofSort {
  def sort(cmp: (String, String)=>Boolean, list: List[String]):List[String] ={
    list.sortWith(cmp)


    //List("Steve", "Tom", "John", "Bob").sortWith(_.compareTo(_) < 0) =
    //  List("Bob", "John", "Steve", "Tom")
  }
  def comparator(a: String, b: String): Boolean ={
    if(a < b) true
    else false
  }
  def sortAlphabetically(list: List[String]):List[String]= {
    //TODO use the sort method with a function to comparate elements
    sort(comparator,list)


  }
  def sortReverseAlphabetically(list: List[String]):List[String]={
    //TODO use the sort method with a function to comparate elements
    sort((a,b)=>comparator(b,a),list)
  }
  def sortIncreasingSize(list: List[String]):List[String]={
    //TODO use the sort method with a function to comparate elements
    sort((a,b)=>a.length<b.length,list)
  }

  def main(args:Array[String]): Unit = {



  val myList = List("Raju", "Bittu", "Anjali", "Rita")
  val sortedAlphabetically = HofSort.sortAlphabetically(myList)
  val sortedReverseAlphabetically = HofSort.sortReverseAlphabetically(myList)
  val sortedIncreasingSize = HofSort.sortIncreasingSize(myList)

  println(sortedAlphabetically)
  println(sortedReverseAlphabetically)
  println(sortedIncreasingSize)

}
}