import java.io.FileOutputStream
import java.nio.ByteBuffer
import scala.util.Using
// Problem Statement
// - Separate two jobs into two traits
// - handle data type exceptions at compile time
// Trait - Interface in Java & Abstract

trait ByteEncodable[A] {
  def encode(a: A): Array[Byte]
}

trait Channel {
  def write[A](obj: A, enc: ByteEncodable[A]): Unit
}

object IntByteEncoder extends ByteEncodable[Int] {
  override def encode(a: Int): Array[Byte] = {
    val bb = ByteBuffer.allocate(4)
    bb.putInt(a)
    bb.array()
  }
}

object StringByteEncoder extends ByteEncodable[String] {
  override def encode(a: String): Array[Byte] = a.getBytes
}

case class Person(firstName: String, lastName: String)
object PersonEncoder extends ByteEncodable[Person] {
  override def encode(a: Person): Array[Byte] = {
    a.firstName.getBytes ++ a.lastName.getBytes
  }
}

object FileChannel extends Channel {
  override def write[A](obj: A, enc: ByteEncodable[A]): Unit = {
    val bytes: Array[Byte] = enc.encode(obj)

    // Using - Similar to try-with-resources in Java
    Using(new FileOutputStream("/home/kumar/Desktop/DSA Traning/July17scala/hello.txt")) // to get address this type : pwd 
{ os =>
      os.write(bytes)
      os.flush()
    }
  }
}
FileChannel.write( Person("Samkeet", "Jain"), PersonEncoder)
