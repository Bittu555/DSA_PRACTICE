val weekDays=List("mon","tue","wed","thu","fri","sat")
val printValue=(weekDays:List[String])=>println(weekDays)

weekDays.map(_=="mon")

val isManicMonday=(x:String)=>(x=="mon"||x=="sat"):Boolean
isManicMonday("mon")
//or
weekDays.map(isManicMonday)

weekDays.filter(isManicMonday)

weekDays.sortBy(_(0))

val someNumber=List(10,20,30,40,50,51)

someNumber.filter(c=>c%2==0)

someNumber.scanLeft(0)(_-_)
//10-10, 20-30, 30-60,40-100,50-150, 51-201, 0-201
//0,-10,-30,-60,-100,-150,-201
someNumber.scan(0)(_-_)

someNumber.foldLeft(0)(_-_)