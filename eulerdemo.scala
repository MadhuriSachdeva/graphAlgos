object eulerdemo extends App {
  type Graph = Map[Int, List[Int]]
  type Vertex = Int
  var g1 : Graph = Map(0 -> List(1,2,3),1 -> List(0,2),2 -> List(0,1), 3 -> List(0,4),4 -> List(3))
  var g2 : Graph = Map(0 -> List(1,2,3,4),1 -> List(0,2),2 -> List(0,1), 3 -> List(0,4),4 -> List(0,3))
  var g : Graph = Map(0 -> List(1,2,3),1 -> List(0,2,3),2 -> List(0,1), 3 -> List(0,1,4),4 -> List(3))
  var count = 0
  var sum = 0


  def euler(): Unit =
  {
    for(v <- 0 to 4)
      {
        var adj = g.get(v).toList.head
        var degree = adj.length
        println(degree)
        sum = sum + degree
        println("sum = "+sum)
        if(degree % 2 != 0)
        {
          count = count + 1
          println("count = "+count)
        }
      }
    if(sum %2 == 0 && count == 0)
      {
        println("circuit")
      }
    if(sum %2 == 0 && count  == 2)
      {
        println("path")
      }

    else
      {
        println("nothing")
      }


  }





euler()
}
