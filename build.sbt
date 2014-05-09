import play.Play.autoImport._
import PlayKeys._

name := "WS-hostname"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.0"

libraryDependencies ++= Seq(
  ws
)     

lazy val root = (project in file(".")).enablePlugins(PlayScala)
