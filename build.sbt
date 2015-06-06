name := "99Problems"

version := "1.0"

scalaVersion := "2.10.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.2" % "test"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-optimize", "-feature")
