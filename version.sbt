val snapshotSuffix = "-SNAPSHOT"

version in ThisBuild := "0.10.0-firstbird-custom"

isSnapshot := version.value.endsWith(snapshotSuffix)
