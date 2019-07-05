import sbt._

object Dependencies {
  lazy val playJson = "com.typesafe.play" %% "play-json" % "2.7.+"
  lazy val okHttp = "com.eed3si9n" %% "gigahorse-okhttp" % "0.5.+"
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.+"
}
