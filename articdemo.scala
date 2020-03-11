object articdemo extends App {
  type Graph = Map[Int, List[Int]]
  var g : Graph = Map(0 -> List(1,2),1 ->List(0,2,3,4,6),2 -> List(0,1), 3 -> List(1,5), 4 -> List(1,5),5->List(3,4),6->List(1))
  def art(): Unit =
  {
    for(v1 <- 0 to 6)
      {
        //println("vertex v= "+v1)
        var adj = g(v1)
       var m =  g.filter(x => x._1 != v1)
       // println(adj)
        adj.foreach(f = v => {
          var ad = g(v)
         // println("adj values = "+ad)

          var adj1 = ad.filter(_ != v1)
          m = m + (v -> adj1)
        })
     // println(m)
        var h = m.head
        var fir= h._1
       // println("first elm= "+fir)
        var articulation = dfs(fir,m)
        if(articulation.length < 6)
          {
            println("articulatiopn point is "+v1)
            var brid = g(v1)

          }
       // println("dfs = "+dfs(fir,m))


      }
  }
art()

  def dfs(start : Int, g : Graph) : List[Int] =
  {
    var visited = List(start)
    var result = List(start)

    def dfss(start : Int): Unit =
    {
      for(n <- g(start); if !visited.contains(n)) {
        visited = n :: visited
        result = n :: result
        //println(n)
        dfss(n)
      }
    }
    dfss(start)
    result.reverse
  }
 // println(dfs(1,g))



}
