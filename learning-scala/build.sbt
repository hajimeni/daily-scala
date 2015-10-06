import sbtassembly.Plugin._
import AssemblyKeys._

name := "learning-scala2"

version := "0.0.1"

scalaVersion := "2.11.5"

organization := "com.github.tanacasino"

scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-Xlint" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  Nil
)

shellPrompt := { state =>
  val branch = if(file("../.git").exists){
    "git branch".lines_!.find{_.head == '*'}.map{_.drop(1)}.getOrElse("")
  } else ""
  s"[${scala.Console.CYAN}${Project.extract(state).currentRef.project}${scala.Console.RESET} :${scala.Console.GREEN}$branch${scala.Console.RESET}] " + "$ "
}

libraryDependencies ++= {
  Seq(
   "org.scalatest"  % "scalatest_2.11" % "2.2.1" % "test"
  )
}

resolvers ++= Seq(
  "snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
  "releases"      at "http://oss.sonatype.org/content/repositories/releases"
)

assemblySettings
