package com.knols.app

import scala.slick.driver.JdbcProfile
import java.sql.Date

trait Profile {
  val profile: JdbcProfile
}

trait DomainComponent { this: Profile =>
  import profile.simple._
  
  case class Employee(name: String, email: String, designation: String, doj: Date, id: Int = 0)
  class Employees(tag: Tag) extends Table[Employee](tag, "employee") {
    def id = column[Int]("id", O.PrimaryKey , O.AutoInc)
    def name = column[String]("name", O.NotNull, O.DBType("VARCHAR(100)"))
    def email = column[String]("email", O.NotNull, O.DBType("VARCHAR(100)"))
    def designation = column[String]("designation", O.NotNull, O DBType ("VARCHAR(100)"))
    def doj = column[Date]("doj", O.NotNull)
    def * = (name, email, designation, doj, id) <> (Employee.tupled, Employee.unapply)
  }
  val employees= TableQuery[Employees]

}