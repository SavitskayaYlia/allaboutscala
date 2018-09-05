/*
Open build.sbt file
Add Scala Logging dependency
Verify Scala Logging is in your classpath (sbt shell / External libraries)
Use Scala Logging (import )
cltl+G 17 - Go to a particular line number
*/

package edu.allaboutscala.ysavitskaya.chapter_1

//https://github.com/lightbend/scala-logging/blob/master/src/main/scala/com/typesafe/scalalogging/Logging.scala
import com.typesafe.scalalogging.LazyLogging

object task_4 extends App with LazyLogging {

  //Defines `logger` as a lazy value initialized with an underlying `org.slf4j.Logger`
  logger.info("Firts info line ")
  logger.error("Error line")



}
