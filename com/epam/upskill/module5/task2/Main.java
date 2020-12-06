/*
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */
package com.epam.upskill.module5.task2;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("toaster", 302051, 30.6);
        Product product2 = new Product("vacuum cleaner", 302022, 105.99);
        Product product3 = new Product("dishwasher", 302077, 221.51);
        Product product4 = new Product("gas-stove", 302678, 399.50);
        Product product5 = new Product("fridge", 115175, 599.9);

        Payment payment1 = new Payment(Currency.USD, product1, product2, product3, product4, product5);
        payment1.pay(Currency.USD, 1300);
        payment1.pay(Currency.USD, 100);

        System.out.println("________________________________________");
        Payment payment2 = new Payment(Currency.EUR, product1, product2, product4, product5);
        payment2.pay(Currency.EUR, 1150);

        System.out.println("________________________________________");
        Payment payment3 = new Payment(Currency.BYN, product3, product5);
        payment3.pay(Currency.BYN, 1300);
        payment3.pay(Currency.BYN, 1000);

    }
}
