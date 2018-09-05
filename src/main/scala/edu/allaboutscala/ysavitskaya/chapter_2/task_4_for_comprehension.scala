package edu.allaboutscala.ysavitskaya.chapter_2

object task_4_for_comprehension extends App{
  //used the keyword to which meant that iteration number 5 was included
  println("waiting 5")
  for (i <- 1 to 5 )
    println(s"i : $i")

  println("\ndon't waiting 5")
  for (j <- 1 until  5 )
    println(s"j : $j")

  println("\nfor with filter")
  for (k <- 1 until  5 if k % 2 == 0)
    println(s"k : $k")

  println("\nfor with filter 2")
  val string_list = List("first" , "second" ,"some thing else")
  for (item  <- string_list if item.indexOf('i') != -1 )
    println(s" $item has i in the position  ${item.indexOf('i')} ")

  println("\nfor yield keyword")
  /*For each iteration of your for loop, yield generates a value which will be remembered.
  It's like the for loop has a buffer you can’t see, and for each iteration of your for loop another item is added to that buffer.
  When your for loop finishes running, it will return this collection of all the yielded values.
  The type of the collection that is returned is the same type that you were iterating over, so a Map yields a Map, a List yields a List, and so on.
  Also, note that the initial collection is not changed; the for/yield construct creates a new collection according to the algorithm you specify.
  */
  val int_list = List(1,2,3,4,5)
  val for_val = for {item  <- int_list if item % 2  == 0 } yield item*2
  println(s"yield is $for_val")

  println("\n2-Dimensional array")
  val n: Int = 5
  val matrix = Array.ofDim[Int](n,n)
  for { i<- 0 until n
        j <- 0 until n }
    matrix(i)(j) = if ((i+1) <= (j+1) ) ( (i+1) * (j+1)) else 0
  for { i<- 0 until n
        j <- 0 until n }
    if (j != 0 ) ( print(s"${matrix(i)(j)} ") ) else  print(s"\n${matrix(i)(j)} ")

}
