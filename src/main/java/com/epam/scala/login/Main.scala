package com.epam.scala.login

object Main {
  def main(args: Array[String]): Unit = {
    val username = "Ad"
    val password = "ee33"
    val confirmPassword = "ee33"
    val login = NewLogin(username, password, confirmPassword)
    LoginValidator.validate(login)

    val str = LoginValidator.validatePatternMatching(login)
    println(str)
  }
}
