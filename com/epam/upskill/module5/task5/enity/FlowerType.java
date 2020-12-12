package com.epam.upskill.module5.task5.enity;

public enum FlowerType implements Type {
    ROSE("Rose",5),
    CHAMOMILE("Chamomile", 3),
    LILY ("Lily",4),
    CARNATOIN("Carnation",2);

    private String name;
    private int price;

    FlowerType(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
