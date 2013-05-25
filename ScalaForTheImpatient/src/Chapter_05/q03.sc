package Chapter_05

object q03 {
  // create a TIME class with:
  // read only Hours and Minutes
  //method before(other:Time):Boolean which checks if this is before other
  // Time objects are constructed as new Time(hrs,mins) with hrs in 24hr time
  
  class Time(val hours:Int, val mins:Int){
  	require(hours < 24 && hours >=0)
  	require(mins < 60 && mins >= 0 )
  	def before(other:Time) : Boolean = {
  		(other.hours > hours) || (other.hours == hours && other.mins > mins)
  	}
  }
  
  val a = new Time(0,50)                          //> a  : Chapter_05.q03.Time = Chapter_05.q03$Time@74b23210
  val b = new Time(1,00)                          //> b  : Chapter_05.q03.Time = Chapter_05.q03$Time@2dec8909
  
  a.before(b)                                     //> res0: Boolean = true
  b.before(a)                                     //> res1: Boolean = false
}