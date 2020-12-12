package com.epam.upskill.module5.task5.enity;

public class Candy extends Product{
    private CandyType candyType;

    public Candy(String name, int weight, double price, CandyType candyType) {
        super(name, weight, price);
        this.candyType = candyType;
    }

    public Type getType() {
        return candyType;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


