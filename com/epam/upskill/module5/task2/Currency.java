/*
Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */
package com.epam.upskill.module5.task2;

enum Currency {
    BYN("belarusian ruble", 2.59),
    USD("dollar", 1.0),
    EUR("euro", 0.82),
    RUB("russian ruble", 74.27);
    private String name;
    private double rate;

    Currency(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
