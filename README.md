sbt-antlr-plugin
===

## Usage

 `project/plugins.sbt`
```scala
resolvers += Resolver.url("bintray-plugins", url("https://dl.bintray.com/resisttheurge/sbt-plugins/"))(Resolver.ivyStylePatterns)
addSbtPlugin("io.zastoupil" % "sbt-antlr-plugin" % "0.1.0")
```

`build.sbt`
```scala
lazy val `your-project` = 
  (project in file("."))
  .enablePlugins(AntlrPlugin)
  .settings(
    compile in Compile <<= (compile in Compile).dependsOn(antlr),
    unmanagedSourceDirectories in Compile += antlrSourceDirectory.value,
    managedSourceDirectories in Compile += antlrBaseOutputDirectory.value
  )
```