object Settings {

  val compilerOptions: Seq[String] = Seq(
    "-deprecation", // Warning and location for usages of deprecated APIs.
    "-encoding",
    "utf-8",      // Specify character encoding used by source files.
    "-feature",   // Emit warning and location for usages of features that should be imported explicitly.
    "-unchecked", // Enable additional warnings where generated code depends on assumptions.
    "-language:postfixOps",
    "-Ykind-projector",
    // "-Ysafe-init",
    // "-Yexplicit-nulls", // disallows nulls
    "-language:strictEquality",
    "-Xfatal-warnings"
  )
}
