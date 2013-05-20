package Chapter_03

object q6 {
  val arrayInput = Array(1,2,3,4,5)               //> arrayInput  : Array[Int] = Array(1, 2, 3, 4, 5)
  val buffInput = Array(5,4,3,2,1)                //> buffInput  : Array[Int] = Array(5, 4, 3, 2, 1)
  
  //option 1
  for(i <- (0 until arrayInput.size).reverse) yield{arrayInput(i)}
                                                  //> res0: scala.collection.immutable.IndexedSeq[Int] = Vector(5, 4, 3, 2, 1)
  //optin 2
  arrayInput.toBuffer.reverse.toArray             //> res1: Array[Int] = Array(5, 4, 3, 2, 1)
  
  //now for buffers
  buffInput.reverse.toBuffer                      //> res2: scala.collection.mutable.Buffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)
}