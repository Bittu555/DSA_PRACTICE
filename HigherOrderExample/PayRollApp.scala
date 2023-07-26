package HigherOrderExample


object PayrollApp {
  // Hourly rate for employees
  val hourlyRate: Double = 10.50

  // Calculate weekly paycheck for hourly employees
  def calculatePaycheck(hoursWorked: Double): Double = {
    if (hoursWorked <= 40) {
      hoursWorked * hourlyRate
    } else {
      val regularPay = 40 * hourlyRate
      val overtimePay = (hoursWorked - 40) * hourlyRate * 1.5
      regularPay + overtimePay
    }
  }

  // Function to determine whether an employee is hourly or salaried
  def determineEmployeeType(employeeType: String, hoursWorked: Double): Unit = {
    if (employeeType.equalsIgnoreCase("hourly")) {
      val paycheck = calculatePaycheck(hoursWorked)
      println(s"Hourly employee worked $hoursWorked hours. Weekly paycheck: $$$paycheck")
    } else if (employeeType.equalsIgnoreCase("salaried")) {
      println("Salaried employee. No hourly calculation needed.")
    } else {
      println("Invalid employee type.")
    }
  }

  def main(args: Array[String]): Unit = {
    // Test cases
    determineEmployeeType("hourly", 40) // Hourly employee worked 40 hours. Weekly paycheck: $420.0
    determineEmployeeType("hourly", 45) // Hourly employee worked 45 hours. Weekly paycheck: $498.75
    determineEmployeeType("hourly", 25) // Hourly employee worked 25 hours. Weekly paycheck: $262.5
    determineEmployeeType("salaried", 40) // Salaried employee. No hourly calculation needed.
  }
}

