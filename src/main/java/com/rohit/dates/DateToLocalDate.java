package com.rohit.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDate {
    public static void main(String[] args) {
        //java.util.date to LocalDate
        Date date = new Date();
        System.out.println("java.util.date : " + date);
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("java.time : " + localDateTime);

        //java.sql.date to LocalDate
        java.sql.Date sqlDate = java.sql.Date.valueOf(localDate);
        System.out.println("sqlDate : " + sqlDate);

        System.out.println("sqlDate to LocalDate : "+ sqlDate.toLocalDate());
    }
}
