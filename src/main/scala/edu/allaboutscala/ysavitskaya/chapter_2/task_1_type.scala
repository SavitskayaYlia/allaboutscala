package edu.allaboutscala.ysavitskaya.chapter_2

object task_1_type extends  App{
  //Immutable variables
  println("1. Immutable variables")
  val s_immutable:String = "Some string"
  val int_immutable = 5
  print("int_immutable: ")
  println(int_immutable.getClass())

  //convert from one data type to another
  val number_short: Short = 1
  val short_to_int: Int = number_short
  val int_to_short: Int = short_to_int

  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutsBought: Int = 5
  val bigNumberOfDonuts: Long = 100000000L
  val smallNumberOfDonuts: Short = 1

  //Mutable variables
  println("\n2. Mutable variables")
  var s_mutable: String = "Glazed Donut"
  s_mutable = "Vanilla Donut"

  //Unit and null
  println("\n3. class Unit extends Any with AnyVal")
  val nothing_unit: Unit = ()
  print("nothing_unit: ")
  println(nothing_unit.getClass())
  def foo_unit():Unit = {}
  print("foo_unit: ")
  println(foo_unit.getClass())

  var s_null = "String"
  s_null = null
  print("s_null value: ")
  println(s_null)

  //println(s_null.getClass()) //NullPointerException
  //No initialization
  println("\n4. Declare a variable with no initialization")
  var s_no_initialization: String = _
  s_no_initialization = "initialization"
  println("s_no_initialization: "+ s_no_initialization)

  println("\n5. Using String interpolation to print a variable")
  //We've prefixed the s at the beginning of our println statement.
  //We also used the dollar sign $ to refer to our variable.
  println(s"s_no_initialization: $s_no_initialization")


}
