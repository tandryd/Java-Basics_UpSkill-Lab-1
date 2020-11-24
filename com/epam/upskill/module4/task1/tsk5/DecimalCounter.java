/*
5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
Написать код, демонстрирующий все возможности класса.
 */
package com.epam.upskill.module4.task1.tsk5;

public class DecimalCounter {
    private int currentValue;
    private int minValue;
    private int maxValue;

    public DecimalCounter() {
        this.currentValue = 0;
        this.minValue = 0;
        this.maxValue = 100;
    }

    public DecimalCounter(int currentValue, int minValue, int maxValue) {
        this.currentValue = currentValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    int getCurrentValue() {
        return this.currentValue;
    }

    void increase() {
        currentValue++;
        if(currentValue == maxValue) {
            System.out.println("the highest value is reached");
        } else if (currentValue > maxValue) {
            System.out.println("Trying to go outside the upper range");
            currentValue--;
        }
    }

    void reduce() {
        currentValue--;
        if(currentValue == maxValue) {
            System.out.println("the lowest value is reached.");
        } else if (currentValue < minValue) {
            System.out.println("Trying to go outside the lower range");
            currentValue++;
        }
    }

}
