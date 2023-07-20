package scala_basic

object StringOperation {
  def main(args:Array[String]): Unit = {
    var s:String="Hello " + "world";
    //length
    println("length"+ s.length)

    //concatenation

    s.foreach(print)


    for(c<-s)print(c+" ")

    s.getBytes.foreach(print)
    // drop first two element
    s.drop(2);
    println("scala".drop(2).take(2).capitalize)
    val s1="hello";
    val s2="hello"
    println(s1==s2)
    val s3=null;
    val s4=null;
    println(s.toUpperCase)
    val s5="egg,milk,butter,coco, puff"
    println(s5)
    var s6=s5.split(", ")
    println(s6)
     val numPattren="[0-9]+".r
    var address="123 main street suit 109s2"
    val matches=numPattren.findAllIn(address).toArray
   // println(matches)
   // matches.foreach(print)
    for(c<-matches)print(c+" ")




  }

}
