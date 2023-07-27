package Auxiliary_Constraction

object test extends App{
  class Pizza (var crustSize: Int, var crustType: String) {
    // one-arg auxiliary constructor
    def this(crustSize: Int) {
      this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
      println(this)
    }
    // one-arg auxiliary constructor
    def this(crustType: String) {
      this(Pizza.DEFAULT_CRUST_SIZE, crustType)
      println(this)
    }
    // zero-arg auxiliary constructor
    def this() {
      this(14, Pizza.DEFAULT_CRUST_TYPE)
      println(this)
    }
    override def toString = s"A $crustSize inch pizza with a $crustType crust"
  }
  object Pizza {
    val DEFAULT_CRUST_SIZE = 10
    val DEFAULT_CRUST_TYPE = "DOUBLE THIN"
  }

  val p1 = new Pizza(12)
  val p2 = new Pizza("THIN")
  val p3 = new Pizza
}
