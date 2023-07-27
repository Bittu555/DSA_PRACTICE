package CollectionAssignment

import scala.io.Source

object Readwords {
  def main(args: Array[String]): Unit = {
    val path="/home/kumar/Desktop/DSA Traning/July17scala/readword.txt"
    Source.fromFile(path).mkString.split("\\s+").filter(_.length>=3).foreach(a=>println(a))
  }
}
