import scala.util.control.Breaks._
object primdemo extends App {
  val arr = Array.ofDim[Int](5,5)
  //var abc = 0
  var visited : List[Int] = Nil
  var result : List[Int] = Nil
  println("rs "+result)
  arr(0)(0) =2
  arr(0)(1) =2
  arr(0)(2) =0
  arr(0)(3) =0
  arr(0)(4) =1
  arr(1)(0) =2
  arr(1)(1) =0
  arr(1)(2) =2
  arr(1)(3) =7
  arr(1)(4) =3
  arr(2)(0) =0
  arr(2)(1) =2
  arr(2)(2) =0
  arr(2)(3) =2
  arr(2)(4) =7
  arr(3)(0) =0
  arr(3)(1) =7
  arr(3)(2) =2
  arr(3)(3) =0
  arr(3)(4) =2
  arr(4)(0) =1
  arr(4)(1) =8
  arr(4)(2) =7
  arr(4)(3) =2
  arr(4)(4) =0
  def prim(start : Int): Unit =
  {
    if(!visited.contains(start))
    {
      visited = start :: visited
      //result = start :: result
      println("visited v = " + visited)
      min2(start)
    }
  }
  //find min from each row except visited columns
  def min2(i : Int): Int = {
    var min = arr(i)(0)
    if (result.contains(0)) {
      min = 7
    }
    for (j <- 1 to 4) {
      breakable {
        if (arr(i)(j) < min && arr(i)(j) != 0 && i != j && min != 0) {
          min = arr(i)(j)
          arr(i)(j) = min
          println("Min value of each row " + arr(i)(j)) //print min value
          if(visited.contains(j))
            {
              println("end")
              break()
            }
          visited = j :: visited
          println("visited  = " + visited)
          var nextval = visited.head
          println("next val" + nextval)
          if (!result.contains(nextval)) {
            if (!result.contains(i)) {
              result = i :: result
            }
            result = nextval :: result
            println("result =" + result)
            min2(nextval)
          }
          if (visited.contains(nextval)) {
            println("end")
            break()
          }
        }
      }
    }
    min
  }
def loop(): Unit =
  {
    for(v <- 0 to 4)
      {
        prim(v)
      }
  }
loop()
}
