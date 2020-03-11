object bridgedemo extends App {

  type Graph = Map[Int, List[Int]]
  var g : Graph = Map(0 -> List(1),1 ->List(0,2),2 -> List(1,3), 3 -> List(2))
  def art(): Unit =
  {
    for(v1 <- 0 to 3)
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
      if(articulation.length < 3)
      {
       // println("articulatiopn point is "+v1)
        bridge(v1)





      }
      // println("dfs = "+dfs(fir,m))


    }
  }
  art()

  def bridge(v1 : Int): Unit =
  {
    var bradj = g(v1)
   // println("bradj= "+bradj)
    bradj.foreach(x => {
     // println("x===="+x)

      var ad1 = g(x).filter(_ != v1) //doesnt conatin 0
      //println("adj1 = "+ad1)
      var ad2 = g(v1).filter(_ != x) // doesnt contain 1
     // println("adj2 = "+ad2)
      var m = g + (v1 -> ad2)
      m = m + (x -> ad1)
     // println(m)
      var h = m.head
      var first= h._1
      var br= dfs(first,m)
    //  println("dfs= "+br)
      if(br.length < 4){
        println("bridges are========")
        println(v1)
        println(x)
        println("")
      }

    })
  }



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
