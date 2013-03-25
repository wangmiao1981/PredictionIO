import sbt._
import Keys._

object PredictionIOAlgorithmsScalaMahoutBuild extends Build {
  lazy val root = Project(
    id = "root",
    base = file(".")).aggregate(
    commons,
    algo_thresholduserbased,
    algo_knnuserbased,
    algo_slopeone
  ).dependsOn(
    commons,
    algo_thresholduserbased,
    algo_knnuserbased,
    algo_slopeone
  )

  lazy val commons = Project(
    id = "commons",
    base = file("commons"))

  lazy val algo_thresholduserbased = Project(
    id = "algo-thresholduserbased",
    base = file("thresholduserbased")) dependsOn commons

  lazy val algo_knnuserbased = Project(
    id = "algo-knnuserbased",
    base = file("knnuserbased")) dependsOn commons

  lazy val algo_slopeone = Project(
    id = "algo-slopeone",
    base = file("slopeone")) dependsOn commons

}
