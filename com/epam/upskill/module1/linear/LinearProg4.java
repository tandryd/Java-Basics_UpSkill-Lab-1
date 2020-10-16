package com.epam.upskill.module1.linear;

import java.util.Scanner;

public class LinearProg4 {
    public static void main(String[] args) {

        System.out.print("Введите значение R  в виде nnn,ddd: ");
        Scanner scanner = new Scanner(System.in);
        double initialRealNumber = scanner.nextDouble();

        double result = (initialRealNumber * 1000)%1000 + (int) initialRealNumber/1000.0;
        System.out.println("В обратном порядке= " + result);

    }
}

