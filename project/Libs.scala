import sbt.*
import Keys.*

object Libs {

  val ZIO = "2.0.13"

  val dependencies = libraryDependencies ++= Seq(
    "org.typelevel"              %% "cats-core"          % "2.9.0",
    "dev.zio"                    %% "zio"                % ZIO,
    "dev.zio"                    %% "zio-test"           % ZIO % "test,it",
    "dev.zio"                    %% "zio-test-sbt"       % ZIO % "test,it",
    "dev.zio"                    %% "zio-prelude"        % "1.0.0-RC19",
    "com.softwaremill.quicklens" %% "quicklens"          % "1.9.2",
    "com.google.protobuf"         % "protobuf-java"      % "3.23.1",
    "com.google.protobuf"         % "protobuf-java-util" % "3.23.1"
  )
}
