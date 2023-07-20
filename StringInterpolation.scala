package scala_basic

object StringInterpolation {
    def main(args: Array[String]) {
      val foo = """This is
                    a multiline
                    String"""
      val speech1 = """Four score and
                    seven years ago"""

      println(speech1)

      val name = "Joe"
      val age = 42
      val weight = 180.5

//      println(s"Hello, $name")
     println("$name is $age years old, and weighs $weight%.1f pounds.")
//     // print(raw"foo\nbar")
//
//      // 'raw' interpolator
//    //  println(raw"foo\nbar")
//      val speech =
//        """Four score and
//          seven years ago
//         our fathers""".stripMargin.replaceAll("\n", " ")
//      println(speech)

    }




}
