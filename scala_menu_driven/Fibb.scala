object Fibb extends App {
  def fibbonaci(num:Long):Long = num match{
    case 0|1=>num
    case _ => fibbonaci(num-1)+fibbonaci(num-2)

  }
  print(fibbonaci(9))

}