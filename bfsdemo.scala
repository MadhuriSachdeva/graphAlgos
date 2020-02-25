import scala.runtime.Nothing$

object bfsdemo extends App {
  type Graph = Map[Int, List[Int]]
  var g: Graph = Map(1 -> List(2,4,5), 2 -> List(1, 3), 3 -> List(2, 4), 4 -> List(1, 3), 5 -> List(1))

  def bfs(start: Int, g : Graph): Unit =
  {
    scala.collection.mutable.Set
    var visited = List(start)
    var result =  List(start)
    var ans = g.get(start).toSet.head
    println(ans)
    visited = visited.appendedAll(ans)
    println(visited)
    println("res1 = " + result)

    def loop(visit : List[Int]): Unit = {
      for(x <- visit)
      {
        var ans2 = g.get(x).toList.head.distinct
        if(!visit.contains(ans2)) {
          visited = visited.appendedAll(ans2)
          result = result.appendedAll(ans2)}
        else {}
        println("result = " +result.distinct)
        if (result.size <= 5)
        loop(ans2)
      }}
loop(visited)
  }
bfs(3,g)}

