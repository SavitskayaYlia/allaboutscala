/*
1. object
In Scala, we cannot have static members so Scala has singleton objects
A singleton is a class that can have only one instance, i.e., Object.
You create singleton using the keyword object instead of class keyword.
Since you can't instantiate a singleton object, you can't pass parameters to the primary constructor.
You already have seen all the examples using singleton objects where you called Scala's main method.

2. def main

3. App trait (ctrl+N Go to a particular class  ctrl+H  Open Type Hierarchy)
The App trait can be used to quickly turn objects into executable programs
The App trait encapsulates the main function and more!

App  - alt+f7 Find references
4. args
Since we extended the App trait, we have access to the args variable which holds any start up arguments for our Scala application.
*/

package edu.allaboutscala.ysavitskaya.chapter_1

object task_1 extends App{
  println("Task 1 is running")

  //parametrs from run configuration
  print("Start up arguments are: ")
  println(args.mkString(" , ")
  )
}
