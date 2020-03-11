
import scala.util.control.Breaks._
import scala.collection.mutable.ListBuffer
object krusdemo extends App {

  var lst = ListBuffer[Array[Int]]()
  var arr =  Array (0,1 ,2,3,4,5,6,7,8)
  var visited : List[Int] = Nil
  var result : List[Int] = Nil
  var sum = 0


  def edge(source: Int, dest : Int, weight : Int): Unit =
  {
    var arr = new Array[Int](3)
    arr(0)= source
    arr(1) = dest
    arr(2) = weight
    lst = lst += arr
  }
  edge(0,1,4)
  edge(0,7,8)
  edge(1,2,8)
  edge(3,4,9)
  edge(4,5,10)
  edge(1,7,11)
  edge(3,5,14)
  edge(2,3,7)
  edge(7,8,7)
  edge(6,7,1)
  edge(2,8,2)
  edge(5,6,2)
  edge(2,5,4)
  edge(6,8,6)


  def incorder(): Unit =
  {
    breakable {
      val sortarray = lst.sortBy(_ (2))
      for (x <- sortarray)
      {

          val one = x(0)
          val two = x(1)
          val three = x(2)
              // println("")
          //print("one = " + one)
       //   print(two)
        //  print(three)
         // println("")
       // println("")
         /// println("arr(one)= " + arr(one))
        //  println("arr(two)= " + arr(two))
        if(arr(one) == (arr(two)))
          {
            //println("same")
          }
            for (y <- arr)
            {

              if (arr(y).equals(arr(one)))
              {
                arr(y) = arr(two)
              }
            }
        if(!visited.contains(one))
          {
            visited = one :: visited
           // println("vis= " + visited)
          }
        if(!visited.contains(two))
        {
          visited = two :: visited
          //println("vis= " + visited)
        }
        if(visited.length == 9)
          {
            break()
          }

            for (y <- arr)
            {
            //  print(arr(y))
            }
           // println("")

      }

    }
  }
  incorder()
  println("visited= "+visited)
}
