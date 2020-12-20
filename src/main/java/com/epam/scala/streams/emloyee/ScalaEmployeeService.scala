package com.epam.scala.streams.emloyee

object ScalaEmployeeService {

  def groupBySeniority(employees: List[Employee]): Map[Seniority, Int] = {
    employees.groupBy(employee=>Seniority.findBySalary(employee.getSalary))
      .map(t=>(t._1,t._2.size))
  }

  def main(args: Array[String]): Unit = {
    val employees = List(new Employee(23),
      new Employee(24),
      new Employee(3))

    println(groupBySeniority(employees))
  }
}
