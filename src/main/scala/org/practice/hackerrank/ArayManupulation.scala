package org.practice.hackerrank

import scala.util.control.Breaks

/*HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  to .
Any  less than  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
If the value of  is less than , no rounding occurs as the result will still be a failing grade.
For example,  will be rounded to  but  will not be rounded because the rounding would result in a number that is less than .

Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

Function Description

Complete the function gradingStudents in the editor below. It should return an integer array consisting of rounded grades.

gradingStudents has the following parameter(s):

grades: an array of integers representing grades before rounding*/
object ArayManupulation {
  def gradingStudents(grades: Array[Int]): Array[Int] = {
    val arr : Array[Int]=new Array[Int](14)
    val grade : Array[Int] = grades
    val results:Array[Int] = new Array[Int](grade.length)
    val outbreak = new Breaks;
    for (i <- 1 to 13){
      arr(i)= (i+7)*5;
      print(arr(i))
    }
    for (x <- 0 to grade.length-1){
      outbreak.breakable {
        for (elem <- arr) {
          if (grade(x) < 38) {
            results(x)=grade(x)
            outbreak.break
          }
          if (grade(x) <= elem  ) {
            if(elem - grade(x) < 3){
              results(x) =elem
            }
            else {
              results(x) = grade(x)
            }
            outbreak.break
          }
        }
      }
    }
    return results
  }
  def main(args: Array[String]): Unit = {

val x = gradingStudents(Array(25,36,
    6,
    98,
    25,
    97,
    24,
    25,
    70,
    50,
    71,
    30,
    14,
    28,
    100,
    3,
    26,
    61,98))
    for (i <- x){
      println(i)
    }
  }

}
