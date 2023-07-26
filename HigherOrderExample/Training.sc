
  println("welcome inthe scala worksheet")
  2 + 3

  val double=(i:Int)=>i*2P
  def higherOder(x:Int,y:Int=>Int)=y(x)

higherOder(6,double)

val triple=(i:Int)=>i*3
  higherOder(4,triple)


  def IsSpecialName(firstName:String, lastName:String):Boolean = {
    firstName == "Donald" && lastName == "Trump"
  }

  def IsVIP(firstName: String, lastName: String, IsSpecialName: (String, String) => Boolean): Boolean = {
    IsSpecialName(firstName, lastName)
  }

//  why we got two different output ?? bcz Trump !=Truman

  IsVIP("Donald","Trump", IsSpecialName)

  IsVIP("Donald","Truman",_ == "Donald" && _ == "Trump")