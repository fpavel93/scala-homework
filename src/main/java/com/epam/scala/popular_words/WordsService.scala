package com.epam.scala.popular_words

import scala.reflect.internal.util.Collections

class WordsService {
  def mapByRepeat(list: List[String]): Map[String,Int] = {
    val map = list.groupBy(identity).mapValues(_.size)
    map
  }
}
