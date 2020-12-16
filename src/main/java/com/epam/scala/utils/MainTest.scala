package com.epam.scala.utils

object MainTest {
  def main(args: Array[String]): Unit = {
    import StringExtensionReg._
    println("sdds@ddd.com".isEmail())
    println("fgd".isBlank())
  }

}
