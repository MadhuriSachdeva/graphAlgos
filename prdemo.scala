import scala.util.control.Breaks._
object prdemo extends App {
  val arr = Array.ofDim[Double](5,5)
  var visited : List[Double] = Nil
  var b = Double.PositiveInfinity
  var next : Int = 0
  var vis : Array[Double]=Array(b,b,b,b,b)
  vis(0) = 0
  var adjms : Array[Double]= Array(b,b,b,b,b)
  var min : Double = 123
  var mininde = 12345
  var sum = 0.0
  var a = 0
  arr(0)(0) =a
  arr(0)(1) =2
  arr(0)(2) = a
  arr(0)(3) = a
  arr(0)(4) =1
  arr(1)(0) =2
  arr(1)(1) =a
  arr(1)(2) =2
  arr(1)(3) =7
  arr(1)(4) =3
  arr(2)(0) =a
  arr(2)(1) =2
  arr(2)(2) =a
  arr(2)(3) =2
  arr(2)(4) =7
  arr(3)(0) =a
  arr(3)(1) =7
  arr(3)(2) =2
  arr(3)(3) =a
  arr(3)(4) =2
  arr(4)(0) =1
  arr(4)(1) =3
  arr(4)(2) =7
  arr(4)(3) =2
  arr(4)(4) =a
  def prims(start : Int): Unit =
  {
    println("")
    println("restart prims with start value= "+start)
    if(!visited.contains(start))
      {
        visited = start :: visited
        for(j<- 0 to 4)
          {

            if(arr(start)(j) != 0 ) // all values greater than 0
              {
                var all = arr(start)(j)
                if(adjms(j) > all)    //update adj if value is less
                  {
                    adjms(j) = all
                  }
              }
            if(visited.contains(j))
            {
              adjms(j) = b
            }
            println("adjms=== "+adjms(j))
          }
        for(i <- 0 to 4)
        {
          println("vis=== "+vis(i))
        }
        //fimd min value
       var m =  mini(adjms)

        adjms(mininde) = b // remove from adjms array
        for(i <- 0 to 4)
          {
            println("adjms= "+adjms(i))
          }
        vis(mininde) = min //put min value in vis array
        for(i <- 0 to 4)
          {
            println("vis= "+vis(i))
          }
        println("")

        println("mininde= "+mininde)
        prims(m)
      }
    else
      {
        breakable{
          break()
        }
      }
  }
def mini( ar : Array[Double]): Int =
  {
    min = b
    mininde = 0
    println("calling mini")
    for(i <- 0 to 4)
      {
        if(adjms(i) != Double.PositiveInfinity)
          {
            println("i=="+i)
            if(adjms(i) <= min && adjms(i) != b)
              {
                println("adjms i = "+adjms(i))
                min = adjms(i)
                mininde = i

                println("sum min= "+sum)
              }
          }
        //mininde = i

      }
    println("min value= "+min)
    if(min  == Double.PositiveInfinity)
      {
        breakable{
          break()
        }
      }
    else
    {
      sum +=min
    }
    println("sum min=== "+sum)
    println("index of min value= "+mininde)
    println("")
    mininde
  }
  prims(0)
println("visited= "+visited)
  println("sum= "+sum)

}

/*
arr(0)(0) =a
arr(0)(1) =3
arr(0)(2) = a
arr(0)(3) = a
arr(0)(4) =1
arr(1)(0) =3
arr(1)(1) =a
arr(1)(2) =9
arr(1)(3) =2
arr(1)(4) =2
arr(2)(0) =a
arr(2)(1) =9
arr(2)(2) =a
arr(2)(3) =3
arr(2)(4) =7
arr(3)(0) =a
arr(3)(1) =2
arr(3)(2) =3
arr(3)(3) =a
arr(3)(4) =a
arr(4)(0) =1
arr(4)(1) =2
arr(4)(2) =7
arr(4)(3) =a
arr(4)(4) =a
*/
