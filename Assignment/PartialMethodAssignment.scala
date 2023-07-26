package Assignment

object PartialMethodAssignment extends App {

  def greeting(language:String,name:String)= {

    var greatingInEnglish=(name:String)=>s"hello English man Name is  $name"
    var greatingInSpanish=(name:String)=>s"hello spanish man name is  $name"

    def checkNameStartWithEnglish(name: String): Boolean = {
      name.headOption.exists(a => a.isLower && a.isLetter)
    }

    val message= language match {
      case "English" if checkNameStartWithEnglish(name:String)=>greatingInEnglish(name)
      case _=>greatingInSpanish(name)
    }
    message


  }
  val userType=greeting("english","1ahul")

  print(userType.toString())



}
