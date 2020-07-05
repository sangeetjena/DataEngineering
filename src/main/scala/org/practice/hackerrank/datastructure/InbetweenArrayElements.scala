package org.practice.hackerrank.datastructure
import scala.util.control.Breaks
import scala.collection._
class InbetweenArrayElements {
  def arrayManupularion(arr : Array[Array[Int]],n : Int):Int={
    var tmparr = new Array[Int](n+1)
    var max:Int= -9999
    for( i <- 0 to n){
      tmparr(i)=0
    }
    for(x <- arr){

      for (y <- x(0) to x(1)){
          tmparr(y) = tmparr(y) + x(2)
        if (max<tmparr(y)){
          max=tmparr(y)
        }

      }
    }
max
  }
def main(args : Array[String]):Unit={

val x = arrayManupularion(Array(Array(1, 5, 3),Array(4, 8, 7),Array(6 ,9, 1)),10)
println(x)

}
}
