package InnerClass


class Person(private var name1: String) {
   def name = name1 // accessor  : getter method
  def name_=(aName: String) { name1 = aName } // mutator  : setter method
}
object GetterSetter extends App {
  val p = new Person("Jonathan")
  p.name = "Jony" // setter
  println(p.name) // getter
}