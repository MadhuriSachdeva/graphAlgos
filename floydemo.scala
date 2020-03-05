object floydemo extends App {
  val arr = Array.ofDim[Double](4,4)
  var a = Double.PositiveInfinity
  arr(0)(0) =0
  arr(0)(1) =3
  arr(0)(2) =a
  arr(0)(3) =7
  arr(1)(0) =8
  arr(1)(1) =0
  arr(1)(2) =2
  arr(1)(3) =8
  arr(2)(0) =5
  arr(2)(1) =a
  arr(2)(2) =0
  arr(2)(3) =1
  arr(3)(0) =2
  arr(3)(1) =a
  arr(3)(2) =a
  arr(3)(3) =0
  def floy(): Unit =
  {
    for(k <- 0 to 3; i <- 0 to 3; j <- 0 to 3)
      {
        arr(i)(j) = min(arr(i)(j),arr(i)(k)+arr(k)(j))
        if(k == 3)
        println("arr= "+arr(i)(j))
      }
    def min(x : Double, y : Double): Double =
    {
      var ans: Double = x
      if(x < y)
        {
          ans = x
        }
      else
        {
          ans = y
        }
      ans
    }
  }
floy()

}
