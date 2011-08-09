name := "ScalaGB"

version := "1.0"

scalaVersion := "2.9.0-1"

scalaSource in Compile <<= baseDirectory / "src"

libraryDependencies <+= scalaVersion { "org.scala-lang" % "scala-swing" % _ }
