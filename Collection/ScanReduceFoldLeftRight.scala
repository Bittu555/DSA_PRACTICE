package Collection

import scala.Console.println

object ScanReduceFoldLeftRight {
  def main(args: Array[String]): Unit = {
    var list=List(1,2,3,4,5,6)
    val seq=Seq(1,5,7,9)
    val listString=List("hello", "man", "how", "are", "you")
    println(list.sum)
    println(seq.sum)

    println("reduce "+ seq.reduce((a,b)=>a+b))
    println("reduce "+ seq.reduce(_-_))
    println("reduceRight "+ seq.reduceRight(_-_))
    println("reduceleft "+ seq.reduceLeft(_-_))

 println(seq.max)
    println("max value"+seq.reduce(_ max _))
    println("max value"+seq.reduce(_ min _))

    println("fold : "+seq.fold(0)((a,b)=>a+b))
    println("scan " +seq.scan(0)(_ + _))
    println("scan concate : " +listString.scan("")((a,b)=>a+ "-" +b))
    println("scan concate : " +list.scan(0)((a,b)=>a+b))
    println("scanleft concate : " +list.scanLeft(0)((a,b)=>a+b))
    println("scanright concate : " +list.scanRight(0)((a,b)=>a+b))

    println("fold "+seq.fold(0)((a,b)=>a+b))
    println("foldleft "+seq.foldLeft(0)((a,b)=>a+b))
    println("foldright "+seq.foldRight(0)((a,b)=>a+b))

// note
    //scan  : some from left // you shold be initilize with 0 or empy string
    //scanleft
    //scanright

    //fold
    //foldleft
    //foldright







  }


}
