package com.epam.scala.login

object LoginValidator {

  def validate(login:NewLogin):Unit={
    if(login.username.toLowerCase == "admin"){
      println("Name can't be \"admin\" and your Name is: " + login.username)
    }
    else if(login.password.toLowerCase.startsWith("z")){
      println("Password can't start from \"z\" and your Password is: " + login.password)
    }
    else if(login.password.toLowerCase == login.username.toLowerCase){
      println("Password can't be equal to username and your Password is: " + login.password + " and Username is: " + login.username)
    }
    else if(login.password.forall(_.isDigit)){
      println("Password can't contains only digits and your Password is: " + login.password)
    }
    else if(login.password != login.confirmPassword){
      println("ConfirmPassword should equal Password and your ConfirmPassword is: " + login.confirmPassword + " and Password is: " + login.password)
    }
    else {
      println("Accepted")
    }
  }

}
