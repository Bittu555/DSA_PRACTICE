package InnerClass

case class Person1(var username: String, var password: String) {
  var age = 0
  var firstName = ""
  var lastName = ""
  var address = None: Option[Address]
}
case class Address(city: String, state: String, zip: String)


object ObjectTest extends App {
  val p = Person1("alvinalexander", "secret")
  println(p.username)
  println(p.address)
}