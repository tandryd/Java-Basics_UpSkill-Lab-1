package com.epam.upskill.module5.task2;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("toaster", 302051, 30.6);
        Product p2 = new Product("vacuum cleaner", 302022, 105.99);
        Product p3 = new Product("dishwasher", 302077, 221.51);
        Product p4 = new Product("gas-stove", 302678, 399.50);
        Product p5 = new Product("fridge", 115175, 599.9);

        Payment payment1 = new Payment(Currency.USD, p1, p2, p3, p4, p5);
        payment1.pay(Currency.USD, 1300);
        payment1.pay(Currency.USD, 100);


        System.out.println("________________________________________");
        Payment payment2 = new Payment(Currency.EUR, p1, p2, p4, p5);
        payment2.pay(Currency.EUR, 1150);

        System.out.println("________________________________________");
        Payment payment3 = new Payment(Currency.BYN, p3, p5);
        payment3.pay(Currency.BYN, 1300);
        payment3.pay(Currency.BYN, 1000);

    }
}
