package Chapter_03

object q2 {
  val a = Array(1,2,3,4,5)                        //> a  : Array[Int] = Array(1, 2, 3, 4, 5)
  val expected = Array(2,1,4,3,5)                 //> expected  : Array[Int] = Array(2, 1, 4, 3, 5)
  
  for(n <- 0 to (a.length/2) if n%2==0){
   val temp = a(n)
   a(n) = a(n+1)
   a(n+1) = temp
  }
  
  assert(a.deep == expected.deep)
}