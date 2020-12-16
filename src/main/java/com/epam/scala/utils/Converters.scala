package com.epam.scala.utils

object Converters {
  implicit class StringExt(str:String){
    def isEmail: Boolean = str.contains("@")&&str.contains(".")
    def isBlank: Boolean = str.size == 0
  }
}
