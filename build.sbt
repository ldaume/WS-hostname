name := "WS-hostname"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  ws
)     

lazy val root = (project in file(".")).addPlugins(PlayScala)
