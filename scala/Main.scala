import java.io.FileOutputStream
import java.nio.ByteBuffer
import scala.util.Using

trait  Channel{
  def write(obj:Any): Unit

}

object Main extends Channel {
  def main(args: Array[String]): Unit = {
    println("Hello world!")
  }

  override def write(obj: Any): Unit = {
    val byte: Array[Byte]=obj match {
      case n: Int =>
        val bb = ByteBuffer.allocate(4)
        bb.putInt(n)
        bb.array()
      case s: String =>
        s.getBytes()

      case _ => throw new Exception(" i dont know")
    }
       Using(new FileOutputStream("/home/kumar/Desktop/DSA Traning/July17scala/hello.txt")) {
         os =>{
           os.write(byte)
           os.flush()
         }

    }


  }
  Main.write("hello2")
}