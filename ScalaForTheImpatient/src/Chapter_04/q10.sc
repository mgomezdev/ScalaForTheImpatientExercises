package Chapter_04

object q10 {
  val h = "Hello"                                 //> h  : String = Hello
  val w = "World"                                 //> w  : String = World
  
  h.zip(w)                                        //> res0: scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((H,W), (e,
                                                  //| o), (l,r), (l,l), (o,d))
}