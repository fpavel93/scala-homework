package com.epam.scala.streams.scala

import java.time.temporal.ChronoUnit
import java.time.{DayOfWeek, LocalDate, Month}

object StreamsScalaService {
    def printSortedFriday13(startYear:Int, endYear:Int): Unit={

      List.range(startYear,endYear)
        .map(year => (year, (1 to 12).count(LocalDate.of(year,_,13).getDayOfWeek == DayOfWeek.FRIDAY)))
        .sortBy(_._2)(Ordering[Int].reverse)
        .foreach(println)
  }
}
