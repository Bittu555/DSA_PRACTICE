package Collection

object MapImpl {
  def main(args: Array[String]): Unit = {
    val student = Map(12 -> "Reena", 13 -> "Micheal", 14 -> "Peter")
    val marks: Map[String, Int] = Map()

    val student1 = scala.collection.mutable.Map(12 -> "Reena", 13 -> "Micheal", 14 -> "Peter")
    student1(12)="hina"
    student1(20)="ramesh"

    println("Keys : " + student.keys)
    println("Values : " + student.values)
    println(student)
    println("Check if student is empty : " + student.isEmpty)
    println("Check if marks is empty : " + marks.isEmpty)

   val stud2 = Map(15 -> "Russel", 16 -> "Mark", 17 -> "Steve")
    stud2.keys.foreach { i =>
      print("Key = " + i)
      println(" Value = " + stud2(i))
    }
if(stud2.contains(15)){
  println("with id 15 there value is "+stud2(15))

}
  }

}
