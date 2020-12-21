/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
package com.epam.upskill.module4.task2.tsk5;

import java.util.List;

public class OperateTourAggregator {
    public static void main(String[] args) {
        TourAggregator tezTour = new TourAggregator("TEZ TOUR");
        Client client = new Client("George", "Leontiev", 500.20);

        tezTour.addTourPackage(new TourPackage("Spain", "Barcelona", TourPackageType.CRUISE,
                Transport.SHIP, Food.BREAKFAST, 12, 1099.99));
        tezTour.addTourPackage(new TourPackage("Spain", "Salou", TourPackageType.RECREATION,
                Transport.PLANE, Food.ALL_INCLUSIVE, 14, 1699.89));
        tezTour.addTourPackage(new TourPackage("Spain", "Madrid", TourPackageType.EXCURSION,
                Transport.BUS, Food.NOT_INCLUDED, 5, 400.10));
        tezTour.addTourPackage(new TourPackage("Spain", "Malaga", TourPackageType.RECREATION,
                Transport.PLANE, Food.BREAKFAST, 15, 1400.20));
        tezTour.addTourPackage(new TourPackage("Spain", "Barcelona", TourPackageType.TREATMENT,
                Transport.BUS, Food.ALL_INCLUSIVE, 8, 500.80));
        tezTour.addTourPackage(new TourPackage("Italy", "Rome", TourPackageType.EXCURSION,
                Transport.PLANE, Food.ALL_INCLUSIVE, 10, 950.36));
        tezTour.addTourPackage(new TourPackage("Italy", "Venice", TourPackageType.CRUISE,
                Transport.SHIP, Food.BREAKFAST, 20, 1099.91));
        tezTour.addTourPackage(new TourPackage("Italy", "Milan", TourPackageType.SHOPPING,
                Transport.PLANE, Food.BREAKFAST, 3, 399.99));
        tezTour.addTourPackage(new TourPackage("Italy", "Florence", TourPackageType.TREATMENT,
                Transport.TRAIN, Food.ALL_INCLUSIVE, 13, 1099.11));
        tezTour.addTourPackage(new TourPackage("Italy", "Rome", TourPackageType.SHOPPING,
                Transport.CAR, Food.NOT_INCLUDED, 5, 599.50));

        System.out.println("Select by excursion:");
        List<TourPackage> selectByType = tezTour.selectByTourPackageType(TourPackageType.EXCURSION);
        TourAggregator.printTours(selectByType);

        System.out.println("\nSelect by ship:");
        List<TourPackage> selectByOption = tezTour.selectByMoreOption(Transport.SHIP);
        TourAggregator.sortByNumberOfDays(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nSelect by plane and breakfast:");
        selectByOption = tezTour.selectByMoreOption(Transport.PLANE, Food.BREAKFAST);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nSelect by bus, all inclusive and for 7 days:");
        selectByOption = tezTour.selectByMoreOption(Transport.BUS, Food.ALL_INCLUSIVE, 7);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nSelect by bus, all inclusive and for 8 days:");
        selectByOption = tezTour.selectByMoreOption(Transport.BUS, Food.ALL_INCLUSIVE, 8);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nSelect for 5 days:");
        selectByOption = tezTour.selectByMoreOption(5);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

        client.setTourPackage(selectByOption.get(0));
        tezTour.addClient(client);
    }
}
