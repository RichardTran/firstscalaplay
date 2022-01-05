name := "firstscalaplay"

version := "1.0"

lazy val `firstscalaplay` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"

scalaVersion := "2.13.5"

libraryDependencies ++= Seq(jdbc, ehcache, ws, specs2 % Test, guice)
// For ARM architecture for issue: play framework fat file, but missing compatible architecture
// https://github.com/sbt/io/issues/320
// Solution https://github.com/playframework/playframework/issues/10867
// Uncomment below, or use 'sbt.version=1.6.0-M1' in build.properties
// PlayKeys.fileWatchService := play.dev.filewatch.FileWatchService.jdk7(play.sbt.run.toLoggerProxy(sLog.value))
