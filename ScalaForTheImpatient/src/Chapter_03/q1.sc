package Chapter_03

import scala.util.Random
object q1 {
 // sets a to an array of n random ints [0,n)
def getRandomArray(n: Int): Array[Int] ={
	(1 to n) map (_ => Random.nextInt(n)) toArray
}                                                 //> getRandomArray: (n: Int)Array[Int]

 val n = 10                                       //> n  : Int = 10
 val a = getRandomArray(n)                        //> a  : Array[Int] = Array(9, 0, 1, 4, 4, 2, 9, 3, 4, 8)
 
 assert(a.min >= 0)
 assert(a.max < n)
}