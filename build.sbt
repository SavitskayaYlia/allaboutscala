import sbt.internal.inc.schema.Relations.LibraryDepEntry

name := "allaboutscala"

version := "0.1"

scalaVersion := "2.12.6"


//https://mvnrepository.com/artifact/ch.qos.logback/logback-classic
//https://mvnrepository.com/artifact/com.typesafe.scala-logging/scala-logging
//[info] downloading https://repo1.maven.org/maven2/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar ...
//[info] downloading https://repo1.maven.org/maven2/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar ...

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
