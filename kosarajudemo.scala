import scala.collection.immutable.Map
object kosarajudemo extends App {
  type Graph = Map[Int, List[Int]]
  var g : Graph = Map(0->List(2,3),1 -> List(0),2 -> List(1), 3 -> List(4), 4 -> List())

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
  //println(dfs(1,g))

  def transpose(): Graph =
  {
    val newg : Graph = g.foldLeft(Map[Int,List[Int]]().withDefaultValue(List())){
      case (m, (a, bs)) => bs.foldLeft(m)((map, b) => map.updated(b, m(b) :+ a))

    }
    newg
  }

  var dfsresult = dfs(0,g)
  dfsresult = dfsresult.reverse
  println("dfs answer= "+dfsresult)
var tr = transpose()
  dfsresult.foreach(x =>
  {
    println("x= "+x)
    println("strongy connected components= "+dfs(x,tr))
  })


}
