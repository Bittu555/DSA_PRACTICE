package scala_menu_driven

case class Car(name:String,brand:CarBrand)
case class CarBrand(name:String)
var car=Car("Model bX",CarBrand("tesla"))
print(car)