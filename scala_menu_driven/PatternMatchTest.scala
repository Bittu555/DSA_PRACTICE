package scala_menu_driven


trait Employee
case class ContractEmp(id: String, name: String) extends Employee
case class Developer(id: String, name: String) extends Employee
case class Consultant(id: String, name: String) extends Employee

object PatternMatchTest extends App {
  /*
  * Process joining bonus if
  * :> Developer has ID Starting from "DL" JB: 1L
  * :> Consultant has ID Starting from "CNL": 1L
  */
  def processJoiningBonus(employee: Employee, amountCTC: Double) = employee match {
    case ContractEmp(id, _) => amountCTC
    case Developer(id, _) => if (id.startsWith("DL")) amountCTC + 10000.0 else amountCTC
    case Consultant(id, _) => if (id.startsWith("CNL")) amountCTC + 10000.0 else amountCTC
    /* case Developer(id, _) if id.startsWith("DL") => amountCTC + 10000.0
    case Consultant(id, _) if id.startsWith("CNL") => amountCTC + 10000.0*/
  }

  val developerEmplEligibleForJB = Developer("DL0001", "Alex")
  val consultantEmpEligibleForJB = Consultant("CNL0001", "Henry")
  val developer = Developer("DI0002", "Heith")
  println(processJoiningBonus(developerEmplEligibleForJB, 55000))
  println(processJoiningBonus(consultantEmpEligibleForJB, 65000))
  println(processJoiningBonus(developer, 66000))
}