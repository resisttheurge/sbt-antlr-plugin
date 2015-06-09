
lazy val `sbt-antlr-plugin` =
  (project in file("."))
    .settings(`common-settings`: _*)
    .settings(
      name := "sbt-antlr-plugin",
      sbtPlugin := true,
      libraryDependencies += "org.antlr" % "antlr4" % "4.5"
    )