package Traits_Assignment

class AccountInfo(private var inialAmount:Double) {


  def deposite(amount:Double): Unit = {
if(amount>0){
  inialAmount+=amount
  println(s"deposite amount ${amount}  \ntotal amount ${inialAmount-1}")
}else{
  println("invalid amount")
}
  }
  def withdraw(amount:Double): Unit = {
if(amount>0 && amount<=inialAmount){
  inialAmount-=amount
  println(s"withraw amout ${amount} \n initial amount ${inialAmount-1}")
}else{
  println("invalid withdraw amount")
}
  }

}
object Main extends App {
  val accountInfo=new AccountInfo(1000)
  accountInfo.withdraw(120)
  accountInfo.deposite(2000)


}
