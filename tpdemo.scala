import scala.collection.mutable
import scala.collection.mutable.{ListBuffer, Stack}
object tpdemo extends App {
  type Graph = Map[Int, List[Int]]
  type Vertex = Int
  var g: Graph = Map(0 -> List(),1 -> List(), 2 -> List(3),
    3 -> List(1), 4 -> List(0), 5 -> List(2,0))
  var visited : List[Int] = Nil
  def topologicalsort(v : Int,visited : scala.collection.
  mutable.ListBuffer[Int] , s : scala.collection.mutable.Stack[Int]): Unit ={
    visited += v
    //find adj vertices of v
    var adj = g.get(v).toList.head
    var it = adj.iterator
    while(it.hasNext)
      {
        var i = it.next()
        if(!visited.contains(i))
          topologicalsort(i,visited,s)
      }
    s.push(v)
  }
  def topological(): Unit =
  {
   import scala.collection.mutable.ListBuffer
    var s = new Stack[Int](6)
    var visited = new ListBuffer[Int]
    for(x <- 0 to 5)
      {
        if(!visited.contains(x))
        topologicalsort(x,visited,s)
      }
    while(s.nonEmpty) { print(s.pop())}}
  topological()
}
