name := "rpssl-kata"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.5"

scalacOptions ++= Seq("-deprecation", "-feature")

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.3" % "test"

libraryDependencies += "junit" % "junit" % "4.12" % "test"

libraryDependencies += "org.specs2" %% "specs2" % "2.4.16"
            
