lazy val circleci = (project in file("."))
  .settings(
    organization := "moodsdesign.cw",
    version := "1.0.0-SNAPSHOT",
    scalaVersion := "2.12.4",
    name := "circleci-cw-scala",
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.0.4" % Test,
      "org.scalatest" %% "scalatest" % "3.0.4" % Test
    )
  )
