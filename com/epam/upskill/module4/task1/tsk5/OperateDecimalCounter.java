package com.epam.upskill.module4.task1.tsk5;

public class OperateDecimalCounter {
    public static void main(String[] args) {
        DecimalCounter firstCounter = new DecimalCounter(); // тест счетчика по умолчанию
        System.out.println("Current value of counter No.1 - " + firstCounter.getCurrentValue());
        System.out.print("firstCounter.reduce(): ");
        firstCounter.reduce();
        System.out.print("firstCounter.increase() * 99: ");
        for (int i = 1; i <= 99; i++) {
            firstCounter.increase();
        }
        System.out.println("Current value of counter No.1 - " + firstCounter.getCurrentValue());
        System.out.print("firstCounter.increase(): ");
        firstCounter.increase();
        System.out.println("Current value of counter No.1 - " + firstCounter.getCurrentValue());
        System.out.print("firstCounter.increase(): ");
        firstCounter.increase();
        System.out.println("Current value of counter No.1 - " + firstCounter.getCurrentValue());
        System.out.println("\n");

        DecimalCounter secondCounter = new DecimalCounter(1, 1, 9);// тест счетчика с заданным диапазоном значений
        System.out.println("Current value of counter No.2 - " + secondCounter.getCurrentValue());
        System.out.print("secondCounter.reduce(): ");
        secondCounter.reduce();
        System.out.println("Current value of counter No.2 - " + secondCounter.getCurrentValue());

        System.out.print("secondCounter.increase() * 6: ");
        for (int i = 1; i <= 6; i++) {
            secondCounter.increase();
        }
        System.out.println("Current value of counter No.2 - " + secondCounter.getCurrentValue());
        System.out.print("secondCounter.increase(): ");
        secondCounter.increase();
        System.out.println("Current value of counter No.2 - " + secondCounter.getCurrentValue());
        System.out.print("secondCounter.increase(): ");
        secondCounter.increase();
        System.out.println("Current value of counter No.2 - " + secondCounter.getCurrentValue());
        System.out.print("secondCounter.increase(): ");
        secondCounter.increase();
        System.out.println("Current value of counter No.2 - " + secondCounter.getCurrentValue());
    }
}
