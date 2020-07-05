package org.practice.hackerrank.datastructure
import scala.util.control.Breaks
object MergingCommunity {
  def main(args : Array[String]):Unit = {
      val arr : Array[Array[Int]] = Array.ofDim[Int](10,10)
    val break = new Breaks

    break.breakable{
      for (i <- 0 to arr.length-1){
        if (arr(i) contains(1)){
          println("found")
          break.break
        }
        else
          {
            println("not found")
            arr(i):+1

          }

      }}

}
}
