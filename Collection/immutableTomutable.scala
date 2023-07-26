package Collection

object immutableTomutable {
  def main(args: Array[String]): Unit = {
    val student1 = scala.collection.mutable.Map(12 -> "Reena", 13 -> "Micheal", 14 -> "Peter")
    student1(12) = "hina"
    student1(20) = "ramesh"
    println(student1)
    student1+=(1->"hello",2->"bittu",3->"bhae") // addition
    println(student1)
    student1 -= (1,2,3) // delete with key
    println(student1)

    val someNumbers = collection.mutable.Buffer(10,20,30,40,50)

    val listBuilder = List.newBuilder[Int]

    someNumbers.foreach(listBuilder += _)
    val reconstructedList = listBuilder.result
    println(reconstructedList)

  }
}
