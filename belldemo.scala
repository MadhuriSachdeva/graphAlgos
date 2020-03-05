import scala.util.control.Breaks._
object belldemo extends App {
  val arr = Array.ofDim[Int](4,4)
  var sum0 = Double.PositiveInfinity
  var sum1 = Double.PositiveInfinity
  var sum2 : Double = 0.0
  var sum3 = Double.PositiveInfinity
  arr(0)(0) =0
  arr(0)(1) =0
  arr(0)(2) =0
  arr(0)(3) = -10
  arr(1)(0) =3
  arr(1)(1) =0
  arr(1)(2) =0
  arr(1)(3) =0
  arr(2)(0) =0
  arr(2)(1) =5
  arr(2)(2) =0
  arr(2)(3) =4
  arr(3)(0) =0
  arr(3)(1) =0
  arr(3)(2) =0
  arr(3)(3) =0
  def bell(i : Int): Unit =
  {
    breakable
    {
      for(j <- 0 to 3)
      {
        if(arr(i)(j) > 0 || arr(i)(j) < 0)
        {
          //println("weight = "+arr(i)(j))
          if(i == 0 )
          {

            //println("pointing to node = "+j)
            if(j==0)
            {
              var sum = sum0 + arr(i)(j)
              if(sum < sum0)
              {
                sum0 = sum
                //println("sum (j0)= "+sum0)
              }
              else
              {
                println("sum0 = "+sum0)
              }
            }
            if(j==1)
            {
              var sum = sum0 + arr(i)(j)
              if(sum < sum1)
              {
                sum1 = sum
               // println("sum (j1)= "+sum1)
              }
              else
              {
                println("sum1 = "+sum1)
              }
            }
            if(j==2)
            {
              var sum = sum0 + arr(i)(j)
              if(sum < sum2)
              {
                sum2 = sum
               // println("sum (j2)= "+sum2)
              }
              else
              {
                println("sum2 = "+sum2)
              }
            }
            if(j==3)
            {
              var sum = sum0 + arr(i)(j)
              if(sum < sum3)
              {
                sum3 = sum
               // println("sum (j3)= "+sum3)
              }
              else
                {
                  println("sum3 = "+sum3)
                }
            }
          }
          //end of i ==0
          //start i == 1
          if(i == 1)
          {
            println("j= "+j)
            if(j==0)
            {
              var sum = sum1 + arr(i)(j)
              if(sum < sum0)
              {
                sum0 = sum
                //println("sum (j0)= "+sum0)
              }
              else
              {
                println("sum0 = "+sum0)
              }

            }
            if(j==1)
            {
              var sum = sum1 + arr(i)(j)
              if(sum < sum1)
              {
                sum1 = sum
               // println("sum (j1)= "+sum1)
              }
              else
              {
                println("sum1 = "+sum1)
              }
            }
            if(j==2)
            {
              var sum = sum1 + arr(i)(j)
              if(sum < sum2)
              {
                sum2 = sum
                //println("sum (j2)= "+sum2)
              }
              else
              {
                println("sum2 = "+sum2)
              }
            }
            if(j==3)
            {
              var sum = sum1 + arr(i)(j)
              if(sum < sum3)
              {
                sum3 = sum
                //println("sum (j3)= "+sum3)
              }
              else
              {
                println("sum3 = "+sum3)
              }
            }
          }
          //end i == 1
          // stRT I == 2
          if(i == 2)
          {
            //println("j= "+j)
            if(j==0)
            {
              var sum = sum2 + arr(i)(j)
              if(sum < sum0)
              {
                sum0 = sum
                //println("sum (j0)= "+sum0)
              }
              else
              {
                println("sum0 = "+sum0)
              }
            }
            if(j==1)
            {
              var sum = sum2 + arr(i)(j)
              if(sum < sum1)
              {
                sum1 = sum
               // println("sum (j1)= "+sum1)
              }
              else
              {
                println("sum1 = "+sum1)
              }
            }
            if(j==2)
            {
              var sum = sum2 + arr(i)(j)
              if(sum < sum2)
              {
                sum2 = sum
               // println("sum (j2)= "+sum2)
              }
              else
              {
                println("sum2 = "+sum2)
              }
            }
            if(j==3)
            {
              var sum = sum2 + arr(i)(j)
              if(sum < sum3)
              {
                sum3 = sum
               // println("sum (j3)= "+sum3)
              }
              else
              {
                println("sum3 = "+sum3)
              }
            }
          }
          //end of i ==2
          //start i == 3
          if(i == 3)
          {
            //println("j= "+j)
            if(j==0)
            {
              var sum = sum3 + arr(i)(j)
              if(sum < sum0)
              {
                sum0 = sum
              //  println("sum (j0)= "+sum0)
              }
              else
              {
                println("sum0 = "+sum0)
              }
            }
            if(j==1)
            {
              var sum = sum3 + arr(i)(j)
              if(sum < sum1)
              {
                sum1 = sum
              //  println("sum (j1)= "+sum1)
              }
              else
              {
                println("sum1 = "+sum1)
              }
            }
            if(j==2)
            {
              var sum = sum3 + arr(i)(j)
              if(sum < sum2)
              {
                sum2 = sum
              //  println("sum (j2)= "+sum2)
              }
              else
              {
                println("sum2 = "+sum2)
              }
            }
            if(j==3)
            {
              var sum = sum3 + arr(i)(j)
              if(sum < sum3)
              {
                sum3 = sum
               // println("sum (j3)= "+sum3)
              }
              else
              {
                println("sum3 = "+sum3)
              }
            }
            //end i == 3
          }
        }
      }
    }


  }




def loop(): Unit =
  {
    for(v1 <- 0 to 2; v <- 0 to 3)
      {
        bell(v)
      }
  }
loop()
  println("sum2 = "+sum2)
}
