import sbt._

object Dependencies {

  val scalaRequests = "com.lihaoyi" %% "requests" % "0.1.7"
  val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "1.1.1"
  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
  //val nativePackager = "com.typesafe.sbt" % "sbt-native-packager" % "1.3.21"

  //val commonDependencies: Seq[ModuleID] = Seq(scalaTest % Test, nativePackager)
  val commonDependencies: Seq[ModuleID] = Seq(scalaTest % Test)

  val apiDependencies: Seq[ModuleID] = Seq(scalaRequests,
    scalaXml) ++ commonDependencies

  val calculatorDependencies: Seq[ModuleID] = commonDependencies
}
