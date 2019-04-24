name := "foo1"

scalaVersion := "2.12.4"
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.3" % Test
)
scalacOptions ++= Seq("-deprecation", "-feature")

