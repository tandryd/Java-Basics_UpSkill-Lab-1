/*
2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
package com.epam.upskill.module4.task2.tsk2;

public class Wheel {
    private int diameter;
    private boolean isGood;

    public Wheel() {
    }

    public Wheel(int diameter) {
        this.diameter = diameter;
        this.isGood = true;
    }

    public int getDiameter() {
        return diameter;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGoodWheel() {
        isGood = true;
    }

    void breakWheel() {
        this.isGood = false;
    }
}
