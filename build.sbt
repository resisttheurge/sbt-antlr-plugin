
lazy val `sbt-antlr-plugin` =
  (project in file("."))
    .settings(`common-settings`: _*)
    .settings(
      name := "sbt-antlr-plugin",
      version := "0.2.0",
      sbtPlugin := true,
      libraryDependencies += "org.antlr" % "antlr4" % "4.5"
    )