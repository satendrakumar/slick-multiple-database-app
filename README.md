To Run

Install SBT 0.13, available from http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html

Make sure sbt is in your PATH.

Install posgresql and Mysql database and create database slickdemo in both database.
 
then need to clone this project

git clone https://github.com/satendrakumar06/slickformultipledatabases.git


Run the code example using SBT

for test:       
$ export runMode=test  
$ sbt run   

for dev:         
$ export runMode=dev     
$ sbt run     

for prod:   
$ export runMode=prod	      
$ sbt run     

To edit the project in eclipse you can generate the required eclipse project files like this:

$ sbt eclipse
