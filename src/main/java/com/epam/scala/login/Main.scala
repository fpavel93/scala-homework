package com.epam.scala.login

object Main {
  def main(args: Array[String]): Unit = {
    val username = "Ad"
    val password = "8457845754"
    val confirmPassword = "ad"
    val login = NewLogin(username, password, confirmPassword)
    LoginValidator.validate(login)
  }
}
