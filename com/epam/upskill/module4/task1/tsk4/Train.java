/*
4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми
пунктами назначения должны быть упорядочены по времени отправления.
 */
package com.epam.upskill.module4.task1.tsk4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Train {
    private final String destination;
    private final String trainNumber;
    private final Date departureTime;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

    public Train(String destination, String trainNumber, Date departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    private static void sortTrainNumber(Train [] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[i].trainNumber.compareTo(trains[j].trainNumber) > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
    }

    private static String printTrainInformation(Train [] trains, String trainNumber) {
        for (Train train : trains) {
            if (train.trainNumber.equalsIgnoreCase(trainNumber)) {
                return "destination: " + train.destination +
                        ", departure time: " + dateFormat.format(train.departureTime);
            }
        }
        return null;
    }

    private static void sortTrainDestination(Train [] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                int compare = trains[i].destination.compareTo(trains[j].destination);
                if (compare > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                } else if (compare == 0) {
                    if (trains[i].departureTime.compareTo(trains[j].departureTime) > 0) {
                        temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Train [] trains = new Train[5];
        trains[0] = new Train("Saint Petersburg", "018Б", dateFormat.parse("18:58"));
        trains[1] = new Train("Moscow", "185П", dateFormat.parse("11:48"));
        trains[2] = new Train("Riga", "021Л", dateFormat.parse("13:50"));
        trains[3] = new Train("Kiev", "095Ш", dateFormat.parse("15:40"));
        trains[4] = new Train("Kiev", "094Б", dateFormat.parse("05:40"));

        sortTrainNumber(trains);
        for (Train train: trains ) {
            System.out.println(train.trainNumber);
        }

        String request = "018Б";
        System.out.printf("%nTrain #%s, ", request);
        System.out.println(printTrainInformation(trains, request) + "\n");
        sortTrainDestination(trains);

        for (Train train : trains) {
            System.out.println(train.destination + " " + train.trainNumber + " - " + dateFormat.format(train.departureTime));
        }
    }
}
