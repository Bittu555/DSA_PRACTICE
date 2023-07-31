package ExtendingClass_Assignment


class Person(val name:String,val address:Address)  // val is Important to access the name and address
class Employee(name:String,address: Address,var age:Int) extends Person(name, address)
case class Address (city: String, state: String)
object ExtendingMain extends App {
  val a=Address("chakia","Bihar")
//  val p=new Person("rahul",a)
  val e=new Employee("ramesh",a,25)
 println("age "+ e.age)
  println("name "+ e.name)
  println("Address "+e.address)


}
