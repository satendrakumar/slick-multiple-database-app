To Run

Install SBT 0.13, available from http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html

Make sure sbt is in your PATH.

postgres installation => 
$ sudo apt-get install postgresql (If you already have postgres database then no need to install)

for create databse => 
 $ sudo -u postgres psql postgres 
 > create database slickdemo;
 
You then need to clone this project

git clone  https://github.com/satendrakumar06/slickdemo.git

Change into the slickdemo folder.

Run the code example using SBT

$ sbt run

To edit the project in eclipse you can generate the required eclipse project files like this:

$ sbt eclipse
