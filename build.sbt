name := "slickdemoformultipledatabases"

scalaVersion := "2.10.2"

organization := "Knoldus"

libraryDependencies ++= List(
        "com.typesafe.slick"    %%   "slick"     %     "2.0.0-RC1",
        "com.typesafe.akka" 	%% 	 "akka-actor" %     "2.2.0",
        "org.slf4j"              %    "slf4j-api" %     "1.6.4",
        "postgresql"             %  "postgresql"   %    "9.1-901.jdbc4",
        "com.h2database"         %     "h2"        %       "1.3.166" ,
         "mysql"                  %  "mysql-connector-java" %  "5.1.23"
    )    
