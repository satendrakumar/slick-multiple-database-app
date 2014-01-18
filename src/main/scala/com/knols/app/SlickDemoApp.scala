package com.knols.app

import scala.slick.driver.JdbcProfile
import java.sql.Date

class SlickDemo(override val profile: JdbcProfile = SlickDBDriver.getDriver) extends DomainComponent with Profile {

  import profile.simple._

  val conn = new DBConnection(profile)

  def test: Unit = {
    conn.dbObject withSession { implicit session: Session =>
      // create  table  selected environment 
      try {
        employees.ddl.create
      } catch {
        case ex: Exception => println(ex.getMessage)
      }
      // insert employees into database
      employees.insert(Employee("satendra", "satendra@knoldus.com", "consultant", Date.valueOf("2013-06-03")))
      employees.insert(Employee("anand", "anand@knoldus.com", "consultant", Date.valueOf("2013-07-03")))

      println("======================retrieve from database ====================")
      employees.list foreach println
      // delete 
      val query = for { emp <- employees if (emp.name === "satendra") } yield emp
      query.delete
      println("======================retrieve after delete ====================")
      employees.list foreach println

    }
  }
}
object SlickDemoApp extends App {
  (new SlickDemo).test
}
