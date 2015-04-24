organization := "com.xebialabs.restito"
name := "restito-scala"

enablePlugins(GitVersioning)
git.baseVersion := "0.5"

scalaVersion := "2.11.6"
scalacOptions in Test := Seq(
  "-Yrangepos"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
libraryDependencies ++= Seq(
  "com.xebialabs.restito" % "restito" % "0.5",
  "org.specs2" %% "specs2-core"       % "3.5" % "test",
  "org.specs2" %% "specs2-scalacheck" % "3.5" % "test"
)

net.virtualvoid.sbt.graph.Plugin.graphSettings

