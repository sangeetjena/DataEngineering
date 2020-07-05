package org.practice.hackerrank.hashing

import scala.util.control.Breaks
 class Node(  var value :Int,var left : Node = null){


  def insert( head: Node, nd : Node): Unit =
  {
    if (head.left != null){
      println("entet to create linked node")
      this.insert(head.left,nd)
    }
    else
    {
      println("enter to insert node")
      head.left=nd
    }
  }
  def prt(head : Node): Unit ={
    if (head.left != null){
      println(head.value)
      this.prt(head.left)
    }
    else{
        println(head.value)
    }
  }
   def check_exists(head : Node,value : Int): String ={
     
     val break = new Breaks
     var head1=head
     var status:String = "not match"
     break.breakable{
      for(i <- 0 to 10){
        if(head1.value==value){
          status = "matched"
          break.break()
        }
        else{
          if (head1.left !=null){
            head1 = head1.left
          }
        }
      }}

     status
   }
   println("enter the constructor")
}

object sparce_hashing {
  def main(args: Array[String]): Unit = {
    println("hello ")

    var arr = new Array[Node](10)
    val lst = List(23,43,12,5,767,322,54,10,10,45,90)

    for (x <- lst){
      if(arr(x%10)==null){
        var x1 = new Node(x,null)
        arr(x%10) = x1
      }
      else{
        arr(x%10).insert(arr(x%10),new Node(x,null))
      }
    }

    for( i <- arr){
      if (i !=null)
      {
        i.prt(i)
      }
    }

    val search = new Node(100,null)
    val ret = search.check_exists(arr(54%10),54)
    println(ret)

  }
}
