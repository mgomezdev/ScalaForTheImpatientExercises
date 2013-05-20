package Chapter_03

object q4 {
  val input = Array(1,3,-5,2,-1,-9,5)             //> input  : Array[Int] = Array(1, 3, -5, 2, -1, -9, 5)
  val split = input.groupBy(n => n<0).map(_._2)   //> split  : scala.collection.immutable.Iterable[Array[Int]] = List(Array(1, 3, 
                                                  //| 2, 5), Array(-5, -1, -9))
  val buff = split.head.toBuffer                  //> buff  : scala.collection.mutable.Buffer[Int] = ArrayBuffer(1, 3, 2, 5)
  buff.appendAll(split.tail.head)
  buff.toArray                                    //> res0: Array[Int] = Array(1, 3, 2, 5, -5, -1, -9)
  
}