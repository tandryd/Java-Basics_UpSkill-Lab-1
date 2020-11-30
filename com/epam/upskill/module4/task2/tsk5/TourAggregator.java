/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
package com.epam.upskill.module4.task2.tsk5;

import java.util.ArrayList;
import java.util.Comparator;

public class TourAggregator {
    private String nameOfTourOperator;
    private ArrayList<TourPackage> tourPackages;
    private ArrayList<Client> clients;

    TourAggregator(String nameOfTourOperator) {
        this.nameOfTourOperator = nameOfTourOperator;
        tourPackages = new ArrayList<>();
        clients = new ArrayList<>();
    }

    void addTourPackage (TourPackage tour) {
        tourPackages.add(tour);
    }

    void addClient(Client client, TourPackage tour) {
        client.setTourPackage(tour);
        clients.add(client);
    }

    ArrayList<TourPackage> selectByTourPackageType (TourPackageType type){
        ArrayList<TourPackage> packages = new ArrayList<>();
        for (TourPackage tour : tourPackages) {
            if (tour.getType().equals(type)) {
                packages.add(tour);
            }
        }
        return packages;
    }

    ArrayList<TourPackage> selectByMoreOption (Transport transport){
        ArrayList<TourPackage> packages = new ArrayList<>();
        for (TourPackage tour : tourPackages) {
            if (tour.getTransport().equals(transport)) {
                packages.add(tour);
            }
        }
        return packages;
    }

    ArrayList<TourPackage> selectByMoreOption (Transport transport, Food food){
        ArrayList<TourPackage> packages = new ArrayList<>();
        for (TourPackage tour : tourPackages) {
            if (tour.getTransport().equals(transport) && tour.getFood().equals(food)) {
                packages.add(tour);
            }
        }
        return packages;
    }

    ArrayList<TourPackage> selectByMoreOption (Transport transport, Food food, int days){
        ArrayList<TourPackage> packages = new ArrayList<>();
        for (TourPackage tour : tourPackages) {
            if (tour.getTransport().equals(transport) && tour.getFood().equals(food) && tour.getNumberOfDays() == days) {
                packages.add(tour);
            }
        }
        return packages;
    }

    ArrayList<TourPackage> selectByMoreOption (int days){
        ArrayList<TourPackage> packages = new ArrayList<>();
        for (TourPackage tour : tourPackages) {
            if (tour.getNumberOfDays() == days) {
                packages.add(tour);
            }
        }
        return packages;
    }

    static void printTours (ArrayList<TourPackage> packages) {
        if (packages.size() == 0) {
            System.out.println("not found");
            return;
        }
        for (TourPackage tour : packages) {
            System.out.printf("To %s, %s, type: %s, transfer by %s, food: %s, for %d days, price: %.2f euro.\n",
                    tour.getCountry(), tour.getCity(), tour.getType(), tour.getTransport(), tour.getFood(), tour.getNumberOfDays(), tour.getPrice());
        }
    }

    void sortByPrice() {
        tourPackages.sort(Comparator.comparing(TourPackage::getPrice));
    }

    void sortByNumberOfDays() {
        tourPackages.sort(Comparator.comparing(TourPackage::getNumberOfDays));
    }

    static void sortByPrice(ArrayList<TourPackage> tour) {
        tour.sort(Comparator.comparing(TourPackage::getPrice));
    }

    static void sortByNumberOfDays(ArrayList<TourPackage> tour) {
        tour.sort(Comparator.comparing(TourPackage::getNumberOfDays));
    }

    public String getNameOfTourOperator() {
        return nameOfTourOperator;
    }

    public void setNameOfTourOperator(String nameOfTourOperator) {
        this.nameOfTourOperator = nameOfTourOperator;
    }

    public ArrayList<TourPackage> getTourPackages() {
        return tourPackages;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }


    public void setTourPackages(ArrayList<TourPackage> tourPackages) {
        this.tourPackages = tourPackages;
    }
}
