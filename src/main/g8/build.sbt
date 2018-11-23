import sbt.Keys.scalacOptions
import com.amazonaws.services.s3.model.CannedAccessControlList

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.stdmodel",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "$name$",
    libraryDependencies ++= Seq(
      Dependencies.Library.scalaTest % Test
    ),
    // Library publishing. See ReadMe for details
    s3acl := Some(CannedAccessControlList.BucketOwnerRead),
    publishMavenStyle := false,
    publishTo := {
      val prefix = if (isSnapshot.value) "snapshots" else "releases"
      Some(s3resolver.value(s"My \${prefix} S3 bucket", s3(s"\${prefix}.com.stdmodel")) withIvyPatterns)
    },
    resolvers ++= Seq[Resolver](
      s3resolver.value("Releases resolver", s3("releases.com.stdmodel")).withIvyPatterns,
      s3resolver.value("Snapshots resolver", s3("snapshots.com.stdmodel")).withIvyPatterns
    ),
    scalacOptions ++= Seq(
      "-deprecation", // Emit warning and location for usages of deprecated APIs.
      "-feature", // Emit warning and location for usages of features that should be imported explicitly.
      "-unchecked", // Enable additional warnings where generated code depends on assumptions.
      //"-Xfatal-warnings", // Fail the compilation if there are any warnings.
      //"-Xlint", // Enable recommended additional warnings.
      "-Ywarn-adapted-args", // Warn if an argument list is modified to match the receiver.
      "-Ywarn-dead-code", // Warn when dead code is identified.
      "-Ywarn-inaccessible", // Warn about inaccessible types in method signatures.
      "-Ywarn-nullary-override", // Warn when non-nullary overrides nullary, e.g. def foo() over def foo.
      "-Ywarn-numeric-widen", // Warn when numerics are widened.
      // Play has a lot of issues with unused imports and unsued params
      // https://github.com/playframework/playframework/issues/6690
      // https://github.com/playframework/twirl/issues/105
      "-Xlint:-unused,_"
    )
  )


