name := """TrinoProject"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)
lazy val myProject = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean, LauncherJarPlugin)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.postgresql" % "postgresql" % "9.4-1200-jdbc41",
  "be.objectify" %% "deadbolt-java" % "2.4.4"
)

libraryDependencies += jdbc

libraryDependencies += evolutions
// https://mvnrepository.com/artifact/mysql/mysql-connector-java
libraryDependencies += "mysql" % "mysql-connector-java" % "6.0.3"

// https://mvnrepository.com/artifact/com.itextpdf/itextpdf
libraryDependencies += "com.itextpdf" % "itextpdf" % "5.5.6"

// https://mvnrepository.com/artifact/com.amazonaws/aws-java-sdk
libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.11.21"

routesGenerator := InjectedRoutesGenerator

fork in run := false