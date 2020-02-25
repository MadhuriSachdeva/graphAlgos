object graph extends App {

  type Graph = Map[Int, List[Int]]
  var g : Graph = Map(1 -> List(2,4),2 -> List(1,3),
    3 -> List(2,4), 4 -> List(1,3))

  def dfs(start : Int, g : Graph) : List[Int] =
    {
      var visited = List(start)
      var result = List(start)

      def dfss(start : Int): Unit =
      {
        for(n <- g(start); if !visited.contains(n)) {
          visited = n :: visited
          result = n :: result
          dfss(n)
        }
      }
      dfss(start)
    result.reverse
    }
  println(dfs(1,g))
}