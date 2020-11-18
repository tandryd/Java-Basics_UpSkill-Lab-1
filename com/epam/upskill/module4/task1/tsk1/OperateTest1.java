package com.epam.upskill.module4.task1.tsk1;

public class OperateTest1 {
    public static void main(String[] args) {
        Test1 one = new Test1();
        System.out.print("Current variables: ");
        one.printVar();
        System.out.println("\nSum: " + one.getSum());
        System.out.println("Max: " + one.getMax());

        System.out.println("\nChange  the variables");
        one.setA(10);
        one.setB(5);

        System.out.println();
        System.out.print("Current variables: ");
        one.printVar();
        System.out.println("\nSum: " + one.getSum());
        System.out.println("Max: " + one.getMax());
    }
}
