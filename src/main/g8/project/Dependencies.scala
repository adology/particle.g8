import sbt._

object Dependencies {


  object Version {
    val specs2 = "3.8.9"
    val silhouette = "5.0.1"
    val akka = "2.5.4"
    val sangria = "1.4.0"
    val slick = "3.2.3"
    val circe = "0.9.3"
    val aws = "1.11.238"
    val scalatra = "2.6.1"
    val jetty = "9.4.7.v20170914"
    val play = "2.6.4" //?
  }

  val resolvers = Seq(
    Resolver.jcenterRepo,

    // GitBucket
    "amateras" at "http://amateras.sourceforge.jp/mvn/",
    "sonatype-snapshot" at "https://oss.sonatype.org/content/repositories/snapshots/",
    "amateras-snapshot" at "http://amateras.sourceforge.jp/mvn-snapshot/",
    Classpaths.typesafeReleases
  )

  object Library {

    lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"

    object AWS {
      val s3 =  "com.amazonaws" % "aws-java-sdk-s3" % Version.aws
      val sageMaker =  "com.amazonaws" % "aws-java-sdk-sagemaker" % Version.aws
      val sageMakerRuntime =  "com.amazonaws" % "aws-java-sdk-sagemakerruntime" % Version.aws
      val sts = "com.amazonaws" % "aws-java-sdk-sts" % Version.aws
    }

    object Play {
      val ws: ModuleID = "com.typesafe.play" %% "play-ws" % Version.play
      val cache: ModuleID = "com.typesafe.play" %% "play-cache" % Version.play
      val test: ModuleID = "com.typesafe.play" %% "play-test" % Version.play
      val specs2: ModuleID = "com.typesafe.play" %% "play-specs2" % Version.play
    }

    object Specs2 {
      val core: ModuleID = "org.specs2" %% "specs2-core" % Version.specs2
      val matcherExtra: ModuleID = "org.specs2" %% "specs2-matcher-extra" % Version.specs2
      val mock: ModuleID = "org.specs2" %% "specs2-mock" % Version.specs2
    }

    object Silhouette {
      val core: ModuleID = "com.mohiva" %% "play-silhouette" % Version.silhouette
      val passwordBcrypt: ModuleID = "com.mohiva" %% "play-silhouette-password-bcrypt" % Version.silhouette
      val persistence: ModuleID = "com.mohiva" %% "play-silhouette-persistence" % Version.silhouette
      val cryptoJca: ModuleID = "com.mohiva" %% "play-silhouette-crypto-jca" % Version.silhouette
      val testkit: ModuleID = "com.mohiva" %% "play-silhouette-testkit" % Version.silhouette
      val persistenceReactiveMongo: ModuleID =
        "com.mohiva" %% "play-silhouette-persistence-reactivemongo" % Version.silhouette
    }

    object Akka {
      val testkit: ModuleID = "com.typesafe.akka" %% "akka-testkit" % Version.akka
    }

    object Sangria {
      val sangria =  "org.sangria-graphql" %% "sangria" % Version.sangria
      val relay =    "org.sangria-graphql" %% "sangria-relay" % Version.sangria
      val playJson = "org.sangria-graphql" %% "sangria-play-json" % "1.0.4"
      val circe = "org.sangria-graphql" %% "sangria-circe" % "1.2.1"
    }

    object Slick {
      val codegen = "com.typesafe.slick" %% "slick-codegen" % Version.slick
      val hikari =  "com.typesafe.slick" %% "slick-hikaricp" % Version.slick
      val mysql =   "mysql" % "mysql-connector-java" % "5.1.34"
    }

    object Circe {
      val core = "io.circe" %% "circe-core" % Version.circe
      val generic = "io.circe" %% "circe-generic" % Version.circe
      val parser = "io.circe" %% "circe-parser" % Version.circe
      val java8 = "io.circe" %% "circe-java8" % Version.circe
    }

    val scalaGuice: ModuleID = "net.codingwell" %% "scala-guice" % "4.1.0"
    val akkaQuartzScheduler: ModuleID = "com.enragedginger" %% "akka-quartz-scheduler" % "1.6.1-akka-2.5.x"
    val playMailer: ModuleID = "com.typesafe.play" %% "play-mailer" % "6.0.1"
    val playMailerGuice: ModuleID = "com.typesafe.play" %% "play-mailer-guice" % "6.0.1"
    val apacheCommonsIO: ModuleID = "commons-io" % "commons-io" % "2.4"
    val playReactiveMongo: ModuleID = "org.reactivemongo" %% "play2-reactivemongo" % "0.12.6-play26"
    val embedMongo: ModuleID = "de.flapdoodle.embed" % "de.flapdoodle.embed.mongo" % "2.0.0"
    val prestoJdbc: ModuleID = "com.facebook.presto" % "presto-jdbc" % "0.198"
    val h2Driver: ModuleID = "com.h2database" % "h2" % "1.4.196"
  }
}
