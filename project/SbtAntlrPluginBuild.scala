import bintray.BintrayPlugin.autoImport._
import sbt._
import sbt.Keys._
object SbtAntlrPluginBuild extends Build {
  lazy val `common-settings` =
    `versioning-settings` ++ `directory-settings` ++ `bintray-settings`

  lazy val `bintray-settings` = Seq(
    publishMavenStyle := false,
    (bintrayRepository in bintray) := "sbt-plugins",
    (bintrayOrganization in bintray) := None
  )

  lazy val `versioning-settings` = Seq(
    organization := "io.zastoupil",
    version := "1.0.0",
    scalaVersion := "2.10.5",
    sbtVersion := "0.13.8",
    licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
  )

  lazy val `directory-settings` =
    `directory-settings-in-compile` ++ `directory-settings-in-test`

  lazy val `directory-settings-in-compile` = Seq(
    (scalaSource in Compile) := (baseDirectory in Compile).value / "src",
    (javaSource in Compile) := (baseDirectory in Compile).value / "src",
    (resourceDirectory in Compile) := (baseDirectory in Compile).value / "resources"
  )

  lazy val `directory-settings-in-test` = Seq(
    (scalaSource in Test) := (baseDirectory in Test).value / "test",
    (javaSource in Test) := (baseDirectory in Test).value / "test",
    (resourceDirectory in Test) := (baseDirectory in Test).value / "test-resources"
  )
}