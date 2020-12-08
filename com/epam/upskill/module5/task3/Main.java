/*
Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
 */
package com.epam.upskill.module5.task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
    int year = 2020;
    Calendar calendar = new Calendar(year);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

     calendar.addHoliday(LocalDate.parse("01.01."+year, formatter),"New Year");
        calendar.addHoliday(LocalDate.parse("07.01."+year,formatter),"Orthodox Christmas");
        calendar.addHoliday(LocalDate.parse("08.03."+year,formatter),"Women’s Day");
        calendar.addHoliday(LocalDate.parse("01.05."+year,formatter),"Labour Day");
        calendar.addHoliday(LocalDate.parse("09.05."+year,formatter),"Victory Day");
        calendar.addHoliday(LocalDate.parse("03.07."+year,formatter),"Independence Day");
        calendar.addHoliday(LocalDate.parse("07.11."+year,formatter),"October Revolution Day");
        calendar.addHoliday(LocalDate.parse("25.12."+year,formatter),"Catholic Christmas");

        calendar.printHolidays();

    Calendar.Holiday holiday = calendar.removeHoliday("October Revolution Day");
        System.out.println("\nremoved holiday "+holiday);

    }
}
