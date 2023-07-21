import scala.concurrent.duration.Duration.Inf

/*
Constant patterns (such as case 3 => )
Sequence patterns (such as case List(els : _*) =>)
Tuple patterns (such as case (x, y) =>)
Constructor pattern (such as case Person(first, last) =>)
Type test patterns (such as case p: Person =>)
 */
//trait Matchable extends Any
//def isTruthy(a: Matchable) = a match {
//  case 0 | "" | false => false
//  case _ => true
//}
List(1,2,3).foldRight(0)(_ + _)

List(1,2,3).foldLeft(0)(_ + _)