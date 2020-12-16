package com.epam.scala.popular_words

object WordsMain {
  def main(args: Array[String]): Unit = {
    val words: List[String] = List("aaa","bbb","cccc","aaa","cccc","cccc")
    val wordsServ = new WordsService();
    val map = wordsServ.mapByRepeat(words)
    println(map)
  }

}
