package scala_menu_driven


object PatternMatching extends App {
  val dayOfWeek = "Friday"
  val typeOfDay = dayOfWeek match {
    case "Monday" => "Manic Monday"
    case "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Other working day"
    case someOtherDay if someOtherDay == "Sunday" => "Sleepy Sunday"
    case someOtherDay if someOtherDay == "Saturday" => "Sizzing Saturday"
  }
  print(typeOfDay)
}