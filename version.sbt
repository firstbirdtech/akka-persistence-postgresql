val snapshotSuffix = "-SNAPSHOT"

version in ThisBuild := "0.14.0-firstbird-custom-1"

isSnapshot := version.value.endsWith(snapshotSuffix)
