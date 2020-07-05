package org.practice.hackerrank.datastructure

object commoncall {
  def main(args: Array[String]): Unit = {
    val obj = new InbetweenArrayElements()
    val ret = obj.arrayManupularion(Array(Array(1, 5, 3),Array(4, 8, 7),Array(6 ,9, 1)),10)
    println(ret)
  }
}
