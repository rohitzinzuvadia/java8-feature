package com.rohit.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {

    // String to LocalDate
    public static void parseLocalDate(){
        String date = "2020-04-03";
        LocalDate parseDate = LocalDate.parse(date);
        System.out.println("parseDate : " + parseDate);

        LocalDate date1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("date1 : " + date1);

        String dateValue = "20201231";
        LocalDate localDate1 = LocalDate.parse(dateValue, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate1 : " + localDate1);

        // custom defined date format
        String date2 = "2021|05|07";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate updatedDate = LocalDate.parse(date2, dateTimeFormatter);
        System.out.println("updatedDate : " + updatedDate);


    }

    public static void formatLocalDate(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        String formatDate = localDate.format(dateTimeFormatter);
        System.out.println("formatDate : " + formatDate);

    }
    public static void main(String[] args) {
        parseLocalDate();
        formatLocalDate();
    }
}
