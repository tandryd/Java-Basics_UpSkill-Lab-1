/*
10. Создать класс Airline, спецификация которого приведена ниже.
Определить конструкторы, set- и get- методы и метод  toString(). Создать второй класс,
агрегирующий массив типа Airline, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
package com.epam.upskill.module4.task1.tsk10;

import java.util.ArrayList;
import java.util.Date;

public class FlightSchedule {
    private String airportName;
    private ArrayList<Airline> airlines;

    public FlightSchedule(String airportName, ArrayList<Airline> airlines) {
        this.airportName = airportName;
        this.airlines = airlines;
    }

    void addAirline(String destination, String flightNumber, String planeType, Date departureTime, DayOfWeek [] dayOfWeek) {
        airlines.add(new Airline(destination, flightNumber, planeType, departureTime, dayOfWeek));
    }

    ArrayList<Airline> airlinesToDestination(String destination) {
        ArrayList<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            if(airline.getDestination().equals(destination)) {
                airlines.add(airline);
            }
        }
        return airlines;
    }

    ArrayList<Airline> flightDays (DayOfWeek dayOfWeek) {
        ArrayList<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            for (DayOfWeek day : airline.getDayOfWeek()) {
                if (day == dayOfWeek || day == DayOfWeek.EVERYDAY) {
                    airlines.add(airline);
                    break;
                }
            }
        }
        return airlines;
    }

    ArrayList<Airline> flightDays (DayOfWeek dayOfWeek, Date departureTime) {
        ArrayList<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            for (DayOfWeek day : airline.getDayOfWeek()) {
                if (day == dayOfWeek || day == DayOfWeek.EVERYDAY) {
                    if (airline.getDepartureTime().compareTo(departureTime) >= 0) {
                        airlines.add(airline);
                        break;
                    }

                }
            }
        }
        return airlines;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    ArrayList<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(ArrayList<Airline> airlines) {
        this.airlines = airlines;
    }

}
