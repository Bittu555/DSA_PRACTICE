package ObjectAndClass


object Main {
  def main(args: Array[String]): Unit = {
    class Employee(name: String)
    val emp = new Employee("John Doe")
    //println(emp.name) // This will print "John Doe"

    // Trying to assign a new value to the 'name' field will result in a compilation error.
    // Uncomment the line below to observe the error.

    // emp.name = "Jane Smith" // This line will give a compilation error.
  }
}
