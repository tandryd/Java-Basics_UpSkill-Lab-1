/*
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */
package com.epam.upskill.module5.task2;

import java.util.ArrayList;
import java.util.Collections;

public class Payment {
    private Order order;
    private Currency currency;
    private double balance;

    public Payment(Currency currency, Product...products) {
        this.currency = currency;
        ArrayList<Product> productList = new ArrayList<>();
        Collections.addAll(productList, products);
        order = new Order(productList);
        balance = order.getCost() * currency.getRate();
        System.out.println(String.format("Check amount: %.2f %s. You want to pay in %ss. ",
                order.getCost(), "dollars", currency.getName()));
        System.out.println(String.format("You need to pay %.2f %ss.", balance, currency.getName()));
    }

    public void pay(Currency currency, double deposit) {
        if(balance < deposit) {
            System.out.print(String.format("You paid %.2f %ss. ", deposit, currency.getName()));
            double change = deposit - balance;
            System.out.println(String.format("Your change is %.2f %ss.", change, currency.getName()));

        } else if(balance == deposit) {
            System.out.print(String.format("You paid %.2f %ss. ", deposit, currency.getName()));
            System.out.println("Thank you for paying without change.");
        } else {
            System.out.print(String.format("You paid %.2f %ss. ", deposit, currency.getName()));
            balance -= deposit;
            System.out.println(String.format("There is not enough %.2f %ss to pay. ", balance, this.currency.getName()));
        }
    }

    class Order{
        private ArrayList<Product> products;
        private double cost;

        public Order (ArrayList<Product> products) {
            this.products = products;
            cost = getTotalPrice();
        }

        public double getTotalPrice() {
            double totalPrice = 0;
            for (Product product: products) {
                totalPrice += product.getPrice();
            }
            return totalPrice;
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeProduct(Product product){
            products.remove(product);
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "products=" + products +
                    ", cost=" + cost +
                    '}';
        }
    }
}

