name := """play-scala-base"""
organization := "com.codesolutions"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.18"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.2" % Test

// For legacy data / DB modernization examples (H2 for base, easy to swap to Postgres)
libraryDependencies += "com.h2database" % "h2" % "2.2.224"
libraryDependencies += evolutions

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
