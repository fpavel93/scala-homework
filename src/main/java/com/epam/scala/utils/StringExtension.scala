package com.epam.scala.utils

class StringExtension(val string: String) {

  def isBlank(): Boolean = {
    string.size == 0
  }

  def isEmail(): Boolean = {
    string.contains("@")
  }
}

object StringExtensionReg{
  implicit def strToStrExn(string: String): StringExtension = new StringExtension(string)

}
