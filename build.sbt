scalaVersion := "3.1.1"

libraryDependencies ++= Seq(
  ("org.apache.spark" %% "spark-sql" % "3.2.0" % "provided")
    .cross(CrossVersion.for3Use2_13)
)
