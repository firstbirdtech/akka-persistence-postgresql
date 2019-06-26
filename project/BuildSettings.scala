import sbt.Keys.{licenses, _}
import sbt.{Def, _}
import bintray.BintrayPlugin.autoImport._
object BuildSettings {

  val commonSettings = Seq(
    organization := "com.firstbird",
    parallelExecution in Test := false,
    concurrentRestrictions in Global += Tags.limit(Tags.Test, 1),
    updateOptions := updateOptions.value.withCachedResolution(true),
    licenses := Seq(("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0"))),
    scalafmtOnCompile := true
  )

  val bintraySettings: Seq[Def.Setting[_]] = Seq(
    bintrayOrganization := Some("firstbird"),
    bintrayRepository := "maven",
    bintrayPackageLabels := Seq("akka", "akka-persistence", "event-sourcing", "cqrs")
  )

}
