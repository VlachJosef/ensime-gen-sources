name          := "ensime-sbt-gen"

organization  := "ensime"

scalaVersion  := "2.11.7"

managedSources in Compile ++= Seq(new File((managedSourceDirectories in Compile).value.head + "/scala/com/gen/Foogen.scala"))
