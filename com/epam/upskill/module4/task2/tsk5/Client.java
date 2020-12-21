/*
5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
package com.epam.upskill.module4.task2.tsk5;

public class Client {
    private String firstName;
    private String lastName;
    private double prepay;
    private TourPackage tourPackage;

    Client(String firstName, String lastName, double prepay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.prepay = prepay;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPrepay() {
        return prepay;
    }

    public void setPrepay(double prepay) {
        this.prepay = prepay;
    }

}
