name := "ScalaGB"

version := "1.0"

scalaVersion := "2.9.0-1"

scalaSource in Compile <<= baseDirectory / "src"

scalaSource in Test <<= baseDirectory / "test"

libraryDependencies <+= scalaVersion { "org.scala-lang" % "scala-swing" % _ }

libraryDependencies += "org.scalatest" %% "scalatest" % "1.6.1" % "test"

libraryDependencies += "junit" % "junit" % "4.8.2" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.6" % "test->default"
