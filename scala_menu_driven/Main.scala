package scala_menu_driven
case class employee(name:String,age:Int)
object Main extends App {
//apply methods take care of object construction
  //it generate companion objects fir case class
  // without new keyword by default apply() will handle
  //toString
  var c=employee("bittu",27)
  println("Name of the Employee "+c.name)
  println("age of the Employee "+c.age)

  //by default toString
  println(c)

  //copy
  var c1=c.copy(name = "raju")
   println(c1)
  //pattern matching
  c1 match{
    case employee("bittu",_)=>println("first emp")
    case _=> println("No emp")
  }

}
