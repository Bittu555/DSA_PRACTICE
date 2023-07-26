package Collection

object Country {
  def main(args: Array[String]): Unit = {
    val country_1=List("india","pakistan","srilanka","Algeria")
    val country_2=List("austria","Belgium","canada")

    val country=country_1:::country_2  // concate
    println(country)

    val cont=country_1.:::(country_2) // 1st list then 2nd list
    println(cont)

    val con=List.concat(country_1,country_2) // concate
    println(con)
  }

}
