package Chapter_03

object q3 {
  val a = Array(1,2,3,4,5)                        //> a  : Array[Int] = Array(1, 2, 3, 4, 5)
  val expected = Array(2,1,4,3,5)                 //> expected  : Array[Int] = Array(2, 1, 4, 3, 5)
  
  val result = (for{
  	n <- 0 until a.length
  	if n % 2 == 0
  	k <- (0 to 1).reverse
  	if n+k < a.length
  }yield(a(n+k))).toArray                         //> result  : Array[Int] = Array(2, 1, 4, 3, 5)
  
  
  assert(result.deep == expected.deep)
}