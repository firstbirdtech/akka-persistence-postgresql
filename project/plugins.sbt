logLevel := Level.Warn

addSbtPlugin("io.gatling" % "gatling-sbt" % "2.2.1")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0-8-g6d0c3f8")
//addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.4")

// To resolve custom bintray-sbt plugin
resolvers += Resolver.url("2m-sbt-plugin-releases", url("https://dl.bintray.com/2m/sbt-plugin-releases/"))(
  Resolver.ivyStylePatterns
)