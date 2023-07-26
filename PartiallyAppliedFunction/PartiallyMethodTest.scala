package PartiallyAppliedFunction

object PartiallyMethodTest extends App {
  def email(to:String,from:String)=(println(to,from))
  def emailcustomerSupport=email("customer@google.com",_:String)
  emailcustomerSupport("bittu@gmail.com")
}
