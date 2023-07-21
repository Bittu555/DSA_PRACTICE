
trait Carr
case class Car(name:String,brand:CarBrand) extends Carr
case class CarBrand(name1:String) extends Carr


object patternMatch extends App{
  def findthenameofcar(carr:Carr)=carr match {
    case Car("Model bX",_) => print("teshla")
    case _=>print("it is a carrr")
  }

  val f=CarBrand("tesla")

  val d=Car("Model bX",f)
  findthenameofcar(d)
}
