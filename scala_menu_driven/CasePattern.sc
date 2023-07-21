var i=10;
val day = i match {
  case 0 => "Sunday"
  case 1 => "Monday"
  case 2 => "Tuesday"
  case 3 => "Wednesday"
  case 4 => "Thursday"
  case 5 => "Friday"
  case 6 => "Saturday"
  case _ => "invalid day"   // the default, catch-all
}
var what="1"
what match {
  case "h" => print("hellpo")
  case what => print(s"hii what is $what")
}

i=1
i match {
  case 1 => print("one is a lonely number")
  case x if x==2 || x==3 => println("there is a croud")
  case _ =>print("nothing")
}

i match{
  case x if 0 to 9 contains x => print(s"range in $x")
}