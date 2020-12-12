package com.epam.upskill.module5.task5.enity;

public class Flower extends Product {
    private FlowerType flowerType;

    public Flower(String name, double price, FlowerType flowerType) {
        super(name, price);
        this.flowerType = flowerType;
    }

    @Override
    public Type getType() {
        return flowerType;
    }

    @Override
    public String toString() {
        return getType().getName() +
                " \"" + getName() + '\"' +
                ", price=" + getPrice() + " ruble;";
    }

}
