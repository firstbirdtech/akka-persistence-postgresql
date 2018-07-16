import sbt.Keys._
import sbt._

object BuildSettings {

  def commonSettings = Seq(
    parallelExecution in Test := false,
    concurrentRestrictions in Global += Tags.limit(Tags.Test, 1),
    updateOptions := updateOptions.value.withCachedResolution(true)
  )

  lazy val publishSettings = Seq(
    publishMavenStyle := true,
    publishArtifact in Test := false,
    publishTo := {
      if (isSnapshot.value)
        Some(
          "Artifactory Realm" at "https://artifactory.firstbird.com/libs-snapshot-local;build.timestamp=" + new java.util.Date().getTime)
      else
        Some("Artifactory Realm" at "https://artifactory.firstbird.com/libs-release-local")
    }
  )

}
