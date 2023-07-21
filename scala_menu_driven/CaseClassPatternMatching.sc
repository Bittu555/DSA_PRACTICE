case class Person(name:String)

def speak(p:Person): Unit = {
  p match {
    case Person(x) if x=="rahul"=>print(s"$x say , yubba dubaa do")
    case Person(y) if y=="rames"=>print(s"$y hurraahhhhhhh babab")
  }
}
speak(Person("rahul"))

//Matchable it is a trait 