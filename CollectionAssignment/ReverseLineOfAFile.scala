package CollectionAssignment
import scala.io.Source
import java.io.{BufferedWriter, File, FileWriter}

object ReverseLineOfAFile {
  def main(args: Array[String]): Unit = {
    val inputFilePath=""
    val outputFilePath=""
    val lines=ReadFromFile(inputFilePath)
    val reverseLine=lines.reverse
    val write=WriteInToFile(reverseLine,outputFilePath)
  }
  def ReadFromFile(str: String):List[String]={
    val sourse=Source.fromFile(str)
    val lines=sourse.getLines().toList
    sourse.close()
    lines
  }
  def WriteInToFile(lines: List[String],filepath:String): Unit = {
    val file=new File(filepath)
    val fileWriter=new FileWriter(file)
    val writer=new BufferedWriter(fileWriter)
    try{
      lines.foreach{
        line=>
          writer.write(line)
          writer.newLine()
      }
    }finally {
      writer.close()
    }

  }
}
//note :
//read krne k liye
//Source.fromFile("file path")
//The mkString() method is utilized to display all
// the elements of the list
// in a string along with a separator.
//split(//s+)
