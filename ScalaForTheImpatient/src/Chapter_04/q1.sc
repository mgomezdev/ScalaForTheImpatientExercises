package Chapter_04

object q1 {
  val gizmos = Map("this"->10, "that"->20, "shiny"->250)
                                                  //> gizmos  : scala.collection.immutable.Map[String,Int] = Map(this -> 10, that -
                                                  //| > 20, shiny -> 250)
  val discounted = gizmos.mapValues(_ * .9)       //> discounted  : scala.collection.immutable.Map[String,Double] = Map(this -> 9.
                                                  //| 0, that -> 18.0, shiny -> 225.0)

  
 }