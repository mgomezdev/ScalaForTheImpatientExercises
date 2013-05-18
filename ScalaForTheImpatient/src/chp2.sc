object chp2 {
 
 //1
 def findSignum(x:Int) : Int = {
  if (x > 0)
    1
  else if (x < 0)
    -1
  else
    0
  }                                               //> findSignum: (x: Int)Int
  findSignum(1)                                   //> res0: Int = 1
  //2
  val a = {}                                      //> a  : Unit = ()
  //3
  var y = 0;                                      //> y  : Int = 0
  val x: Unit = y = 1                             //> x  : Unit = ()
  //4
  (0 to 10).reverse.foreach(println)              //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
  //5
  def countDown(x:Int) = {
    (0 to x).reverse.foreach(println)
  }                                               //> countDown: (x: Int)Unit
  countDown(5)                                    //> 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
  //6
  def unicodeLoop(x: List[Char]): Long = {
    x.foldLeft(1L)(_*_.toLong)
  }                                               //> unicodeLoop: (x: List[Char])Long
  unicodeLoop("Hello".toList) == 9415087488L      //> res1: Boolean = true
  
  //7
  //see above
  
  //8
  //see above
  
  //9
  def unicodeLoopRecursive(x:List[Char]): Long = {
    def helper(x:List[Char], acc:Long): Long = {
      x match {
        case List() => acc
        case x::xs => helper(xs, acc*x.toLong)
      }
    }
    helper(x,1)
  }                                               //> unicodeLoopRecursive: (x: List[Char])Long
  unicodeLoopRecursive("Hello".toList) == 9415087488L
                                                  //> res2: Boolean = true
  //10
  def pow(x:Int, n:Int = 1): Int = {
    (x,n) match {
      case (x,n) if (n % 2 ==0 && n > 0) => {
        val y = pow(x,n/2)
        y*y
        }
      case (x,n) if (n % 2 == 1 && n > 0) => x*pow(x,n-1)
      case (_,0) => 1
      case (x,n) if (n < 0) => 1 / pow(x,-n)
    }
  }                                               //> pow: (x: Int, n: Int)Int
  pow(2,3) == 8                                   //> res3: Boolean = true
  pow(2)   == 2                                   //> res4: Boolean = true
}