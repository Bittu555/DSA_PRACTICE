//1
var arr=List(1,2,3,4,5,5)
arr.contains(3)
//2
Range(0,16).filter(a=>a%2==1).foreach(p=>println(p))
//3

 var arr1=collection.immutable.List(1,2,3,4,4,5,5)
arr.distinct

var map=collection.immutable.Map("Sammy"->3,"Frankie"->7,"John"->45)

map.keys.foreach{i=>
print("key: "+i)
println(" value: "+map(i))
}

arr.foldLeft(0)((a:Int,b:Int)=>a+b)


