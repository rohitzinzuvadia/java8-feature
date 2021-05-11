package com.rohit.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {

    public static void parseLocalDateTime(){
        String dateTime = "2020-05-05T11:10:45";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
        System.out.println("localDateTime : " + localDateTime);

        String dateTime1 = "2020|05|05T11|10|45";
        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime1, DateTimeFormatter.ofPattern("yyyy|MM|dd'T'HH|mm|ss"));
        System.out.println("localDateTime1 : " + localDateTime1);

    }

    public static void formatLocalDateTime(){

    }

    public static void main(String[] args) {
        parseLocalDateTime();

    }
}
