package edu.allaboutscala.ysavitskaya.chapter_2



object task_2_string_interpolation extends App{

  case class Some_case_class(name: String, level: Int)
  val some_case_class_1: Some_case_class = Some_case_class("Number 1", 1)
  val some_case_class_2: Some_case_class = Some_case_class("Number 2", 2)
  val some_case_class_3: Some_case_class = some_case_class_1.copy()
  val some_case_1_2_the_same = some_case_class_1 == some_case_class_2


  //Using String interpolation to print a variable
  println(s"some_case_class_1 value : $some_case_class_1 ")


  //Using String interpolation on object properties
  println(s"some_case_class_1 value : ${some_case_class_1.name} , ${some_case_class_1.level}")
  println(s"some_case_class_1 == some_case_class_2 > : $some_case_1_2_the_same")
  //Using String interpolation to evaluate expressions
  println(s"some_case_class_1.copy() >  : ${some_case_class_1 == some_case_class_3}")

  //Using String interpolation for formatting text
  println(f"${some_case_class_1.name}%20s")
  val float_int: Float = 2.500f
  println(f"${(float_int%.1f).toString()}%20s ")
  println(s"first line first word\tfirst line second word\n\nthird line")

  //escape characters
  println("""some_case_class_1 value : " some_case_class_1 " """)
  println("some_case_class_1 value : \" some_case_class_2 \" ")
  //println(s"some_case_class_1 value : \" some_case_class_1 \" ") //error
  println(
    """    multiline text
      |    will be "here"
      |    and we used stripMargin
    """.stripMargin)
}

