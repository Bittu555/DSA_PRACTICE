package Assignment

object PayRoll {
  val rate=10.50;
  def paycheck(hours:Double): Double = {
    if(hours<=40) {
      val regularRate:Double=hours*10.50;
       regularRate
    }
    else{
      val regularRate:Double=40*10.50
      val overtime=hours-40
      val overTimePay=overtime*10.50*1.5
       regularRate+overTimePay
    }
  }

  def EmployeeType(employeeType:String,hours:Double): Unit = {
    if(employeeType.equalsIgnoreCase("hourly")){
      val pay=paycheck(hours)
      println(s"amount pay to hourly employee is $pay")
    }
    else if(employeeType.equalsIgnoreCase("salaried")){
      val pay=paycheck(hours)
      print(s"salaried employee no hourly calculated")
    }
    else{
      println("invalid type")
    }
  }

def main(args:Array[String]): Unit = {
  EmployeeType("hourly",40);
  EmployeeType("hourly",45);
  EmployeeType("hourly",25);
  EmployeeType("salaried",45);
}

}
