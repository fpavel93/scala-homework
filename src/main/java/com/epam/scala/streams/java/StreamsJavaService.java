package com.epam.scala.streams.java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsJavaService {

    void printSortedFriday13(int startYear, int endYear){
        LocalDate startDate = LocalDate.of(startYear, Month.JANUARY, 13);
        LocalDate endDate = LocalDate.of(endYear, Month.DECEMBER, 14);
       /* Stream.iterate(startDate,localDate -> localDate.plusMonths(1))
                .limit(ChronoUnit.MONTHS.between(startDate,endDate))*/
        startDate.datesUntil(endDate, Period.ofMonths(1))
                .filter(localDate -> localDate.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(Collectors.groupingBy(LocalDate::getYear,Collectors.counting()))
                .entrySet().stream()
                .sorted((o1, o2) -> (int)(o2.getValue()-o1.getValue()))
                .forEach(System.out::println);
    }
}
