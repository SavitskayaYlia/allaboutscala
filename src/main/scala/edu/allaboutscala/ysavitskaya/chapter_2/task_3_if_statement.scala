package edu.allaboutscala.ysavitskaya.chapter_2

object task_3_if_statement extends App{

  val num_1: Int = 5
  val num_2: Int = 5

  if (num_1 == num_2) {
    println(s" Calculation:")
    println(s" $num_1 == $num_2 > true")
  }
  else if (num_1 < num_2)
    println(s" $num_1 < $num_2 > true")
  else
    println(s" $num_1 > $num_2 > true")

  //if and else clause as expression
  var x1 = 1
  var x2 = 2
  val if_else = if(x1 < x2) (println(s"x1 = $x1\nx2 = $x2\n$x1 < $x2 > x2*x2 = ${x2*x2}" ) ) else (println(s"x1 = $x1\nx2 = $x2\n$x1 > $x2 > x1*x1 =  ${x1*x1}" ) )

}
