val snapshotSuffix = "-SNAPSHOT"

version in ThisBuild := "0.11.0-firstbird-custom-3"

isSnapshot := version.value.endsWith(snapshotSuffix)
